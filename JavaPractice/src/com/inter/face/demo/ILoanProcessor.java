package com.inter.face.demo;

public interface ILoanProcessor {

    void calculate();

    default void process(){
        System.out.println("process from IloanProcessor");
    }
}