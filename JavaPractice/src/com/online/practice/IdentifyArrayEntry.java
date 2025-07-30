package com.online.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class IdentifyArrayEntry {
    //find all the integers starts with 1
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList( 123, 43, 234, null, 89, 34, 11, 890);
        List<Integer> results = arr.stream()
                .filter(Objects::nonNull)
                .filter(i -> i.toString().startsWith("1"))
                .collect(Collectors.toList());
        System.err.println(results);
    }
}
