package com.examples.file_manipulations.exceptions;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div = scanner.nextInt();

        try {
            deviderByTen(div);
            System.out.println(deviderByTen(div));

        } catch (ArithmeticException e) {
            System.out.println("fail");
        }


    }

    public static int deviderByTen(int n1) {
        int res = (10 / n1);
        return res;
    }

}
        // int result = 10 / divisor; // If the input value for divisor was 0 the program breaks
        // System.out.println(result); // The program doesn't reach this line if the input was 0

    // Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0

