package com.examples.variables.exercicesVariables;

public class BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double bmi = (massInKg / (heightInM*heightInM));
        System.out.println("BMI =  " + bmi);
        // Print the Body mass index (BMI) based on these values
    }
}
