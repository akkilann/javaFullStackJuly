package com.encapsulation.demo;
import static com.encapsulation.demo.Trail.*;

public class MainClass {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Main method");
        Class.forName("com.encapsulation.demo.Trail");
    }
}
