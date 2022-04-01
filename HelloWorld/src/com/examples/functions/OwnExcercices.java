package com.examples.functions;

public class OwnExcercices {
    public static void main(String[] args) {

        int value = minFunction(4, 6); // unnessesary
        System.out.println(minFunction(4, 6));

        minFunction2(7,9);
        //System.out.println(minFunction2(7,9));

        }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;

    }

    public static void minFunction2(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        System.out.println(min);




    }

}