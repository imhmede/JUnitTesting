/**
 * Class - (CS 123) This program is designed to provide a number for a letter grade.
 * @author Bonny Vigil
 * @date 2-28-2023
 */

import java.util.Scanner;

public class PA_05
{
    /**
     * Main Method 
     * @param args This program takes user input of a letter grade and outputs a corresponding number
     */
    public static void main(String[] args)
    {
        System.out.println("Enter a letter grade: "); // Asks for letter grade from user

        Scanner in = new Scanner(System.in); // User inputs the letter grade
        String letterGrade = in.next();
        
        int numericalValueOfLetter = 0; // Establishes the variable for the integers for the numerical values

        if (letterGrade.equalsIgnoreCase("A")) // Conditional statement for a letter grade of A
        {
            int valueOfA = numericalValueOfLetter + 4; // Changes the integer value of the letter grade
            System.out.println("The numeric value of the letter grade A is " + valueOfA); //output the number 4
        }

        else if (letterGrade.equalsIgnoreCase("B")) // Conditional statement for a letter grade of B 
        {
            int valueOfB = numericalValueOfLetter + 3;// Changes the integer value of the letter grade
            System.out.println("The numeric value of the letter grade B is " + valueOfB);//output the number 3
        }
        
        else if (letterGrade.equalsIgnoreCase("C")) // Conditional statement for a letter grade of C
        {
            int valueOfC = numericalValueOfLetter + 2;// Changes the integer value of the letter grade
            System.out.println("The numeric value of the letter grade C is " + valueOfC); //output the number 2
        }

        else if (letterGrade.equalsIgnoreCase("D")) // Conditional statement for a letter grade of D
        {
            int valueOfD = numericalValueOfLetter + 1;// Changes the integer value of the letter grade
            System.out.println("The numeric value of the letter grade D is " + valueOfD); //output the number 1
        }

        else if (letterGrade.equalsIgnoreCase("F")) // Conditional statement for a letter grade of F
        {
            int valueOfF = numericalValueOfLetter; // Keeps the base integer value for the letter grade
            System.out.println("The numeric value of the letter grade F is " + valueOfF); //output the number 0
        }

        else //If the user inputs a character or string that is not A, B, C, D, or F, the program will output an error message
        {
            System.out.println("Invalid letter grade.  Program is terminated.");
        }
    }
}