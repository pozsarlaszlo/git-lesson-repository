package com.examples.drewing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a 50-pixel long horizontal line from that point
        // Draw at least 3 lines with that function using a loop
        drewHorizontalLines(graphics, 15, 100);


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
    private static void drewHorizontalLines(Graphics graphics, int param1, int param2) {

        for (int x = 1; x < 4; x++) {
            param1 = param1 + (x * 20);
            param2 = param2 + (x * 20);
            graphics.drawLine(param1, param2, param1 + 50, param2);
        }
    }
}