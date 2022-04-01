package com.examples.file_manipulations.reading_files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Path filePath = Paths.get("assets/lorem-ipsum.txt");
        Path filePath = Paths.get("my_file.txt");
        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String List
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0)); // Prints the first line of the file
        } catch (IOException e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}
// Write a program that opens a file called "my-file.txt" and prints each
// line from the file.
// If the program is unable to read the file (for example the file does not exist),
// it should print the following error message: "Unable to read file: my-file.txt".
