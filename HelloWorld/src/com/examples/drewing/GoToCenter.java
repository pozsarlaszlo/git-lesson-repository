package com.examples.drewing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void drawImage(Graphics graphics) {

    //    double param1l = Math.random() * WIDTH;
    //    int param1 = (int) param1l;
    //    double param2l = Math.random() * HEIGHT;
    //    int param2 = (int) param2l;
        drewToTheCenter(graphics, 15, 100);

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
    private static void drewToTheCenter(Graphics graphics, int param1, int param2) {

        for (int x = 0; x < 3; x++) {
            param1 = param1 + (x * 100);
            graphics.drawLine(param1, param2, WIDTH / 2, HEIGHT / 2);
        }
    }

    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a line from that point to the center of the canvas
    // Draw at least 3 lines with that function using a loop
}