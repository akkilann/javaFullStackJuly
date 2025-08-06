package com.inher.quest2;

public class Current extends Account{

    double currentBalance;

    public Current(double currentBalance) {
        super(currentBalance);
        this.currentBalance=currentBalance;
    }

    @Override
    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Enter the correct amount to withdraw");
        }else if(amount > currentBalance){
            System.out.println("insufficient fund");
        }else{
            currentBalance -= amount;
            setBalance(currentBalance);
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: ₹" + currentBalance);
        }
    }

    @Override
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Enter the correct amount to deposit");
        }else{
            currentBalance += amount;
            setBalance(currentBalance);
            System.out.println("Deposit successful.");
            System.out.println("Updated balance: ₹" + currentBalance);
        }
    }
}
