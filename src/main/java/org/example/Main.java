package org.example;

public class Main {
    public static void main(String[] args) {
        // Task 1: BankAccount tasks
        BankAccount myAccount = new BankAccount(500, "My Account");
        myAccount.deposit(100);
        myAccount.printDetails(); // Output should be: My Account's account balance: 600.00

        // Task 2: Bank Transfer task
        // Create two accounts
        BankAccount account1 = new BankAccount(5000, "Larry");
        BankAccount account2 = new BankAccount(300, "Mary");

        // Withdraw 100 dollars from the first account and deposit into the second account
        account1.withdraw(100);
        account2.deposit(100);

        // Print the account details
        System.out.println("\nAccount 1 Details:");
        account1.printDetails(); // Output should be: Larry's account balance: 4900.00

        System.out.println("\nAccount 2 Details:");
        account2.printDetails(); // Output should be: Mary's account balance: 400.00

        // Task 3: Product tasks
        Product product = new Product(4.0, 10, "Gallon of gas");
        product.printProduct();
        product.totalCost();
    }
}

