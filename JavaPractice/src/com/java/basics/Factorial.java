package com.java.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Find factorial - Enter a number -> multiple is less number.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
        scanner.close();
    }
}
