package com.inher.quest2;

public class Savings extends Account{

    double savingBalance;

    public Savings(double balance) {
        super(balance);
        this.savingBalance = balance;
    }

    @Override
    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Enter the correct amount to withdraw");
        }else if(amount > savingBalance){
            System.out.println("insufficient fund");
        }else{
            savingBalance -= amount;
            setBalance(savingBalance);
            System.out.println("Withdrawal successful from Saving Account.");
            System.out.println("Remaining balance: ₹" + savingBalance);
        }
    }

    @Override
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Enter the correct amount to deposit into from Saving Account");
        }else{
            savingBalance += amount;
            setBalance(savingBalance);
            System.out.println("Deposit successful into Saving Account");
            System.out.println("Updated balance in Saving Account: ₹" + savingBalance);
        }
    }

}
