package com.examples.loops.exercicesLoops;

public class DrewChessTable {
    public static void main(String[] args) {;

        int num = 8;
        String patt = "%";

        for (int i = 1; i < num + 1; i++) {
            for (int d = 1; d < num + 1; d++) {
                boolean draw = ((i % 2 == 1 && d % 2 == 1) || (i % 2 == 0 && d % 2 == 0));
                if (draw) {
                    System.out.print(patt);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//