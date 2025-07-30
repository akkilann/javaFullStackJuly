package com.basics.quest5;

import java.util.Scanner;

public class MobileMain {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[2];

        try(Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < mobiles.length; i++) {
                System.out.println("Enter Mobile : MODEL | BRAND | PRICE : ");
                String model = scanner.next();
                String brand = scanner.next();
                double price = scanner.nextDouble();
                mobiles[i] = new Mobile(model,brand,price);
            }
        }catch (Exception e){
            System.out.println("Exception Occured " + e.getMessage());
        }
        for (Mobile mobile : mobiles) {
            mobile.getDetails();
            mobile.showFeature();
        }
    }
}
