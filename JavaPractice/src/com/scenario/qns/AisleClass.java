package com.scenario.qns;

public class AisleClass {
    void calc(int x){
        System.out.println("Calling int method" + x);
    }

    void calc(Integer x){
        System.out.println("Calling integer method" + x);
    }

    void calc(double x){
        System.out.println("Calling double method" + x);
    }

    void calc(Double x){
        System.out.println("Calling Double method" + x);
    }

    void print(String... names){
        System.out.println("Printing names");
    }

    void print(String names){
        System.out.println("Printing name");
    }
}
