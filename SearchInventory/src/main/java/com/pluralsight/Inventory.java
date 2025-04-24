package com.pluralsight;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;

public class Inventory {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory () {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(10,"Native Bodywash", 15.00f));
        inventory.add(new Product(20,"Toothbrush", 3.00f));
        inventory.add(new Product(30,"Loofah", 2.99f));
        inventory.add(new Product(40,"EOS Vanilla Lotion", 7.45f));
        inventory.add(new Product(50,"Crest Toothpaste", 3.49f));

        return inventory;
    }
}


