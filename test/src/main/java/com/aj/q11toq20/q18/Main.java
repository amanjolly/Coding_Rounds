package com.aj.q11toq20.q18;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Ques 18: Write a program to multiply 1st and last element, 2nd and 2nd last element etc
        // in an integer array
        int[] arr = {4, 5, 1, 7, 2, 9};
        IntStream.range(0, arr.length / 2)
                .map(index -> arr[index] * arr[arr.length - index - 1])
                .forEach(System.out::println);
        // in case of odd number of elements
        int[] array = {4, 5, 1, 7, 2, 2, 9};
        IntStream.range(0, array.length / 2)
                .map(x -> array[x] * array[array.length - 1 - x])
                .forEach(System.out::println);
        System.out.println(array[array.length / 2]);

    }
}
