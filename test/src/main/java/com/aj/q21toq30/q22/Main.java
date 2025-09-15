package com.aj.q21toq30.q22;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ques 22: Find the sum of all the elements in a list
        // I/P List<Integer> intList = Arrays.asList(1,2,3,4,5);
        // O/P 15
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        Integer sum = intList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        //For performing Arithmetic Operations it's better to have primitive types to avoid
        // unboxing and also having smaller memory overhead
        Integer sum2 = intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
    }
}
