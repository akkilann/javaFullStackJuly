package com.basics.quest1;

public class BookMain {
    public static void main(String[] args) {
        Book story = new Book("India POSITIVE", "Chettan Bhaghat","Story",699.0f);
        story.getDetails();
        story.checkBookType();

        System.out.println("--------");

        Book history = new Book("Shattered Lands","Sam Dalrymple", "History",200.0f);
        history.getDetails();
        history.checkBookType();

    }
}
