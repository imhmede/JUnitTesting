/*
Joaquin Campos
02-21-2023
Programming Assignment 05
*/

import java.util.Scanner; // Imports Scanner from java.util
public class CS123_PA05 {
public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // Sets up Scanner
        
        System.out.print("Enter a letter grade: ");
        char input = in.next().charAt(0); // Awaits input
        char letterGrade = Character.toUpperCase(input); // Guarantees lowercase letter grades are interpreted
        
        if (letterGrade == 'A') { // Checks if letter grade is A
            System.out.print("The numeric value of the letter grade A is 4.");
        }
        
        else if (letterGrade == 'B') { // Checks if letter grade is B
            System.out.print("The numeric value of the letter grade B is 3.");
        }
        
        else if (letterGrade == 'C') { // Checks if letter grade is C
            System.out.print("The numeric value of the letter grade C is 2.");
        }
        
        else if (letterGrade == 'D') { // Checks if letter grade is D
            System.out.print("The numeric value of the letter grade D is 1.");
        }
        
        else if (letterGrade == 'F') { // Checks if letter grade is F
            System.out.print("The numeric value of the letter grade F is 0.");
        }
        
        else { // After exhausting all possible letter grades, prints the termination message
            System.out.print("Invalid letter grade. Program is terminated.");
        }
    }
}