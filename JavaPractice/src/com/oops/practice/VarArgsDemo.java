package com.oops.practice;

public class VarArgsDemo {
    public static void main(String[] args) {
        sum();
        sum(89, 90);
        sum(10,20,30,40,50);
    }

    static void sum(int x, int y){
        System.out.println("Two var ::"+(x+y));
    }
    static void sum(int... marks){
        int sum=0;
        for(int mark : marks){
            sum += mark;
        }
        System.out.println("Sum ::"+sum);
    }
}
