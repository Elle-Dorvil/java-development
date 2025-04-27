package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> inventory = getInventory();

        listAllProducts(inventory);
    }
    public static List<Product> getInventory(){
       // List<Product> inventory = new ArrayList <>();
       // inventory.add(new Product(1, "Shirt", 4.99));
        // inventory.add(new Product(2, "Shoes",  20.00));
       // inventory.add(new Product(3, "Jacket", 49.99));
       // inventory.add(new Product(4, "Pants",  14.99));
       // inventory.add(new Product(5, "Sunglasses", 6.99));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv));
            String line;
            
        } catch (Exception e){
            throw new RuntimeException(e);


        }
    }



        return inventory;
        String line;
    }
    public static void listAllProducts(List<Product> productList){
        System.out.println("We carry the following inventory: ");
        for (Product product : productList) {
            System.out.println(product);
    }
}
