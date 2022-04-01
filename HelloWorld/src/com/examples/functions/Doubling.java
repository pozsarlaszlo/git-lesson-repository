package com.examples.functions;

public class Doubling {
    public static void main(String[] args) {

        int baseNumber = 123;

        doubleNumber(baseNumber);
        System.out.println(doubleNumber(baseNumber));

    }

    public static int doubleNumber(int n1) {
        int n2 = 2 * n1;

        return n2;

    }
// - Create an integer variable named `baseNumber` and assign the value `123` to it
// - Create a function called `doubleNumber()` that doubles its integer input parameter
//   and returns the doubled value
// - Print the result of `doubleNumber(baseNumber)`
}