package com.java.basics;

public class OneDArray {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 200, 3432, 23,411, 678};
        int total=0;
        for(int num : nums){
            total+=num;
        }
        System.out.println("Sum of array :"+total);
    }
}
