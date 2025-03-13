/*
Maxwell Whitaker
May 6, 2023
PA14
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineCounting {
    public static void main(String[] args) throws IOException {
        // Create a Scanner to read user inputs
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the input file name
        System.out.print("Enter the input file name: ");
        String inputFileName = scanner.nextLine();

        // Prompt the user to enter the output file name
        System.out.print("Enter the output file name: ");
        String outputFileName = scanner.nextLine();

        // Open the input file and output file
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

        // Read each line in the input file and write it to the output file with line numbers
        String line;
        int lineNumber = 1;
        while ((line = reader.readLine()) != null) {
            // Write the line number and the line content to the output file
            writer.write("/* " + lineNumber + " */ " + line);
            writer.newLine();

            // Increment the line number
            lineNumber++;
        }

        // Close the input file and output file
        reader.close();
        writer.close();
    }
}
