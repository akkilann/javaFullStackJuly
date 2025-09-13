package com.lambda.problemTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Resturant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cuisine :: ");
        String type = sc.next();

        //Implement method of interface

        Menu menu = value -> {
            switch (value.toUpperCase()) {
                case "CHINESE" -> {
                    return new String[]{"Manchurian","Fried Rice"};
                }
                case "ARABIAN" -> {
                    return new String[]{"Mandi","Shawarma","kozi dajaj"};
                }
                case "AMERICAN" -> {
                    return new String[]{"Burger","Sandwicg"};
                }
                default -> {
                    System.out.println("Incorrect cusine ");
                    return new String[]{};
                }
            }
        };

        for (String food: menu.showMenu(type)) {
            System.out.println(food);
        }
        //with stream
        Arrays.stream(menu.showMenu(type))
                .skip(1)
                .map(String::length)
                .forEach(System.out::println);
        sc.close();
    }
}
