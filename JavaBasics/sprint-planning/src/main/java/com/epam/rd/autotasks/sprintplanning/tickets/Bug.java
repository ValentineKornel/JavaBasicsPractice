package com.epam.rd.autotasks.sprintplanning.tickets;

public class Bug extends Ticket {
    UserStory itsUserStory;

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (!userStory.isCompleted())
            return null;
        Bug createdBug = new Bug(id, name, estimate, userStory);
        return createdBug;
    }

    private Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        itsUserStory = userStory;
    }

    @Override
    public String toString() {
        return "[Bug " + id + "] " + itsUserStory.name + ": " + name;
    }
}
