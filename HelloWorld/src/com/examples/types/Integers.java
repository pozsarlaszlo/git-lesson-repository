package com.examples.types;

public class Integers {
    public static void main(String[] args) {
        // Positive, negative and zero (not null)
        System.out.println(42);  // Prints 42
        System.out.println(-1);  // Prints -1
        System.out.println(0);   // Prints 0

        // A simple integer is represented in 4 bytes (32bit)
        // Maximum value:  2 147 483 647
        System.out.println(2147483647);
        // Minimum value: -2 147 483 648
        System.out.println(-2147483648);

        System.out.println(2147483647); // 2147483648 makes a compilation error
    }
}
