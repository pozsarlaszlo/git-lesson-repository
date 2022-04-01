package com.examples.loops.exercicesLoops;

import java.util.Scanner;

public class DrewTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! Give me a number!");
        int num = scanner.nextInt();

        String star = "*";

        for (int d = (num +1); 1 < d; d--) {
            for (int i = 1; i < d; i++) {
                System.out.print(star); //how can I make repeat sg in a line?
            }
            System.out.println();
        }
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
    }
}