package com.examples.arrays;

public class ChangeElement {
    // - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the value of the fourth element (8) to 4
// - Print the fourth element

    public static void main(String[] args) {
        int[] numbers = {1,2,3,8,5,6};

        numbers[3] = 4; // the replace

        System.out.println("The fourth element is " + numbers[3]);
    }
}
