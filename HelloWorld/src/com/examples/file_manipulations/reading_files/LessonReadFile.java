package com.examples.file_manipulations.reading_files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;

public class LessonReadFile {
    public static void main(String[] args) {
        // Path filePath = Paths.get("assets/lorem-ipsum.txt");
        Path filePath = Paths.get("C:\\Users\\laszl\\próba.txt");
        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String List
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0)); // Prints the first line of the file
        } catch (IOException e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}
