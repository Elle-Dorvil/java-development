package com.pluralsight;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = myScanner.nextLine();

        System.out.println("Hours worked is ");
        float hoursWorked = myScanner.nextFloat();

        System.out.println("Pay rate is $ ");
        float payRate = myScanner.nextFloat();

        System.out.println("My gross pay is ");
        float grossPay = (payRate * hoursWorked );

        System.out.println(" My name is gross pay is " + name + "and" + grossPay );




    }
}
