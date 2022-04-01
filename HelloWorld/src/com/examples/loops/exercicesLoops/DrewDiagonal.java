package com.examples.loops.exercicesLoops;

import java.util.Scanner;

public class DrewDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! How big square do you want? Give me a whole number!");
        int num = scanner.nextInt();

        String patt = "%";

        for (int i = 1; i < num + 1; i++) {
            for (int d = 1; d < num + 1; d++) {
                boolean draw = (i == 1 || d == 1 || d == num || d == i || i == num);
                if (draw) {
                    System.out.print(patt);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
