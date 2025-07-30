package com.java.basics;

import java.util.Scanner;

public class OneDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter inputs");
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
