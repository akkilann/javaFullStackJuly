package com.session.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {
        List<String> courses =
                Arrays.asList("Java","JSP","CSS","HTML","Spring","Java","Micro","Javascript");




        courses.stream()
                .map(str -> str.toLowerCase())
                .filter(lowerCase -> lowerCase.startsWith("j"))
                .forEach(System.out::println);

    }
}
