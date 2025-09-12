package com.aj.q1toq10.q10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ques 10: Given an array, find the sum of unique elements
        Integer[] intArray = {21, 10, 31, 14, 21, 14, 10, 18, 29, 30};
        Integer uniqueSum = Arrays.stream(intArray).distinct().reduce(Integer::sum).orElse(0);
        System.out.println(uniqueSum);

        int[] intArrayPrimitive = {21, 10, 31, 14, 21, 14, 10, 18, 29, 30};
        int uniqueIntSum = Arrays.stream(intArrayPrimitive).distinct().sum();
        System.out.println(uniqueIntSum);
    }
}
