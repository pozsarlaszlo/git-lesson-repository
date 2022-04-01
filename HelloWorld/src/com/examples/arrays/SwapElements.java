package com.examples.arrays;

public class SwapElements {
    public static void main(String[] args) {

        String[] orders = {"first", "second", "third"};

        String[] buffer = {"something"};

        for (int i = 0; i < orders.length; i++) {
            if (i == 0) {
                buffer[0] = orders[i];
            } else if (i == orders.length - 1) {
                orders[0] = orders[i];
                orders[i] = buffer[0];
            }
        }
        for (int j = 0; j < orders.length; j++) {
            System.out.println(orders[j] + " ");
        }
    }
}
    // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

