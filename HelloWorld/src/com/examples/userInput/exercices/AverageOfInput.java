package com.examples.userInput.exercices;

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! Give me a number!");
        double a = scanner.nextInt();

        System.out.println("Hello, User! Give me a number!");
        double b = scanner.nextInt();

        System.out.println("Hello, User! Give me a number!");
        double c = scanner.nextInt();

        System.out.println("Hello, User! Give me a number!");
        double d = scanner.nextInt();

        System.out.println("Hello, User! Give me a number!");
        double e = scanner.nextInt();

        double sum = a+b+c+d+e;
        double avg = sum/5;

        System.out.println("Sum: " + sum + "," + "Average: " + avg);
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
    }
}
