package com.pluralsight;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Date {
    public static void main(String[] args) {
        LocalDateTime todayDate = LocalDateTime.now();
        ZonedDateTime localZone = todayDate.atZone(ZoneId.systemDefault());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("MM, d, yyyy");
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("E, MMM d, yyyy hh:ss");


        System.out.println("Today is: " + todayDate.format(dateTimeFormatter));
        System.out.println("Today is: " + todayDate.format(dateTimeFormatter2));
        System.out.println("Today is: " + todayDate.format(dateTimeFormatter3));
        System.out.println("Today is: " + todayDate.format(dateTimeFormatter4));
    }
}
