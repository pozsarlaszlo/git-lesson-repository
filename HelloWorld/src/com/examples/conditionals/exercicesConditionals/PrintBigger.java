package com.examples.conditionals.exercicesConditionals;

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! Give me a number!");
        double a = scanner.nextInt();

        System.out.println("Thanks! Give me one more number!");
        double b = scanner.nextInt();

        if (a > b) {
            System.out.println("The bigger is " + a);
        } else if (a < b) {
            System.out.println("The bigger is " + b);
        } else {
            System.out.println("They are the same.");
        }

    }
}