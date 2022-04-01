package com.examples.arrays;

public class IncrementElements {

    // - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element

    public static void main(String[] args) {
        int[] numbers = {1,2,3,8,5};

        numbers[2] = numbers[2]+1; // the replace

        System.out.println("The third element is " + numbers[2]);
    }
}
