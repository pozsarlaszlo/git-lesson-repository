package com.examples.arrays;

public class ReverseList {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};

        int[] buffer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                    buffer[numbers.length - 1 - i] = numbers[i];
            }
            for (int i = 0; i < numbers.length; i++) {
            numbers[i] = buffer[i];
            }
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`