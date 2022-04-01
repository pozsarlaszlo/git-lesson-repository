package com.examples.arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * numbers[i];
            System.out.print(numbers[i] + " ");
        }
        // - Create an array variable named `numberList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
    }
}