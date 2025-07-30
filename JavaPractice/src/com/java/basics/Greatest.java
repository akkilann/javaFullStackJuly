package com.java.basics;

import java.util.Arrays;

public class Greatest {
    public static void main(String[] args) {

        int[] nums = {21, 324, 3432, 36, 79, 90, 0, -1};

        //Find greatest using logical code::
        if (nums.length == 0) {
            System.out.println("Array is empty...!");
            return;
        }

        int greatest = nums[0]; // Assume first element is the greatest

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > greatest) {
                greatest = nums[i];
            }
        }

        System.out.println("Greatest number: " + greatest);

        //Using stream API ::
        int max = Arrays.stream(nums)
                .max()
                .orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println("Greatest number: " + max);
    }
}
