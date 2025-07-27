package com.training.basic;

public class Calc {

    public static void main(String[] args){
        int a=19;
        int b=20;

        String option="/"; //+ - / *
        switch(option) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Incorrect operation ");
        }
    }
}