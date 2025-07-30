package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        System.out.println("=== Welcome to the ATM ===");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your request :" + " DEPOSIT, WITHDRAW, CHECK_BALANCE ");
        String action = scanner.next();

        Bank accountA = new Bank(10000.01);

        double depositAmount = 0;
        double withdrawlAmount = 0;

        try {

            switch (action.toUpperCase()) {
                case "DEPOSIT" -> {
                    System.out.println("Enter Amount to deposit : ");
                    depositAmount = scanner.nextDouble();
                    accountA.deposit(depositAmount);
                }
                case "WITHDRAW" -> {
                    System.out.println("Enter Amount to withdraw : ");
                    withdrawlAmount = scanner.nextDouble();
                    accountA.withdraw(withdrawlAmount);
                }
                case "CHECK_BALANCE" -> {
                    System.out.println("Checking balance");
                    System.out.println("Available Balance is ₹ " + accountA.getBalance());
                }
                default -> System.out.println("Incorrect operation ");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation! Please try again.");
        }

    }
}
