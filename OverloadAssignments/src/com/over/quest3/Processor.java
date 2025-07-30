package com.over.quest3;

public class Processor {

    Processor(){
        System.out.println("Default constrctor");
    }

    // print the squareroot
    void calculate(double x){
        System.out.println("Sq. Root of given number is :: "+Math.sqrt(x));
    }

    // print the product
    void calculate(int x, int y){
        System.out.println("Product of given numbers :: "+ x*y);
    }

    // print the difference
    void calculate(double x, double y){
        System.out.println("Difference of given numbers :: " + (x-y));
    }

    // print x power y
    void calculate(double x,int y){
        System.out.println("x ^ y is :: " + Math.pow(x, y));
    }
    // print the square
    void calculate(int x){
        System.out.println("Square of given number is ::" + Math.pow(x, 2));
    }
}
