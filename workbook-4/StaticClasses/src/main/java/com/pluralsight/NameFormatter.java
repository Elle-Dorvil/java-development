package com.pluralsight;

public class NameFormatter {



private NameFormatter() {}

    public static String formatter(String firstName, String lastName) {
        return firstName + lastName;
    }

    public static String formatter(String prefix, String firstName, String middleName, String lastName, String suffix){
    StringBuilder newBuilder = new StringBuilder();
    return prefix + firstName + middleName + lastName + suffix;
    }

    public static String formatter(fullName) {

    }





}
