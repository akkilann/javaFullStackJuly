package com.training.basic;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first subject: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter second subject: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter third third: ");
        int subject3 = scanner.nextInt();

        System.out.println("Total marks :" +calculateTotalMarks(subject1, subject2, subject3, "SUM"));
        System.out.println("Average : " +calculateTotalMarks(subject1, subject2, subject3, "AVERAGE"));
    }

    public static Object calculateTotalMarks(int subject1, int subject2, int subject3, String op){
        if(op.equalsIgnoreCase("sum")) {
            return subject1 + subject2 + subject3;
        } else if (op.equalsIgnoreCase("average")) {
            return (subject1+subject2+subject3)/3;
        }
        return null;
    }

}
