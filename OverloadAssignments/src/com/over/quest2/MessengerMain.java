package com.over.quest2;

public class MessengerMain {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.sendMail("Hello World");
        messenger.sendMail("Alien","Hello Space");
        messenger.sendMail("NewAlien", "Hello space", "***Astro***");
    }
}
