package com.examples.functions;

import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // It prints the whole line that was given by the user
        System.out.println("give me a number and I give it's factorial");
        int number = scanner.nextInt();

        System.out.println(calculateFactorial(number));

    }

    public static int calculateFactorial(int n1) {
        int s1 = 1;
        for (int i = 1; i < n1 + 1; i++) {
            s1 = s1 * i;

        }
        return s1;
    }
    //  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
}
