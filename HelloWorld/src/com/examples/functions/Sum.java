package com.examples.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // It prints the whole line that was given by the user
        System.out.println("give me a number that Is should sum");
        int number = scanner.nextInt();

        System.out.println(sum(number));

    }

    public static int sum(int n1) {
        int s1 = 0;
        for (int i = 0; i < n1 + 1; i++) {
            s1 = s1 + i;

        }
        return s1;
    }

    // Create the usual class wrapper and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

}
