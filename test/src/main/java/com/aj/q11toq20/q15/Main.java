package com.aj.q11toq20.q15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ques 15:Find the products of the first two elements in an array
        int[] intArray = {12, 5, 6, 9, 2, 4};
        //Expected O/P 60
        Integer sumOfFirstTwoInts = Arrays.stream(intArray).boxed()
                .limit(2)
                .reduce(1, (a, b) -> a * b);
        System.out.println(sumOfFirstTwoInts);
    }
}
