package com.online.practice;

public class Student    {
    String studentName;
    String department;

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

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
