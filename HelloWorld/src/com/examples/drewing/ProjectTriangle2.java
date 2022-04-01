package com.examples.drewing;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ProjectTriangle2 {


    public static void drawImage(Graphics graphics) {



        int Ax = 0;
        int Ay = HEIGHT / 2;
        int Bx = WIDTH;
        int By = 0;
        int Cx = WIDTH;
        int Cy = HEIGHT;
        int P = 20;


        int firstLine[][] = splitEqualParts(Ax, Ay, Bx, By, P);
        graphics.drawLine(firstLine[0][0],firstLine[1][0],firstLine[0][P],firstLine[1][P]);
        int secondLine[][] = splitEqualParts(Bx, By, Cx, Cy, P);
        graphics.drawLine(secondLine[0][0],secondLine[1][0],secondLine[0][P],secondLine[1][P]);
        int thirdLine[][] = splitEqualParts(Ax, Ay, Cx, Cy, P);
        graphics.drawLine(thirdLine[0][0],thirdLine[1][0],thirdLine[0][P],thirdLine[1][P]);

       // graphics.setColor(Color.green);
        System.out.println(firstLine[0][0]);
        System.out.println(firstLine[1][0]);
        System.out.println(firstLine[0][P]);
        System.out.println(firstLine[1][P]);
        System.out.println();
        System.out.println(secondLine[0][0]);
        System.out.println(secondLine[1][0]);
        System.out.println(secondLine[0][P]);
        System.out.println(secondLine[1][P]);
        System.out.println();
        System.out.println(thirdLine[0][0]);
        System.out.println(thirdLine[1][0]);
        System.out.println(thirdLine[0][P]);
        System.out.println(thirdLine[1][P]);
        System.out.println();
      //  graphics.setColor(Color.red);
       crossTheLinePoints (graphics, firstLine, secondLine);
       crossTheLinePoints (graphics, firstLine, thirdLine);
       crossTheLinePoints (graphics, secondLine, thirdLine);

    }
        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main (String[]args){
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();


        }

        private static int[][] splitEqualParts ( int lx1, int ly1, int lx2, int ly2, int parts){


            int yStep =  (ly2 - ly1) / (parts);
            int xStep = (lx2 - lx1) / (parts);
            int[][] matrix1 = new int[2][parts+1];

            for (int y = 0; y < parts+1; y++) {
                matrix1[0][y] = ly1 + yStep * y;
            }
            for (int x = 0; x < parts+1; x++) {
                matrix1[1][x] = lx1 + xStep * x;
            }

            return matrix1;
        }

    private static void crossTheLinePoints(Graphics graphics, int m1[][], int m2[][]) {
        int l = m1[0].length-1;

        int puf;
        int puf2;
        if (((m1[0][0] != m2[0][0]) || (m1[1][0] != m2[1][0])) && ((m1[0][l] != m2[0][l]) || (m1[1][l] != m2[1][l]))) {
            for (int w = 0 ; w < l/2+1; w++) {
                puf = m1[0][w];
                m1[0][w] = m1[0][l - w];
                m1[0][l - w] = puf;
            }
            for (int z = 0 ; z < l/2+1; z++) {
                puf2 = m1[1][z];
                m1[1][z] = m1[1][l - z];
                m1[1][l - z] = puf2;
            }
            }

            for (int x = 0; x < l; x++)
                graphics.drawLine(m1[0][x],m1[1][x],m2[0][x],m2[1][x]);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
