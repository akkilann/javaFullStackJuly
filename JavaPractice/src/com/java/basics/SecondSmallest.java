package com.training.basic;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args){
        //Create a method and call
        int[] numbers = {1, 2, 3, 4, 5};
        int secondMin = Arrays.stream(numbers)
                .distinct().sorted().skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Exception Occured"));

        System.out.println("Second Smallest : "+ secondMin);
    }
}
