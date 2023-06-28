package com.epam.rd.autotasks.words;

import java.util.Arrays;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (sample == null || words == null || words.length == 0)
            return 0;
        int counter = 0;
        for(String word : words){
            if (word.strip().equalsIgnoreCase(sample.strip()))
                counter++;
        }
        return counter;
    }

    public static String[] splitWords(String text) {
        if (text == null || text.isBlank() || text.matches("[,.;: ?!]+"))
            return null;
        //return text.split("[,.;: ?!]+");
        String[] stringArray = text.split("[,.:; ?!]+");
        StringBuilder str = new StringBuilder();
        for(String string : stringArray){
            if (string.equals(""))
                continue;
            str.append(string + ",");
        }
        System.out.println(str.toString());
        return str.toString().split(",");
    }

    public static String convertPath(String path, boolean toWin) {
        return null;
        //if (toWin && path.matches("(\\|C:User|C:)?(\\\\w+)*"))
    }

    public static String joinWords(String[] words) {
        if (words == null || words.length == 0)
            return null;
        StringBuilder str = new StringBuilder();
        for (String word : words){
            if (word.equals(""))
                continue;
            str.append(word + ", ");
        }
        if (str.length() == 0)
            return null;
        str.delete(str.length() - 2, str.length());
        return "[" + str.toString() + "]";
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}