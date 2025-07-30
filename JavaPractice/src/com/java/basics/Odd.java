package com.java.basics;

import java.util.Arrays;

public class Odd {
    public static void main(String[] args){
        //Create a method and call
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //logical
        for(int num : numbers){
            if(num % 2 != 0){
                System.out.println(num+ " ");
            }
        }

        //Stream
        System.out.println("Even numbers using stream API:");
        Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
