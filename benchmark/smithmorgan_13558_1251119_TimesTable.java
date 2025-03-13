/**
*This program reads a number between 1 and 12 and prints the multiplication table 
*@author Morgan Smith
*@03-28-2023
*/

import java.util.Scanner;

public class TimesTable
{
    /**
     * This is the main method
     * @param args a list of command line arguments
     */
    public static void main(String[] args) //This is the main method
    {
        System.out.println("Please enter a number between 1 and 12: "); //Prompts the user to input a number between 1 and 12
        Scanner in = new Scanner(System.in); //allows user inputs
        int Number = in.nextInt(); //assigns user input to int variable Number
        for(int i = 0; i <= 12; i++) //for loop that increcrements the the counter i from 0-12 in 
        {
            int Product = Number * i; // assigns the product to a variable that is used to print the answer
            System.out.printf("%d * %d %s %d \n", Number, i, "=", Product); //uses printf in order to print the line of multiplication
        }
    }
}