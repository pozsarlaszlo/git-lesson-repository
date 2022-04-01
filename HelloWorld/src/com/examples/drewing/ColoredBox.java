package com.examples.drewing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class ColoredBox {
        public static void drawImage(Graphics graphics) {
            // Draw a box that has different colored lines on each edge

           int c1x;
           int c2x;
           int c3x;
           int c4x;

           int c1y;
           int c2y;
           int c3y;
           int c4y;

           c1x = 100;
           c2x = 200;
           c3x = c1x;
           c4x = c2x;

           c1y = 50;
           c2y = c1y;
           c3y = 250;
           c4y = c3y;

            graphics.setColor(Color.blue);
            graphics.drawLine(c1x, c1y, c2x, c2y);
            graphics.setColor(Color.red);
            graphics.drawLine( c2x, c2y, c4x, c4y);
            graphics.setColor(Color.green);
            graphics.drawLine( c4x, c4y, c3x, c3y);
            graphics.setColor(Color.yellow);
            graphics.drawLine( c3x, c3y, c1x, c1y);


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
    }
