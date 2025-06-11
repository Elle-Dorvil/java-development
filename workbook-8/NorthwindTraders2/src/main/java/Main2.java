package com.pluralsight;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("This application needs a Username and a Password to run");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    username,
                    password
            );

            String query = "SELECT ProductId, ProductName, UnitPrice, UnitsInStock";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet results = preparedStatement.executeQuery();

            List<Product productList> =ArrayList

            while (results.next()) {
                /*String firstName = results.getString(1);
                String lastName = results.getString(2);*/

                String productName = results.getString("ProductName");
                int productId = results.getInt("ProductId");
                int UnitPrice = results.getInt("UnitPrice");
                int UnitsInStock = results.getInt("UnitsInStock");

                System.out.println("Product ID: " + productId);
                System.out.println("Product Name: " + productName );
                System.out.println("Unit Price:" + UnitPrice);
                System.out.println("Units In Stock" + UnitsInStock);
                System.out.println("-----------------------------------------");
            }

            results.close();
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
