package com.examples.loops.exercicesLoops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int hidden = 35;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        while (s < 1) {

        System.out.println("Which number I have chosen?");

            int hint = scanner.nextInt();

            if (hidden < hint) {
                System.out.println("The stored number is lower");
            } else if (hint < hidden) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("You found the number: " + hidden);
                s++;
            }
        }
        }
        }
// Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8