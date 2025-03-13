/** 
 * This program finds the grade given the provided table.
 * @author CS123 Anthony Marrs
 * Oct 25, 2023
*/

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your numeric grade (0-100): ");
        int numericGrade = scanner.nextInt();

        // Close the scanner to release resources
        scanner.close();

        // Map the numeric grade to a letter grade
        String letterGrade;

        if (numericGrade >= 90 && numericGrade <= 100) {
            letterGrade = "A";
        } else if (numericGrade >= 80 && numericGrade < 90) {
            letterGrade = "B";
        } else if (numericGrade >= 70 && numericGrade < 80) {
            letterGrade = "C";
        } else if (numericGrade >= 60 && numericGrade < 70) {
            letterGrade = "D";
        } else if (numericGrade >= 0 && numericGrade < 60) {
            letterGrade = "F";
        } else {
            letterGrade = "Invalid input. Grade must be between 0 and 100.";
        }

        System.out.println("Your letter grade is: " + letterGrade);
    }
}