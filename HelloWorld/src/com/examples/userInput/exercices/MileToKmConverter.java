package com.examples.userInput.exercices;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input that is an integer and to press enter
        System.out.println("Hello, User! Write the miles to change!");
        double miles = scanner.nextInt();

        // It prints the integer
        System.out.println("It's " + 1.609344*miles + " km");

    }
}
