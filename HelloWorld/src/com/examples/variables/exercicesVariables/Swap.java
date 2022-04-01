package com.examples.variables.exercicesVariables;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

            int c = a;
            a -= a;
            int d = b;
            b -= b;
            a += d;
            b += c;


        System.out.println(a);
        System.out.println(b);
    }
}
