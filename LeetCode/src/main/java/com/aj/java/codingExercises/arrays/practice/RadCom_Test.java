package com.aj.java.codingExercises.arrays.practice;

import java.util.HashMap;
import java.util.Map;

public class RadCom_Test {
    public static void main(String[] args) {
        //Given an Array Of Integers, find the length of the longest subarray with at most two
        // distinct integers.
        // Example: Input: [1,2,1,2,3,5,5]
        // Output: 4 => The longest subarray with at most two distinct integer is [1,2,1,2]

        //Ans: The commonly used technique to find the longest subarray is called
        // SLIDING WINDOW TECHNIQUE : This method efficiently tracks the distinct elements within a
        // dynamic window of the array
        // Steps:
        // 1. Initialize MAX_LENGTH =0 => to store the max length found
        // 2. Initialize left_pointer =0 => to mark the beginning of the current window.
        // 3. Create a HashMap (or dictionary) called integerFrequency to store the frequency of each
        // distinct integer within the current window.
        // 4. Keep updating frequency of each distinct integer in the integerFrequency Map

        int[] integerArray= {1,2,1,2,3,5,5};
        Map<Integer,Integer> freqMap = new HashMap<>();

    }
}
