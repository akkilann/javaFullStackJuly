package com.training.basic;

public class Ternary {
    public static void main(String args[]){

        int a=26;
        int b=27;
        String str = a>b ? "A is greater" : "b is greater";
        System.out.println(str);

        String name = "Akilan";
        System.out.println(name.equalsIgnoreCase("Akilan") ? "Welcome User " + name : "Incorrect user");
    }
}
