package com.basics.quest3;

import java.util.Arrays;

public class Student {
    String studentName;
    String department;
    int[] marks;

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(String studentName, String department, int[] marks) {
        this.studentName = studentName;
        this.department = department;
        this.marks = marks;
    }

    public Student(String studentName, String department){
        this.studentName=studentName;
        this.department=department;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getDetails() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    String getGrades(int... marks){
        int total = 0;
        String grade;
        int average = 0;
        for(int mark : marks){
            total += mark;
        }

        if(!(total <= 0)) {
            average = total / marks.length;
        }

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        return "Secured " + grade +" grade with marks "+ total;
    }


}
