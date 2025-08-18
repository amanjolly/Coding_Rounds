package com.aj.java.codingExercises.arrayLists.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques3 {
    /*
    Single-Pass Method

    This method involves iterating through the list once and maintaining a "pointer" or counter for the position where the next non-zero element should be placed.

    Initialize a counter: Start with a counter, say nonZeroIndex, initialized to 0. This counter will track the position to place the next non-zero element.

    Iterate and swap: Loop through the list from the beginning.

    If the current element is not zero, place it at the nonZeroIndex position and then increment nonZeroIndex.

    This effectively pushes all non-zero elements to the front of the list, in their original relative order.

    Fill the rest with zeros: After the first loop, all non-zero elements are at the beginning of the list. The remaining elements from nonZeroIndex to the end of the list are now the positions that should be filled with zeros.

    Loop from nonZeroIndex to the end of the list and set all elements to 0.
     */
    public static void main(String[] args) {
        // Given an ArrayList<Integer>, move all zero elements to the end of the list, while maintaining the
        // order of non-zero elements.
        //Example:
        //Input: [0, 1, 0, 3, 12]
        //Output: [1, 3, 12, 0, 0]

        // To solve this we can use use
        // a two-pointer approach or
        // a single-pass method -> generally more efficient

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));
        System.out.println("Input" + arrayList);

        moveZerosToEnd(arrayList);
        System.out.println("Output " + arrayList);
    }

    private static void moveZerosToEnd(List<Integer> arrayList) {
        // for each element,
        // check if equal to zero if no then swap and increment the nonZeroIndex
        // Push all the non-zero elements forward
        int nonZeroIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != 0) {
                arrayList.set(nonZeroIndex, arrayList.get(i));
                nonZeroIndex++;
            }
        }
        System.out.println("After moving all the non zero's forward " + arrayList);
        // Not fill rest of the places with zero's
        for (int i = nonZeroIndex; i < arrayList.size(); i++) {
            arrayList.set(i, 0);
        }

    }
}
