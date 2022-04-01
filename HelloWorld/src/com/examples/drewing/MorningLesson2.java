package com.examples.drewing;
import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class MorningLesson2 {
// public class PolkaDots {
    public static void drawImage(Graphics graphics) {
        //graphics.fillRect(30, 30, 130, 130);
        drawPolkaDots(graphics, 15, 15);
    }

    private static Color setRandomColor(){
        //graphics.setColor(Color.magenta); //set predefined color

        //128 64 32 16  8  4  2  1 //powers of 2
        //  1  1  1  1  1  1  1  1
        //graphics.setColor(new Color((255 - x * y), 255, 0, 255));
        Random random = new Random();
        int randomRed = random.nextInt(256);
        int randomGreen = random.nextInt(256);
        int randomBlue = random.nextInt(256);

        Color randomColor = new Color(randomRed, randomGreen, randomBlue, 50);

        return randomColor;
    }

    private static void drawPolkaDots(Graphics graphics, int dotsInALine, int dotsInAColumn) {
        int width = WIDTH / dotsInALine;
        int height = HEIGHT / dotsInAColumn;

        for (int x = 0; x < dotsInALine; x++) {
            for (int y = 0; y < dotsInAColumn; y++) {
                if ((x + y) % 2 == 0) {
                    graphics.setColor(setRandomColor());
                    graphics.fillOval(x * width, y * height, width, height);
                }
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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