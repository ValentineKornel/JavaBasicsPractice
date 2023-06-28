package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if(color == null || color.length() == 5 || color.length() == 6)
            return false;
        Pattern pattern = Pattern.compile("#[a-f|A-F|0-9]{3,6}");
        Matcher matcher = pattern.matcher(color);
        return matcher.matches();
    }
}





