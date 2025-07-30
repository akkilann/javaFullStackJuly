package com.java.basics;

import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name :: ");
        String name = scan.next();

        System.out.print("Enter ID :: ");
        int id = scan.nextInt();

        System.out.print("Enter Salary :: ");
        double salary = scan.nextDouble();

        System.out.println("Emp Name is " + name + " Id : " + id + " And salary :" + salary);
    }

}
