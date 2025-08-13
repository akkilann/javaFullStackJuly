package com.online.practice;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws ClassNotFoundException {
        //Student[] students = new Student[2];
        //getStudentInfo(students);
        //printStuduentInfo(students);
        Class.forName("com.online.practice.Student");
    }

    private static void printStuduentInfo(Student[] students) {
        for(Student student : students){
            System.out.println(student.toString());
        }
    }

    private static void getStudentInfo(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("enter name & Dept: ");
            String name = scanner.next();
            String department = scanner.next();
            students[i]= new Student(name, department);
        }
        scanner.close();
    }
}
