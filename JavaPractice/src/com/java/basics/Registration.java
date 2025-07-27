package com.java.basics;

import java.util.Collection;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String[] userNames = {"Akilan","John","San"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name to register ::");

        String inputName = scanner.nextLine();

        boolean exists = false;
        for(String user : userNames){
            if (inputName.equalsIgnoreCase(user)) {
                exists = true;
                break;
            }
        }
        if(exists){
            System.out.println("Name is not unique");
        }else{
            System.out.println("You are registered");
        }

    }
}
