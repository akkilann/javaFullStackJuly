package com.application.abstractdemo;

public class BranchOne extends Bank{
    @Override
    void carLoan() {
        System.out.println("carLoan of BranchOne");
    }

    @Override
    void housingLoan() {
        System.out.println("house loan of BranchOne");
    }

    @Override
    void eduLoan() {
        System.out.println("education loan of BranchOne");
    }

    void payDetails(){
        System.out.println("method belongs to only BranchOne");

    }
}
