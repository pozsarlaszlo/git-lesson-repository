package com.examples.drewing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MorningLesson1
{

    public static void drawImage(Graphics graphics) {
//        graphics.drawLine(0, 0, 200, 50);
//        graphics.drawRect(20, 150, 100, 90);
//        graphics.fillRect(60, 60, 100, 90);
//        graphics.fillOval(120, 10, 180, 90);
//        graphics.fillRoundRect(150,150,150,50,200,50);
        drawLines(graphics);

        //random number generating with Random
        int randomNumberWithRandom = new Random().nextInt(100); //not instantiating Random

        Random rand = new Random(); //instantiating Random, and call the nextInt() method on the instance
        int x1 = rand.nextInt(WIDTH + 1); // 0 <= x1 < WIDTH + 1
        int y1 = rand.nextInt(HEIGHT + 1);
        int x2 = rand.nextInt(WIDTH + 1);
        int y2 = rand.nextInt(HEIGHT + 1);
        graphics.drawLine(x1, y1, x2, y2);

        //random number generating with Math.random()
        double randomNumber = Math.random() * 100; // 0 <= randomNumber < 100
        int randomIntNumber = (int) randomNumber; // casting double to int e.g: 2.54 -> 2
        long roundedRandomNumber = Math.round(randomNumber); // rounding double to int e.g: 2.54 -> 3

    }

    private static void drawLines(Graphics graphics) {
        graphics.drawLine(0, 0, WIDTH, HEIGHT);
        graphics.drawLine(WIDTH, 0, 0, HEIGHT);
        graphics.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT / 2);
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Soft Kitty");
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