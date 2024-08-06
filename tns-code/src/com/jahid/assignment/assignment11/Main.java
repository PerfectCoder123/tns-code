package com.jahid.assignment.assignment11;

public class Main {
    public static void main(String[] args) {
       
        Inventory<Product> productInventory = new Inventory<>();

        Product product1 = new Product("P001", "Laptop", 999.99);
        Product product2 = new Product("P002", "Smartphone", 599.99);

        productInventory.addProduct(product1);
        productInventory.addProduct(product2);

        productInventory.displayInventory();

        productInventory.removeProduct(product1);

        productInventory.displayInventory();
    }
}
