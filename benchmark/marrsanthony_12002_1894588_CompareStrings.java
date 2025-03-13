/** 
 * This program compares two strings to see if they are identical, ignoring case sensitivity.
 * @author CS123 Anthony Marrs
 * Oct 25, 2023
*/

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Close the scanner to release resources
        scanner.close();

        // Compare the strings while ignoring case sensitivity
        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("All the same");
        } else {
            System.out.println("Neither");
        }
    }
}