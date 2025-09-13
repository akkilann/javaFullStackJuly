package com.inter.face.demo;

public interface ICreditCardProcessor {

    void calculate();

    default void process(){
        System.out.println("process from ICreditCardProcessor");
    }
}
