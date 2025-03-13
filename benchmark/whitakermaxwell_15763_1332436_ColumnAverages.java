/*
Maxwell Whitaker
May 4, 2023
PA13
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ColumnAverages {
    public static void main(String[] args) throws IOException {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Initialize variables to store the sum and count of numbers in each column
        double sumColumn1 = 0;
        double sumColumn2 = 0;
        int count = 0;

        // Open the file
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        // Read each line in the file
        String line = br.readLine();
        while (line != null) {
            // Remove leading and trailing whitespace from the line
            line = line.trim();

            // If the line is empty skip it
            if (!line.isEmpty()) {
                // Split the line into an array of strings (each string is a number)
                String[] numbers = line.split("\\s+");

                // Check if the line has two numbers before processing it
                if (numbers.length == 2) {
                    // Convert the strings to double and add them to the respective column sums
                    sumColumn1 += Double.parseDouble(numbers[0]);
                    sumColumn2 += Double.parseDouble(numbers[1]);

                    // Increment the count of rows
                    count++;
                }
            }

            // Read the next line
            line = br.readLine();
        }

        // Close the file
        br.close();

        // Calculate the averages for each column
        double averageColumn1 = sumColumn1 / count;
        double averageColumn2 = sumColumn2 / count;

        // Print the averages
        System.out.printf("Column 1 average: %.2f%n", averageColumn1);
        System.out.printf("Column 2 average: %.2f%n", averageColumn2);
    }
}
