package org.example;

public class Product {
    private double cost;
    private int quantity;
    private String name;

    // Constructor to initialize the attributes
    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    // Method to print the total cost of multiple products
    public void totalCost() {
        System.out.println("Total cost is $" + (cost * quantity));
    }

    // Method to print the product details
    public void printProduct() {
        System.out.println(name + " costs $" + cost + " and " + quantity + " units were purchased");
    }
}
