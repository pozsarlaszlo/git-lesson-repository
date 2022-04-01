package com.examples.arrays;

public class SumAll {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};

        int[] sumNumbers = {0};

        for (int i = 0; i < numbers.length; i++) {
            sumNumbers[0] = sumNumbers[0] + numbers[i];
        }
        System.out.println(sumNumbers[0]);
    }
}

// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements of `numbers`
