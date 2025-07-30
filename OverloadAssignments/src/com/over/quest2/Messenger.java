package com.over.quest2;

public class Messenger {
    void sendMail(String message) {
        System.out.println("Message Sent");
    }

    void sendMail(String tousername, String message) {
        System.out.println("Message Sent to "+ tousername);
    }

    void sendMail(String tousername, String message, String subject) {
        System.out.println("Message Sent to "+ tousername + " related to " + subject);
    }
}
