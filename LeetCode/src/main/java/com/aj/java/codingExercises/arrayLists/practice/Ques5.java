package com.aj.java.codingExercises.arrayLists.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Ques5 {
    public static void main(String[] args) {
        //Given an ArrayList<Integer>, find the sum of all elements that are located at even indices.
        //
        //Example:
        //Input: [5, 3, 2, 4, 6]
        //Output: 5 + 2 + 6 = 13
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 2, 4, 6));
        int evenIndexesSum = 0;
        for (int i = 0; i < arrayList.size(); i += 2) {
            evenIndexesSum += arrayList.get(i);
        }
        System.out.println(evenIndexesSum);

        int sumOfEvenIntegers = IntStream.range(0, arrayList.size()) // Creates a stream of indices from 0 to list.size()-1
                .filter(x -> x % 2 == 0) // Keeps only the even indices
                .map(arrayList::get) // Maps each even index to its corresponding element
                .reduce(0, Integer::sum); // Sums all the mapped elements
        System.out.println(sumOfEvenIntegers);
    }
}
