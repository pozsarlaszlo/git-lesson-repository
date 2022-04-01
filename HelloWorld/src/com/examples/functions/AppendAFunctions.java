package com.examples.functions;

public class AppendAFunctions {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendA(typo);
    }

    public static String appendA(String typo) {
        String t2 = (typo + "a");
        System.out.println(t2);
        return t2;
    }
    //  Create the usual class wrapper and main method on your own

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendA()` that gets a string as an input,
//   appends an 'a' character to its end and returns the modified string
//
// - Print the result of `appendA(typo)`
}
