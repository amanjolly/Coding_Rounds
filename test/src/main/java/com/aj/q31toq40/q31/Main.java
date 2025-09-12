package com.aj.q31toq40.q31;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Ques 31 Calculate the average of all the numbers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        // O/P 3.0
        long starttime1 = System.nanoTime();
        double average = integerList.stream().mapToInt(i -> i).average().orElse(0);
        System.out.println(average);

        long endtime1 = System.nanoTime();
        long starttime2 = System.nanoTime();
        double avg = integerList.stream().mapToDouble(i->i).average().orElse(0);
        System.out.println(avg);
        long endtime2 = System.nanoTime();

        System.out.printf("Integer : %d%n", endtime1 - starttime1);
        System.out.printf("Double : %d", endtime2 - starttime2);
    }
}
