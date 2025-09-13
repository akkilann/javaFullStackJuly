package com.inter.face.demo;

public class Employee implements ILoanProcessor,ICreditCardProcessor{

    @Override
    public void calculate() {
        System.out.println("calculate method");
    }

    @Override
    public void process() {
        ILoanProcessor.super.process();
    }

}
