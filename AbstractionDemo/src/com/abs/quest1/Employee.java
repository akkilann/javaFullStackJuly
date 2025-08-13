package com.abs.quest1;

public class Employee {
    String empName;
    double salary;
    int empId;
    final String COMPANYNAME="Shristi";

    public Employee(String empName, double salary, int empId) {
        this.empName = empName;
        this.salary = salary;
        this.empId = empId;
    }


    void printDetails(){
        System.out.println("Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                ", COMPANYNAME='" + COMPANYNAME + '\'' +
                '}');
    }
}
