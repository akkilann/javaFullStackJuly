package com.abs.quest1;

public abstract class Employee {
    String empName;
    double salary;
    int empId;
    final String COMPANYNAME="Shristi";

    public Employee(String empName, double salary, int empId) {
        this.empName = empName;
        this.salary = salary;
        this.empId = empId;
    }

    abstract void calcBonus(double amount);

    String[] showCourses(){
        return new String[]{"java", "spring", "springboot"};
    }
    abstract void showProjects();

    void printDetails(){
        System.out.println("Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                ", COMPANYNAME='" + COMPANYNAME + '\'' +
                '}');
    }
}
