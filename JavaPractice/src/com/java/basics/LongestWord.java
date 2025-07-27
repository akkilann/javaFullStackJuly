package com.java.basics;

import java.util.*;

public class LongestWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        String longestWord = "";
        //Using for loop
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        //Using stream
        Optional<String> longestWordStream = Arrays.stream(words).filter(Objects::nonNull)
                        .filter(word -> !word.isEmpty())
                                .max(Comparator.comparingInt(String::length));


        System.out.println("The longest word is with for each: " + longestWord);

        if(longestWordStream.isPresent()) {
            System.out.println("Using streaming Api " + longestWordStream.get());
        }
    }
}
