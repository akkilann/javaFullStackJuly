package com.online.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class SmallestnNumber {
    public static void main(String[] args) {
        //Find k th smallest number.

        int k = 5;

        int[] nums = {10,20,30,40,50,60};

        //OptionalInt n = Arrays.stream(nums).sorted().distinct().skip(k-1).min();

        System.out.println("Smallest no" + Arrays.stream(nums).sorted().distinct().skip(k-1).min());
    }
}
