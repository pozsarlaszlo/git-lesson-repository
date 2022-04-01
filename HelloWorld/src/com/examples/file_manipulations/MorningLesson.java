package com.examples.file_manipulations;
//Be careful about NIO package
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MorningLesson {

    public static void main(String[] args)  {

        //Compile time error - syntax error
        String s = "amy";
        //int n = "string";
        System.out.println(s);
        //Runtime errors
        int a = 10, b = 0;
        //This is unchecked exception
        //int c = a / b;
        //System.out.println(c);

        //Checked exception
        if (b == 0){
            //Here we are throwing an exception, if we dont handle the exception, program will stop
            //You can also create your own custom exceptions
            //throw new CustomException();
            //throw new ArithmeticException("Cannot divide by 0!");
        } else {
            int result = a / b;
            System.out.println(result);
        }

        try {
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.err.println("You cannot divide by 0!!");
        }




        //Error - the program cannot recover from an error, program will stop running/working
        //Exception - the program can recover from exception because we can handle exceptions

        //Checked exceptions - we know about the exceptions, we handle them, its checked during compilation time
        //Unchecked exceptions - we dont know about them, we dont handle them, can occur during runtime

        // try catch block is used for handling exceptions, it will prevent our program from stopping
        int[] array = new int[2];
        System.out.println("Accessing element on first position " + array[0]);


        try {
            System.out.println("Accessing element on first position " + array[1]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("You are trying to access element out of bounds!");
        } catch (NullPointerException exception2) {
            System.err.println("Null pointer occured");
        } catch (Exception exception3){
            System.out.println(exception3.getMessage());
            // Its always executed
        } finally {
            //Its executed even the program will fail (we didnt handle the exception)
            System.out.println("Always executed");
        }

        System.out.println("here!!!");

        //Absolute path - from disk C
        //For windows users => C:\\home\\amy\\Desktop\\...
        // Linux/iOs users => /home/amy/Desktop/GFA/fileio/capital.txt

        //Relative path - from the content root, preferable to use relative paths
        //capital.txt

        Path path = Paths.get("capital.txt");

        try {
            readFile(path);
        } catch (IOException e){
            System.err.println("Not existing file!");
        } catch (ArrayIndexOutOfBoundsException e2){
            System.err.println("You are out of bounds!!");
            e2.printStackTrace();
        } catch (Exception e3) {
            System.err.println("Something went wrong");
            e3.printStackTrace();
        }


        Path new_path = Paths.get("new_file.txt");
        //Write into the files
        List<String> newLines = new ArrayList<>();
        newLines.add("This is first line");
        newLines.add("This is second line");

        //This is overwriting the file
        try {
            Files.write(new_path, newLines);
        } catch (IOException e) {
            // e.printStackTrace();
            System.err.println("File not found");
        }

        // This is appending to the file
        //Files.write(new_path, newLines, StandardOpenOption.APPEND);




    }

    public static void readFile(Path path) throws IOException, ArrayIndexOutOfBoundsException {
        //Each element in the List is each line in the FILE!!!
        List<String> lines = Files.readAllLines(path);
        //Printing line 12 from a text file
        System.out.println(lines.get(11));
        for (String line : lines) {
            //   System.out.println(line);
        }

        //We want to filter out and store it to the new list all countries that starts with letter A
        List<String> countries = new ArrayList<>();
        for (String line : lines){
            if (line.toLowerCase().startsWith("a")){
                //regex == regular expression = is a good topic for a LT
                String[] country = line.split("\\s+");
                countries.add(country[10]);
            }
        }

        for (String c : countries){
            System.out.println(c);
        }
    }

}