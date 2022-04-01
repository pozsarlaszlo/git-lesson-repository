package com.examples.loops.exercicesLoops;

public class FizzBuzz {
    // Write a program that prints the numbers from 1 to 100
// but for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
        public static void main(String[] args) {
            for (int i = 1; i < 101; i++) {
                boolean divthree = i % 3 == 0;
                boolean divfive = i % 5 == 0;
                boolean divboth = (divthree && divfive);
                // System.out.println(i);
                // System.out.println(divthree);
                // System.out.println(divfive);
                // System.out.println(divboth);
                    if  (divboth) {
                        System.out.println("FizzBuzz");
                    } else if (divthree) {
                        System.out.println("Fizz");
                    } else if (divfive) {
                        System.out.println("Buzz");
                    } else {
                    System.out.println(i);
                }
            }
}
}