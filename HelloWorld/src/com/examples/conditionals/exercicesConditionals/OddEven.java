package com.examples.conditionals.exercicesConditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input that is an integer and to press enter
        System.out.println("Hello, User! Give me a whole number!");
        int num = scanner.nextInt();

        int rem = num % 2;
        if (rem == 0) {
            System.out.println("It's even");
        } else {
            System.out.println("It's odd");
        }

    }
}
