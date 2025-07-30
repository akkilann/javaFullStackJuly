package com.over.quest4;

public class GreeterMain {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Alice");

        greeter.greetUser("Hello1","Hello2","Hello3");

        Greeter welcomegreeter = new Greeter();
        welcomegreeter.sayHello("Red Ranger","Yellow ranger", "blue ranger");
    }
}
