package com.epam.rd.contactbook;

public class Contact {
    private final int EMAILLISTSIZE = 3;
    private final int SOCIALLISTSIZE = 5;
    private String name;
    private ContactInfo phoneNumber;

    private final Email[] emailList = new Email[EMAILLISTSIZE];
    private int amountOfEmails = 0;

    private final Social[] socialList = new Social[SOCIALLISTSIZE];
    private int amountOfSocials = 0;

    public Contact(String contactName) {
        this.name = contactName;
    }

    private class NameContactInfo implements ContactInfo{
        public String getTitle(){
            return "Name";
        }
        public String getValue(){
            return new String(name);
        }
    }
    public static class Email implements ContactInfo{
        private String localPart;
        private String domian;
        public Email(String localPart, String domian){
            this.localPart = localPart;
            this.domian = domian;
        }
        public String getTitle(){
            return "Email";
        }
        public String getValue(){
            return new String(localPart +
                    "@" + domian);
        }
    }
    public static class Social implements ContactInfo{
        private String title;
        private String id;
        public Social(String title, String id){
            this.title = title;
            this.id = id;
        }
        public String getTitle(){
            return new String (title);
        }
        public String getValue(){
            return new String(id);
        }
    }

    public void rename(String newName) {
        if(newName == null || newName.trim().equals(""))
            return;
        name = newName;
    }

    public Email addEmail(String localPart, String domain) {
        if (isEmailListFull())
            return null;
        emailList[amountOfEmails] = new Email(localPart, domain);
        return emailList[amountOfEmails++];
    }


    public Email addEpamEmail(String firstname, String lastname) {
        if (isEmailListFull())
            return null;
        emailList[amountOfEmails] = new Email(firstname, lastname){
            @Override
            public String getTitle(){
                return "Epam Email";
            }
            @Override
            public String getValue(){
                return new String(firstname + "_" + lastname
                        + "@epam.com");
            }
        };
        return emailList[amountOfEmails++];
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        if(phoneNumber != null)
            return null;
        phoneNumber = new ContactInfo(){
            @Override
            public String getTitle(){
                return "Tel";
            }
            @Override
            public String getValue(){
                return new String("+" + code + " " + number);
            }
        };
        return phoneNumber;
    }

    public Social addTwitter(String twitterId) {
        if(isSocialListFull())
            return null;
        Social twitterToAdd = new Social("Twitter", twitterId);
        socialList[amountOfSocials++] = twitterToAdd;
        return twitterToAdd;
    }

    public Social addInstagram(String instagramId) {
        if(isSocialListFull())
            return null;
        Social instagramToAdd = new Social("Instagram", instagramId);
        socialList[amountOfSocials++] = instagramToAdd;
        return instagramToAdd;
    }

    public Social addSocialMedia(String title, String id) {
        if(isSocialListFull())
            return null;
        Social socialToAdd = new Social(title, id);
        socialList[amountOfSocials++] = socialToAdd;
        return socialToAdd;
    }

    public ContactInfo[] getInfo() {
        final int INFOSIZE = amountOfEmails + amountOfSocials + (phoneNumber == null ? 0 : 1) + 1;
        ContactInfo[] infoToReturn = new ContactInfo[INFOSIZE];
        int pointerOnInfo = 1;
        infoToReturn[0] = new NameContactInfo();
        if (phoneNumber != null)
            infoToReturn[pointerOnInfo++] = phoneNumber;
        for (ContactInfo note: emailList){
            if(note == null)
                continue;
            infoToReturn[pointerOnInfo++] = note;
        }
        for (ContactInfo note: socialList){
            if(note == null)
                continue;
            infoToReturn[pointerOnInfo++] = note;
        }
        return infoToReturn;

    }
    private boolean isEmailListFull(){
        return amountOfEmails == EMAILLISTSIZE;
    }
    private boolean isSocialListFull(){
        return amountOfSocials == SOCIALLISTSIZE;
    }
}
