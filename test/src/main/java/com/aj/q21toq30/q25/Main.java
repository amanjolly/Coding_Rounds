package com.aj.q21toq30.q25;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Ques 25 Find and print the distinct odd numbers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10);
        // O/P [1,3,5,7,9]
        List<Integer> oddIntegersList =
                integerList.stream().distinct().filter(integer -> integer % 2 != 0).toList();
        System.out.println(oddIntegersList);
    }
}
