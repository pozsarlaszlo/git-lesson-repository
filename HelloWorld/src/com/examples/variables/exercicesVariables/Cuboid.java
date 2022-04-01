package com.examples.variables.exercicesVariables;

public class Cuboid {
    public static void main(String[] args) {

        double a = 5;
        double b = 7;
        double c = 13;

        double sur = (2 * (( a * b ) + ( b * c ) + ( a * c )));
        double vol = (a*b*c);

        System.out.println("Surface Area: " + sur);
        System.out.println("Volume: " + vol);

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000
    }
}
