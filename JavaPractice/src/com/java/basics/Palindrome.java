package com.java.basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String string = scanner.next();

        System.out.println(string + " is palindrome? " + isPalindrome(string));
    }

    private static Boolean isPalindrome(String str) {
        //Logic copied from internet
        str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // Optional: clean string
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
