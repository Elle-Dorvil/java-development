package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("First Name: ");
        String trimmedFirstName = myScanner.nextLine().trim();

        System.out.println("Middle Name: ");
        String trimmedMiddleName = myScanner.nextLine().trim();

        System.out.println("Last Name: ");
        String trimmedLastName = myScanner.nextLine().trim();

        System.out.println("Suffix: ");
        String trimmedSuffix = myScanner.nextLine().trim();

        String fullName = trimmedFirstName;

        fullName = fullName;
        System.out.println(trimmedFirstName + " " + trimmedMiddleName + " " + trimmedLastName + " " + " " + trimmedSuffix);


        if (trimmedMiddleName.isEmpty()){
            fullName = fullName  + " " + trimmedMiddleName;
        } if (trimmedSuffix.isEmpty()) {
           fullName = fullName + " , " + trimmedSuffix;
        } else {
            System.out.println(fullName);


        }


}
}
