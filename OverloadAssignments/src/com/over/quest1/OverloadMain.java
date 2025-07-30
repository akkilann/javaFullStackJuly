package com.over.quest1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OverloadMain {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        try(Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < employees.length; i++) {
                System.out.println("Enter Name & Designation : ");
                String name = scanner.next();
                String designation = scanner.next();
                employees[i] = new Employee(name, designation.toUpperCase());
            }


        for(Employee employee : employees){
            switch (employee.getDesignation()){
                case "PROGRAMMER":
                    employee.calcBonus(100);
                    break;
                case "MANAGER":
                    employee.calcBonus(100, "1000");
                    break;
                case "DIRECTOR":
                    employee.calcBonus(100, "1000", 10000);
                    break;
                default:
                    System.out.println("Invalid data of either name/designation");
                    break;
            }
        }
        }catch (InputMismatchException ex){
            System.out.println("Exception Occured " + ex.getMessage());
        }
        System.out.println("checking if it's executed after catch block execution");
    }
}
