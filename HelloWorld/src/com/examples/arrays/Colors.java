package com.examples.arrays;


public class Colors {
    public static void main(String[] args) {

        String[][] colors = {{"lime", "forest green", "olive", "pale green.", "spring green"},
                            {"orange red", "red", "tomato"},
                            {"orchild", "violet", "pink", "hot pink"}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++)
           System.out.print(colors[i][j] + ", ");
           {
                System.out.println();
           }
        }
        // - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
    }
}