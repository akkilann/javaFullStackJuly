package com.online.practice;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int[] nums = {10,20,20,30,10,0};
        HashSet<Integer> distinct = new HashSet<>();
        for (Integer num: nums) {
            if(!distinct.contains(num)){
                distinct.add(num);
            }
        }
        System.out.println("Through For Each"+distinct.stream().count());

        //Using stream
        int count = (int) Arrays.stream(nums).distinct().count();

        System.out.println("Stream count" + count);
    }



}
