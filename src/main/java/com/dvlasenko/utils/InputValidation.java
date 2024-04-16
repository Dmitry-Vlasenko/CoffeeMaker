package com.dvlasenko.utils;

public class InputValidation {
    public static boolean isValid(String number, int max) {
        if (!number.matches("^\\d+$")) {
            return false;
        }
        int num = Integer.parseInt(number);
        return num >= 0 && num <= max;
    }
}