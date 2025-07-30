package com.over.quest4;

public class Greeter {

    private static String message = "Welcome -";

    private String name;

    public Greeter() {
    }

    public Greeter(String name) {
        this.name = name;
    }

    void greetUser(String... messages){
        // iterate through messages and print message + name;
        // here the message varies but name is same
        for(String message : messages){
            System.out.println(message + " " + name);
        }
    }
    void sayHello(String... names){
        // iterate through names and print "Welcome"+name;
        // here the message is same but name varies
        for(String name : names){
            System.out.println(message + name);
        }
    }
}
