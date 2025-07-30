package com.basics.quest2;

public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Enter the correct amount to withdraw");
        }else if(amount > balance){
            System.out.println("insufficient fund");
        }else{
            balance -= amount;
            setBalance(balance);
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Enter the correct amount to deposit");
        }else{
            balance += amount;
            setBalance(balance);
            System.out.println("Deposit successful.");
            System.out.println("Updated balance: ₹" + balance);
        }
    }
}
