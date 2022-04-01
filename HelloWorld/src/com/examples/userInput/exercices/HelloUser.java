package com.examples.userInput.exercices;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! What's your name?");

        String userName = scanner.nextLine();
        System.out.println("Szép neved van, " + userName + "!");



    }
}
