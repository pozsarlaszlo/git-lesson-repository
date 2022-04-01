package com.examples.variables.exercicesVariables;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int fullSecPerDay = 24 * 60 * 60;
        int spentSec = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;
        int remSec = fullSecPerDay - spentSec;
        System.out.println(remSec);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
    }
}
