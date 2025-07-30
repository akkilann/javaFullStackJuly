package com.over.quest1;

public class Employee {
    private String name ;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    void calcBonus(double basicAllowance){
        System.out.println("Basic Allowance is calculated");
    }

    void calcBonus(double basicAllowance, String gift){
        System.out.println("Basic Allowance is calculated with gift");
    }

    void calcBonus(double basicAllowance, String gift , double houseAllowance){
        System.out.println("Basic Allowance is calculated with gift & HRA");
    }
}
