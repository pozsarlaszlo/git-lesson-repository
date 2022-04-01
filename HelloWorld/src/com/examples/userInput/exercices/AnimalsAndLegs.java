package com.examples.userInput.exercices;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! How many chicken has the farmer?");
        int chicks = scanner.nextInt();

        System.out.println("And pigs?");
        int pigs = scanner.nextInt();

        int legs = (2 * chicks) + (4 * pigs);

        System.out.println("So the numbers of the legs are " + legs + ". (Except the farmer's legs.)");
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
