package com.aj.q1toq10.q7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Quse 7: Divide given integer list into lists of even and odd numbers?
        Map<Boolean, List<Integer>> collected = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.partitioningBy(s -> s % 2 == 0));
        System.out.println("Even Numbers :"+collected.get(true));
        System.out.println("Odd Numbers :"+collected.get(false));

        System.out.println("Another Way");

        Map<Boolean, List<Integer>> collected1 = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0,
                Collectors.toList()));
        System.out.println("Even Numbers :"+collected1.get(true));
        System.out.println("Odd Numbers :"+collected1.get(false));
        List<List<Integer>> evenOddList =
                IntStream.rangeClosed(1, 20)
                        .boxed()
                        .collect(Collectors.groupingBy(x -> x % 2 == 0,
                Collectors.toList()))
                        .entrySet()
                        .stream()
                        .map(x->x.getValue())
                        .collect(Collectors.toList());
        System.out.println(evenOddList);

        System.out.println("Another Way");
        List<List<Integer>> evenOddList1 =
                IntStream.rangeClosed(1, 20)
                        .boxed()
                        .collect(Collectors.groupingBy(x -> x % 2 == 0,
                                Collectors.toList()))
                        .values().stream().toList();
        System.out.println(evenOddList1);

    }
}
