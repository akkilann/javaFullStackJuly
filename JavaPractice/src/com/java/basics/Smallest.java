package com.training.basic;

import java.util.Arrays;

public class Smallest {
    public static void main(String[] args) {
        int[] nums = {21, 324, 3432, 36, 79, 90, 0, -1};

        //Logical code
        if (nums.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int smallest = nums[0]; // Assume first element is smallest
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number using for loop: " + smallest);

        //Using streaming ::
        int max = Arrays.stream(nums)
                .min()
                .orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println("Smallest number using Stream API:: " + max);
    }
}
