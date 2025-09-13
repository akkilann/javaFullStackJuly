package com.online.practice;

public class Student    {
    String studentName;
    String department;

    static {
        System.out.println(":::Student static block in invoked:::");
    }

    public Student(String studentName, String department){
        this.studentName=studentName;
        this.department=department;
    }

    public static void getMessage(){
        System.out.println(":::Student getMessage is invoked:::");
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
