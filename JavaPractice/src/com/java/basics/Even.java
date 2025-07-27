package com.training.basic;

import java.util.Arrays;

public class Even {
    public static void main(String[] args){
        //Create a method and call
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23,234, 32423};
        System.out.println("------Even numbers logic :-------");
        //Using regular logic
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }
        System.out.println("------Even nos using stream-----");
        //Using Stream API
        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
