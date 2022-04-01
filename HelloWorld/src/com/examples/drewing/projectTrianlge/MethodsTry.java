package com.examples.drewing.projectTrianlge;

public class MethodsTry {
    public static void main(String[] args) {


        int WIDTH = 320;
        int HEIGHT = 320;

        int Ax = WIDTH / 2;
        int Ay = 0;
        int Bx = 0;
        int By = HEIGHT;
        int Cx = WIDTH;
        int Cy = HEIGHT;
        int P = 20;

        int lx1 = Ax;
        int lx2 = Bx;
        int ly1 = Ay;
        int ly2 = By;
        int parts = P;

        int yStep = (ly2 - ly1) / (parts);
        int xStep = (lx2 - lx1) / (parts);
        System.out.println(xStep);
        System.out.println(yStep);

        int[][] matrix1 = new int[1][parts];

        int y = 18;
        int x = 0;

        matrix1[0][y] = ly1 + yStep * y;
        matrix1[1][x] = ( lx1 + xStep * x);
        System.out.println(matrix1[0][18]);
        System.out.println(matrix1[1][0]);
    }
}