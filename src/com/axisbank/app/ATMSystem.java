package com.axisbank.app;

import com.axisbank.account.BankAccount;
import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        System.out.println("=== Welcome to Axis Bank ATM System ===");

        // Create multiple accounts
        System.out.print("How many accounts do you want to create? ");
        int numAccounts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numAccounts; i++) {
            System.out.println("\n--- Enter details for Account " + (i + 1) + " ---");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Account Number: ");
            long accNum = sc.nextLong();

            System.out.print("Enter Initial Balance: Rs.");
            double balance = sc.nextDouble();

            System.out.print("Set 4-digit PIN: ");
            int pin = sc.nextInt();
            sc.nextLine(); 

            BankAccount newAccount = new BankAccount(name, accNum, balance, pin);
            accounts.add(newAccount);
            System.out.println("Account created successfully for " + name);
        }

        // Account selection & operations
        while (true) {
            System.out.println("\n=== Account Selection ===");
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i).getName());
            }
            System.out.println((accounts.size() + 1) + ". Exit");
            System.out.print("Select an account by number: ");
            int choice = sc.nextInt();

            if (choice == accounts.size() + 1) {
                System.out.println("Exiting ATM System. Thank you!");
                break;
            }

            if (choice < 1 || choice > accounts.size()) {
                System.out.println("Invalid selection. Try again.");
                continue;
            }

            BankAccount selectedAccount = accounts.get(choice - 1);

            // Operations menu for selected account
            int option;
            do {
                System.out.println("\n=== ATM Menu for " + selectedAccount.getName() + " ===");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Logout");
                System.out.print("Enter your option: ");
                option = sc.nextInt();

                int enteredPin;
                double amount;

                switch (option) {
                    case 1:
                        System.out.print("Enter PIN: ");
                        enteredPin = sc.nextInt();
                        System.out.print("Enter amount to deposit: Rs.");
                        amount = sc.nextDouble();
                        selectedAccount.deposit(enteredPin, amount);
                        break;

                    case 2:
                        System.out.print("Enter PIN: ");
                        enteredPin = sc.nextInt();
                        System.out.print("Enter amount to withdraw: Rs.");
                        amount = sc.nextDouble();
                        selectedAccount.withdraw(enteredPin, amount);
                        break;

                    case 3:
                        System.out.print("Enter PIN: ");
                        enteredPin = sc.nextInt();
                        selectedAccount.printBalance(enteredPin);
                        break;

                    case 4:
                        System.out.println("Logging out...");
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                }

            } while (option != 4);
        }

        sc.close();
    }
}
