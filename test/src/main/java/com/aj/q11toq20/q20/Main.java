package com.aj.q11toq20.q20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 20:  In a given array of integers, return true if it contains distinct values
        // and false otherwise
        int[] intArray = {5,0,1,0,8,0};
        //O/P False
        List<Integer> intList = Arrays.stream(intArray).boxed().toList();
        int freqMapSize = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).size();
        System.out.println(freqMapSize == intList.size());

        System.out.println("Another Approach");
        long distinctElementsCount = intList.stream().distinct().count();
        System.out.println(distinctElementsCount == intList.size());

        System.out.println("Another Approach");

        boolean distinctChecker = intList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .noneMatch(x -> x > 1);
        System.out.println(distinctChecker);
    }
}
