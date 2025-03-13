/**
This program takes a single string input and translates it into a number grade.
@author Daniel Sanchez
@version 1
Assignment: PA05
Date 3/10/2023
*/
import java.util.Scanner;
public class gradeTranslator {
/**
     * This method takes a input and compares boolean statments ("if" "else if") to display a result.
     * @varargs multiple int intialized: gradeA, gradeB, gradeC, gradeD, and gradeF
     * @param args input is given by program user
     * @param args string userInput1 is comparard to a variable parameter
     * @param args if else determines output and displays message of outcome
     */
    public static void main(String[] args)
    {
        int gradeA = 4, gradeB = 3, gradeC = 2, gradeD = 1, gradeF = 0; //Intialized variables as integers for numeric value
        Scanner in = new Scanner(System.in);  // Created a Scanner object
        System.out.println("Enter a letter grade: "); // Ask for input 1
        String userInput1 = in.nextLine();  // Read user input 1
        in.close(); // closes scanner
        //Below is a "if" "else if" that checks if a parameter is true and then displays a result/
        if(userInput1.equals("A")) // if statement with parameter A
        {
            System.out.println("The numeric value of the letter grade " + userInput1 + " is " + gradeA); //Display as result number 4
        }
        else if(userInput1.equals("B")) // else if statement with parameter B
        {
            System.out.println("The numeric value of the letter grade " + userInput1 + " is " + gradeB); //Display as result number 3
        }
        else if(userInput1.equals("C")) // else if statement with parameter C
        {
            System.out.println("The numeric value of the letter grade " + userInput1 + " is " + gradeC); //Display as result number 2
        }
        else if(userInput1.equals("D")) // else if statement with parameter D
        {
            System.out.println("The numeric value of the letter grade " + userInput1 + " is " + gradeD); //Display as result number 1
        }
        else if(userInput1.equals("F")) // else if statement with parameter F
        {
            System.out.println("The numeric value of the letter grade " + userInput1 + " is " + gradeF); //Display as result number 0
        }else{
            System.out.println("Error: Invalid input. Please enter: A, B, C, D, or F next time. Program terminating. "); // else parameter that displays error if A,B,C,D,F are not used as input
        }
    }
}