package com.examples.drewing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function
        drewlines(graphics,89,145,75, 123);
        drewlines(graphics,156,76,0, 0);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
    private static void drewlines(Graphics graphics, int paramx1, int paramy1, int paramx2, int paramy2) {

        // if (((paramx1 == 0) && (paramy1 == 0) && (paramx2 == WIDTH) && (paramy2 == HEIGHT)) ||
        //        ((paramx1 == WIDTH) && (paramy1 == HEIGHT) && (paramx2 == 0) && (paramy2 == 0))) {
        //    graphics.setColor(Color.green);
        //
        // } else if (((paramx1 == 0) && (paramy1 == HEIGHT) && (paramx2 == WIDTH) && (paramy2 == 0)) ||
        //        ((paramx1 == WIDTH) && (paramy1 == 0) && (paramx2 == 0) && (paramy2 == HEIGHT))) {
        //    graphics.setColor(Color.red);
        // }
        if ((paramx1 == 0) && (paramy1 == 0) || (paramx2 == 0) && (paramy2 == 0)) {
            graphics.setColor(Color.green);
        } else {
            graphics.setColor(Color.red);
        }
        graphics.drawLine(paramx1, paramy1, paramx2, paramy2);
    }
}