package com.examples.loops.exercicesLoops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! Give me a number!");
        int first = scanner.nextInt();

        System.out.println("Now, give me a bigger number, please!");
        int second = scanner.nextInt();

        if (first >= second) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = first; i < (second); i++) {
                System.out.println(i);
            }
            // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
        }
    }
}