package com.inter.face.demo;

public class Client {
    public static void main(String[] args) {
        ILoanProcessor loanProcessor = new ILoanProcessor() {
            @Override
            public void calculate() {

            }
        };
        loanProcessor.calculate();
        loanProcessor.process();
    }
}
