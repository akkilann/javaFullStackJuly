package com.basics.quest3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[1];
        getStudentInfo(students);
        printStuduentInfo(students);
    }

    private static void printStuduentInfo(Student[] students) {
        for(Student student : students){
            System.out.println(student.getDetails());
            System.out.println(student.getGrades());
        }
    }

    private static void getStudentInfo(Student[] students) {
        try(Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < students.length; i++) {
                System.out.println("enter name & Dept: ");
                String name = scanner.next();
                String department = scanner.next();
                int[] marks = new int[3];
                System.out.println("Enter marks :");
                marks[0] = scanner.nextInt();
                marks[1] = scanner.nextInt();
                marks[2] = scanner.nextInt();
                students[i] = new Student(name, department, marks);

            }
        }catch (InputMismatchException ex){
            System.out.println("Exception Occured " + ex.getMessage());
        }
    }
}
