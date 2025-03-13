/*
 * This program prints identical strings
 * @author Mwali Kuya
 */

public class Main {
 /*
 *This method compares two strings to see if they identical
 *@Param A list of command lines passed by the user
 */
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        int grade = scanner.nextInt();

        char letterGrade;

        if (grade >= 90 && grade <= 100) {
            letterGrade = 'A';
        } else if (grade >= 80 && grade < 90) {
            letterGrade = 'B';
        } else if (grade >= 70 && grade < 80) {
            letterGrade = 'C';
        } else if (grade >= 60 && grade < 70) {
            letterGrade = 'D';
        } else if (grade < 60 && grade > 0) {  // Error 1: Corrected the condition here.
            letterGrade = 'F';
        } else {  // Error 2: Added a missing case for grade = 0.
            System.out.println("Invalid grade entered. Please enter a grade between 0 and 100.");
            return;
        }

        System.out.println("Your letter grade is: " + letterGrade);
    }
 
}
