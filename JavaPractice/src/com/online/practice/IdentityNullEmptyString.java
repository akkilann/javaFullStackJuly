package com.online.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class IdentityNullEmptyString {
    //Remove null or empty string
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", " banana", "   madulai ","    pomo ","",null, "   ","rrrr");

        strings.stream()
                .filter(Objects::nonNull)
                .filter(i -> !i.trim().isEmpty())
                .forEach(i -> System.out.println(i.trim()));

    }
}
