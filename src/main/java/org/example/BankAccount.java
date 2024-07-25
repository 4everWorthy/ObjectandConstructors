package org.example;

public class BankAccount {
    private double balance;
    private final String accountHolderName;

    // Constructor to initialize the attributes
    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to print account details
    public void printDetails() {
        System.out.println(accountHolderName + "'s account balance: $" + balance);
    }
}
