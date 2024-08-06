package com.jahid.assignment.assignment11;

import java.util.ArrayList;
import java.util.List;

class Inventory<T extends Product> {
    private List<T> products;
    
    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public void removeProduct(T product) {
        products.remove(product);
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (T product : products) {
                System.out.println(product);
            }
        }
    }   
}