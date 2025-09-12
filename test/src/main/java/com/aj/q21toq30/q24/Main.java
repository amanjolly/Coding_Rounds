package com.aj.q21toq30.q24;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ques 24: Convert a list of integers to a list of their squares
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        // O/P [1,4,9,16,25]
        List<Integer> squaredList = integerList.stream().map(x -> x * x).toList();
        System.out.println(squaredList);
    }
}
