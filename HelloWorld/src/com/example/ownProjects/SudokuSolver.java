package com.example.ownProjects;

import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {;

        int num = 28;

        int draw = 1;
        int empty = 0;
        int wnum = 0;
            int valuewnum;
        int wpatt = 0;

        String patt = "*";
        System.out.println("Here is an empty Sudoku table:");
        System.out.println();

        // c - column, l = line

        for (int l = 0; l < num/2; l++) {
            for (int c = 0; c < num; c++) {

                if ((l == 0 || c == 0) && (c % 2 != 1)) {
                    wnum++;
                } else if ((l != 0 && l != 1 && l != 5 && l != 9 && l != 13 && c != 0 && c != 2 && c != 10 && c != 18 && c != 26) || (c % 2 == 1)) {
                    empty++;
                } else {
                    wpatt++;
                }

                if (draw == empty) {
                    System.out.print(" "); //((c % 2 == 1 && l % 2 == 1) || (c % 2 == 0 && l % 2 == 0));
                } else if (draw == wnum) {
                    if (c == 4) {
                        System.out.print("A");
                    } else if (c == 6) {
                        System.out.print("B");
                    } else if (c == 8) {
                        System.out.print("C");
                    } else if (c == 12) {
                        System.out.print("D");
                    } else if (c == 14) {
                        System.out.print("E");
                    } else if (c == 16) {
                        System.out.print("F");
                    } else if (c == 20) {
                        System.out.print("G");
                    } else if (c == 22) {
                        System.out.print("H");
                    } else if (c == 24) {
                        System.out.print("I"); //
                    } else if (l == 2) {
                        System.out.print(1);
                    } else if (l == 3) {
                        System.out.print(2);
                    } else if (l == 4) {
                        System.out.print(3);
                    } else if (l == 6) {
                        System.out.print(4);
                    } else if (l == 7) {
                        System.out.print(5);
                    } else if (l == 8) {
                        System.out.print(6);
                    } else if (l == 10) {
                        System.out.print(7);
                    } else if (l == 11) {
                        System.out.print(8);
                    } else if (l == 12) {
                        System.out.print(9);
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    }
                if (empty == 1) {
                    empty--;
                }
                if (wnum == 1) {
                    wnum--;
                }

                }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Please, give me the known numbers! If there is no number, please hit a \"0\" !");
        System.out.println("Let's start with the \"column A\"");

        System.out.println("A1");  // column A
        int a1 = scanner.nextInt();

        System.out.println("A2");
        int a2 = scanner.nextInt();

        System.out.println("A3");
        int a3 = scanner.nextInt();

        System.out.println("A4");
        int a4 = scanner.nextInt();

        System.out.println("A5");
        int a5 = scanner.nextInt();

        System.out.println("A6");
        int a6 = scanner.nextInt();

        System.out.println("A7");
        int a7 = scanner.nextInt();

        System.out.println("A8");
        int a8 = scanner.nextInt();

        System.out.println("A9");
        int a9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column B\"");
        System.out.println();

        System.out.println("B1");
        int b1 = scanner.nextInt();

        System.out.println("B2");
        int b2 = scanner.nextInt();

        System.out.println("B3");
        int b3 = scanner.nextInt();

        System.out.println("B4");
        int b4 = scanner.nextInt();

        System.out.println("B5");
        int b5 = scanner.nextInt();

        System.out.println("B6");
        int b6 = scanner.nextInt();

        System.out.println("B7");
        int b7 = scanner.nextInt();

        System.out.println("B8");
        int b8 = scanner.nextInt();

        System.out.println("B9");
        int b9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column C\"");
        System.out.println();

        System.out.println("C1");
        int c1 = scanner.nextInt();

        System.out.println("C2");
        int c2 = scanner.nextInt();

        System.out.println("C3");
        int c3 = scanner.nextInt();

        System.out.println("C4");
        int c4 = scanner.nextInt();

        System.out.println("C5");
        int c5 = scanner.nextInt();

        System.out.println("C6");
        int c6 = scanner.nextInt();

        System.out.println("C7");
        int c7 = scanner.nextInt();

        System.out.println("C8");
        int c8 = scanner.nextInt();

        System.out.println("C9");
        int c9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column B\"");
        System.out.println();

        System.out.println("D1");
        int d1 = scanner.nextInt();

        System.out.println("D2");
        int d2 = scanner.nextInt();

        System.out.println("D3");
        int d3 = scanner.nextInt();

        System.out.println("D4");
        int d4 = scanner.nextInt();

        System.out.println("D5");
        int d5 = scanner.nextInt();

        System.out.println("D6");
        int d6 = scanner.nextInt();

        System.out.println("D7");
        int d7 = scanner.nextInt();

        System.out.println("D8");
        int d8 = scanner.nextInt();

        System.out.println("D9");
        int d9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column E\"");
        System.out.println();

        System.out.println("E1");
        int e1 = scanner.nextInt();

        System.out.println("E2");
        int e2 = scanner.nextInt();

        System.out.println("E3");
        int e3 = scanner.nextInt();

        System.out.println("E4");
        int e4 = scanner.nextInt();

        System.out.println("E5");
        int e5 = scanner.nextInt();

        System.out.println("E6");
        int e6 = scanner.nextInt();

        System.out.println("E7");
        int e7 = scanner.nextInt();

        System.out.println("E8");
        int e8 = scanner.nextInt();

        System.out.println("E9");
        int e9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column F\"");
        System.out.println();

        System.out.println("F1");
        int f1 = scanner.nextInt();

        System.out.println("F2");
        int f2 = scanner.nextInt();

        System.out.println("F3");
        int f3 = scanner.nextInt();

        System.out.println("F4");
        int f4 = scanner.nextInt();

        System.out.println("F5");
        int f5 = scanner.nextInt();

        System.out.println("F6");
        int f6 = scanner.nextInt();

        System.out.println("F7");
        int f7 = scanner.nextInt();

        System.out.println("F8");
        int f8 = scanner.nextInt();

        System.out.println("F9");
        int f9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column G\"");
        System.out.println();

        System.out.println("G1");
        int g1 = scanner.nextInt();

        System.out.println("G2");
        int g2 = scanner.nextInt();

        System.out.println("G3");
        int g3 = scanner.nextInt();

        System.out.println("G4");
        int g4 = scanner.nextInt();

        System.out.println("G5");
        int g5 = scanner.nextInt();

        System.out.println("G6");
        int g6 = scanner.nextInt();

        System.out.println("G7");
        int g7 = scanner.nextInt();

        System.out.println("G8");
        int g8 = scanner.nextInt();

        System.out.println("G9");
        int g9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column H\"");
        System.out.println();

        System.out.println("H1");
        int h1 = scanner.nextInt();

        System.out.println("H2");
        int h2 = scanner.nextInt();

        System.out.println("H3");
        int h3 = scanner.nextInt();

        System.out.println("H4");
        int h4 = scanner.nextInt();

        System.out.println("H5");
        int h5 = scanner.nextInt();

        System.out.println("H6");
        int h6 = scanner.nextInt();

        System.out.println("H7");
        int h7 = scanner.nextInt();

        System.out.println("H8");
        int h8 = scanner.nextInt();

        System.out.println("H9");
        int h9 = scanner.nextInt();

        System.out.println();
        System.out.println("Okay, the next is \"column I\"");
        System.out.println();

        System.out.println("I1");
        int i1 = scanner.nextInt();

        System.out.println("I2");
        int i2 = scanner.nextInt();

        System.out.println("I3");
        int i3 = scanner.nextInt();

        System.out.println("I4");
        int i4 = scanner.nextInt();

        System.out.println("I5");
        int i5 = scanner.nextInt();

        System.out.println("I6");
        int i6 = scanner.nextInt();

        System.out.println("I7");
        int i7 = scanner.nextInt();

        System.out.println("I8");
        int i8 = scanner.nextInt();

        System.out.println("I9");
        int i9 = scanner.nextInt();  //

        System.out.println("Okay, Here is our Sudoku puzzle:");
        System.out.println();

        // c - column, l = line

        for (int l = 0; l < num/2; l++) {
            for (int c = 0; c < num; c++) {

                if ((l == 0 || c == 0) && (c % 2 != 1)) {
                    wnum++;
                } else if ((l != 0 && l != 1 && l != 5 && l != 9 && l != 13 && c != 0 && c != 2 && c != 10 && c != 18 && c != 26) || (c % 2 == 1)) {
                    empty++;
                } else {
                    wpatt++;
                }

                if (draw == empty) {
                    if ((c == 4 && l == 2) && (a1 != 0)) {
                        System.out.print(a1);
                    } else if ((c == 4 && l == 3) && (a2 != 0)) {
                        System.out.print(a2);
                    } else if ((c == 4 && l == 4) && (a3 != 0)) {
                        System.out.print(a3);
                    } else if ((c == 4 && l == 6) && (a4 != 0)) {
                        System.out.print(a4);
                    } else if ((c == 4 && l == 7) && (a5 != 0)) {
                        System.out.print(a5);
                    } else if ((c == 4 && l == 8) && (a6 != 0)) {
                        System.out.print(a6);
                    } else if ((c == 4 && l == 10) && (a7 != 0)) {
                        System.out.print(a7);
                    } else if ((c == 4 && l == 11) && (a8 != 0)) {
                        System.out.print(a8);
                    } else if ((c == 4 && l == 12) && (a9 != 0)) {
                        System.out.print(a9);
                    } else if ((c == 6 && l == 2) && (b1 != 0)) {
                        System.out.print(b1);
                    } else if ((c == 6 && l == 3) && (b2 != 0)) {
                        System.out.print(b2);
                    } else if ((c == 6 && l == 4) && (b3 != 0)) {
                        System.out.print(b3);
                    } else if ((c == 6 && l == 6) && (b4 != 0)) {
                        System.out.print(b4);
                    } else if ((c == 6 && l == 7) && (b5 != 0)) {
                        System.out.print(b5);
                    } else if ((c == 6 && l == 8) && (b6 != 0)) {
                        System.out.print(b6);
                    } else if ((c == 6 && l == 10) && (b7 != 0)) {
                        System.out.print(b7);
                    } else if ((c == 6 && l == 11) && (b8 != 0)) {
                        System.out.print(b8);
                    } else if ((c == 6 && l == 12) && (b9 != 0)) {
                        System.out.print(b9);
                    } else if ((c == 8 && l == 2) && (c1 != 0)) {
                        System.out.print(c1);
                    } else if ((c == 8 && l == 3) && (c2 != 0)) {
                        System.out.print(c2);
                    } else if ((c == 8 && l == 4) && (c3 != 0)) {
                        System.out.print(c3);
                    } else if ((c == 8 && l == 6) && (c4 != 0)) {
                        System.out.print(c4);
                    } else if ((c == 8 && l == 7) && (c5 != 0)) {
                        System.out.print(c5);
                    } else if ((c == 8 && l == 8) && (c6 != 0)) {
                        System.out.print(c6);
                    } else if ((c == 8 && l == 10) && (c7 != 0)) {
                        System.out.print(c7);
                    } else if ((c == 8 && l == 11) && (c8 != 0)) {
                        System.out.print(c8);
                    } else if ((c == 8 && l == 12) && (c9 != 0)) {
                        System.out.print(c9);
                    } else if ((c == 12 && l == 2) && (d1 != 0)) {
                        System.out.print(d1);
                    } else if ((c == 12 && l == 3) && (d2 != 0)) {
                        System.out.print(d2);
                    } else if ((c == 12 && l == 4) && (d3 != 0)) {
                        System.out.print(d3);
                    } else if ((c == 12 && l == 6) && (d4 != 0)) {
                        System.out.print(d4);
                    } else if ((c == 12 && l == 7) && (d5 != 0)) {
                        System.out.print(d5);
                    } else if ((c == 12 && l == 8) && (d6 != 0)) {
                        System.out.print(d6);
                    } else if ((c == 12 && l == 10) && (d7 != 0)) {
                        System.out.print(d7);
                    } else if ((c == 12 && l == 11) && (d8 != 0)) {
                        System.out.print(d8);
                    } else if ((c == 12 && l == 12) && (d9 != 0)) { //
                        System.out.print(d9);
                    } else if ((c == 14 && l == 2) && (e1 != 0)) {
                        System.out.print(e1);
                    } else if ((c == 14 && l == 3) && (e2 != 0)) {
                        System.out.print(e2);
                    } else if ((c == 14 && l == 4) && (e3 != 0)) {
                        System.out.print(e3);
                    } else if ((c == 14 && l == 6) && (e4 != 0)) {
                        System.out.print(e4);
                    } else if ((c == 14 && l == 7) && (e5 != 0)) {
                        System.out.print(e5);
                    } else if ((c == 14 && l == 8) && (e6 != 0)) {
                        System.out.print(e6);
                    } else if ((c == 14 && l == 10) && (e7 != 0)) {
                        System.out.print(e7);
                    } else if ((c == 14 && l == 11) && (e8 != 0)) {
                        System.out.print(e8);
                    } else if ((c == 14 && l == 12) && (e9 != 0)) {
                        System.out.print(e9);
                    } else if ((c == 16 && l == 2) && (f1 != 0)) {
                        System.out.print(f1);
                    } else if ((c == 16 && l == 3) && (f2 != 0)) {
                        System.out.print(f2);
                    } else if ((c == 16 && l == 4) && (f3 != 0)) {
                        System.out.print(f3);
                    } else if ((c == 16 && l == 6) && (f4 != 0)) {
                        System.out.print(f4);
                    } else if ((c == 16 && l == 7) && (f5 != 0)) {
                        System.out.print(f5);
                    } else if ((c == 16 && l == 8) && (f6 != 0)) {
                        System.out.print(f6);
                    } else if ((c == 16 && l == 10) && (f7 != 0)) {
                        System.out.print(f7);
                    } else if ((c == 16 && l == 11) && (f8 != 0)) {
                        System.out.print(f8);
                    } else if ((c == 16 && l == 12) && (f9 != 0)) {
                        System.out.print(f9);
                    } else if ((c == 20 && l == 2) && (g1 != 0)) {
                        System.out.print(g1);
                    } else if ((c == 20 && l == 3) && (g2 != 0)) {
                        System.out.print(g2);
                    } else if ((c == 20 && l == 4) && (g3 != 0)) {
                        System.out.print(g3);
                    } else if ((c == 20 && l == 6) && (g4 != 0)) {
                        System.out.print(g4);
                    } else if ((c == 20 && l == 7) && (g5 != 0)) {
                        System.out.print(g5);
                    } else if ((c == 20 && l == 8) && (g6 != 0)) {
                        System.out.print(g6);
                    } else if ((c == 20 && l == 10) && (g7 != 0)) {
                        System.out.print(g7);
                    } else if ((c == 20 && l == 11) && (g8 != 0)) {
                        System.out.print(g8);
                    } else if ((c == 20 && l == 12) && (g9 != 0)) {
                        System.out.print(g9);
                    } else if ((c == 22 && l == 2) && (h1 != 0)) {
                        System.out.print(h1);
                    } else if ((c == 22 && l == 3) && (h2 != 0)) {
                        System.out.print(h2);
                    } else if ((c == 22 && l == 4) && (h3 != 0)) {
                        System.out.print(h3);
                    } else if ((c == 22 && l == 6) && (h4 != 0)) {
                        System.out.print(h4);
                    } else if ((c == 22 && l == 7) && (h5 != 0)) {
                        System.out.print(h5);
                    } else if ((c == 22 && l == 8) && (h6 != 0)) {
                        System.out.print(h6);
                    } else if ((c == 22 && l == 10) && (h7 != 0)) {
                        System.out.print(h7);
                    } else if ((c == 22 && l == 11) && (h8 != 0)) {
                        System.out.print(h8);
                    } else if ((c == 22 && l == 12) && (h9 != 0)) {
                        System.out.print(h9);
                    } else if ((c == 24 && l == 2) && (i1 != 0)) {
                        System.out.print(i1);
                    } else if ((c == 24 && l == 3) && (i2 != 0)) {
                        System.out.print(i2);
                    } else if ((c == 24 && l == 4) && (i3 != 0)) {
                        System.out.print(i3);
                    } else if ((c == 24 && l == 6) && (i4 != 0)) {
                        System.out.print(i4);
                    } else if ((c == 24 && l == 7) && (i5 != 0)) {
                        System.out.print(i5);
                    } else if ((c == 24 && l == 8) && (i6 != 0)) {
                        System.out.print(i6);
                    } else if ((c == 24 && l == 10) && (i7 != 0)) {
                        System.out.print(i7);
                    } else if ((c == 24 && l == 11) && (i8 != 0)) {
                        System.out.print(i8);
                    } else if ((c == 24 && l == 12) && (i9 != 0)) {
                        System.out.print(i9);
                    } else {
                        System.out.print(" ");
                    }//((c % 2 == 1 && l % 2 == 1) || (c % 2 == 0 && l % 2 == 0));
                } else if (draw == wnum) {
                    if (c == 4) {
                        System.out.print("A");
                    } else if (c == 6) {
                        System.out.print("B");
                    } else if (c == 8) {
                        System.out.print("C");
                    } else if (c == 12) {
                        System.out.print("D");
                    } else if (c == 14) {
                        System.out.print("E");
                    } else if (c == 16) {
                        System.out.print("F");
                    } else if (c == 20) {
                        System.out.print("G");
                    } else if (c == 22) {
                        System.out.print("H");
                    } else if (c == 24) {
                        System.out.print("I"); //
                    } else if (l == 2) {
                        System.out.print(1);
                    } else if (l == 3) {
                        System.out.print(2);
                    } else if (l == 4) {
                        System.out.print(3);
                    } else if (l == 6) {
                        System.out.print(4);
                    } else if (l == 7) {
                        System.out.print(5);
                    } else if (l == 8) {
                        System.out.print(6);
                    } else if (l == 10) {
                        System.out.print(7);
                    } else if (l == 11) {
                        System.out.print(8);
                    } else if (l == 12) {
                        System.out.print(9);
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
                if (empty == 1) {
                    empty--;
                }
                if (wnum == 1) {
                    wnum--;
                }

            }
            System.out.println();



        }
    }
}
