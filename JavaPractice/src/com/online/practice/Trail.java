package com.online.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Trail {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter"+ names.length+ "your name");
        for(int i=0;i<names.length;i++){
            names[i]=sc.next();
        }
        System.out.println("Printing names: :");

        for(String name : names){
            if(name.startsWith("A")){
                System.out.println(name+" ");
            }
        }

        //using stream
        Arrays.stream(names)
                .filter(i -> i.toUpperCase().startsWith("A"))
                .forEach(System.out::println);
     }
}
