package com.override.scenario;

public class MainClass {
    public static void main(String[] args) {
        ClassA ref = new ClassB();
        ref.process();
        //ClassB.process();
    }
}
