package com.aj.q11toq20.q17;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Ques 17: Write a stream program to multiply alternative numbers in an array
        int[] intArray ={4,5,1,7,2,9,2};
        //Expected O/P 4x1x2x2 =16

        int productOFAltInts = IntStream.range(0, intArray.length)
                .filter(x -> x % 2 == 0)
                .map(x -> intArray[x])
                .reduce(1, (x, y) -> x * y);
        System.out.println(productOFAltInts);
    }
}
