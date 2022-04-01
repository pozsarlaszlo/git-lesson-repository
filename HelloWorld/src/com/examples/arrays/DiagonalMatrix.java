package com.examples.arrays;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User! How big matrix do you want? Give me a whole number!");
        int num = scanner.nextInt();

        int[][] matrix = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int d = 0; d < num; d++) {
                if (i == d) {
                    matrix[i][d] = 1;
                } else {
                    matrix[i][d] = 0;
                }
                System.out.print(matrix[i][d]);
                if (d == num - 1) {
                    System.out.println();
                }
            }
            ;

            }
            //
            //      System.out.print(patt);
            //      } else {
            //            System.out.print(" ");
            //       }

            //    }
            //System.out.println();
        }
    }
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    //
    // - Print this two dimensional array to the output
