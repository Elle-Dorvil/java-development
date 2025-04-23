package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {
    public static void main(String[] args) {

        try {
          //  FileReader fileReader = new FileReader("employee.csv");
          //  BufferedReader bufferedReader= new BufferedReader(fileReader);


            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.cvs"));

            String line;
            System.out.println("Employee Payroll");
            System.out.println("Id"+ "|");


            while ((line = bufferedReader.readLine()) != null) {
            }

            bufferedReader.close();

             } catch (Exception ex) {
                System.out.println("There has been an error!");

            }


}
}