package com.examples.file_manipulations.writing_files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class LessonWriteFile {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Na sikerül-e átírni?");
        Path filePath = Paths.get("C:\\Users\\laszl\\próba.txt");

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}
