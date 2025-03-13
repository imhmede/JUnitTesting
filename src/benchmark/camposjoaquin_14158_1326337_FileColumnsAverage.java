/*
Joaquin Campos
05-01-2023
Programming Assignment 13
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads pairs of numbers from a file and computes their average.
 */
public class FileColumnsAverage {

    /**
     * Reads pairs of doubles from a file, computes their average, and prints the result.
     *
     * @param args an array of command-line arguments containing the name of the file to be read.
     * @throws FileNotFoundException if the file specified in the command line cannot be found.
     */
    public static void main(String[] args) throws FileNotFoundException {

        // Prompt the user for the file name
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the name of the file including including the path where it is located: ");
        String inputFileName = console.next();

        // Create a File object representing the input file
        File file = new File(inputFileName);

        // Create a Scanner object to read from the input file
        Scanner in = new Scanner(file);

        // Initialize variables for tracking line number, index, sum, and stored value
        int line = 1;           // line number
        int index = 0;          // index of current number in line
        double sum = 0;         // sum of the two numbers in the current line
        double storedValue = 0; // the first number in the current line

        // Loop through each token in the file
        while (in.hasNext()) {

            // If the token is a double, add it to the sum and process the line
            if (in.hasNextDouble()) {
                double value = in.nextDouble();
                sum += value;

                // If this is the second number in the line, compute the average and print the results
                if (index % 2 == 1) {
                    double average = sum / 2;
                    System.out.printf("line(%d): %.2f   %.2f\n        average = (%.2f + %.2f)/2 = %.2f\n",
                            line, storedValue, value, storedValue, value, average);
                    line++;
                    sum = 0;
                }
                // If this is the first number in the line, store it for later
                else {
                    storedValue = value;
                }

                // Increment the index
                index++;
            }
            // If the token is not a double, skip it
            else {
                in.next();
            }
        }

        // Close the input file
        in.close();
    }
}