package com.training.basic;

import java.util.Arrays;
import java.util.Timer;

public class SecondLarge {
    public static void main(String[] args){


        int[] numbers = {5, 7, 7, 4, -1, 0 , 9, 10, 23, 65, 78};
        //  Arrays.sort(numbers);
        int secondMax = Arrays.stream(numbers)
                .distinct().boxed().sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nothing to find"));

        System.out.println("Second Greatest : "+ secondMax);
    }
}
