package com.examples.drewing.projectTrianlge;

import java.awt.*;

public class ProjectTriangle1 {

    public static void main(String[] args) {


        int WIDTH = 320;
        int HEIGHT = 320;

        int Ax = WIDTH/2;
        int Ay = 0;
        int Bx = 0;
        int By = HEIGHT;
        int Cx = WIDTH;
        int Cy = HEIGHT;
        int P = 20;


        int firstLine[][] = splitEqualParts(Ax, Ay, Bx, By, P);
        int secondLine[][] = splitEqualParts(Bx, By, Cx, Cy, P);
        int thirdLine[][] = splitEqualParts(Bx, By, Ax, Ay, P);

        System.out.println(firstLine[1][5]);
    }

    private static int[][] splitEqualParts(int lx1, int ly1, int lx2, int ly2, int parts) {

        int yStep = (ly2 - ly1) / (parts);
        int xStep = (lx2 - lx1) / (parts);
        int[][] matrix1 = new int[2][parts];

        for (int y = 0; y < parts; y++) {
            matrix1[0][y] = ly1 + yStep * y;
        }
        for (int x = 0; x < parts; x++) {
            matrix1[1][x] = lx1 + xStep * x;
        }

        return matrix1;
    }



}
