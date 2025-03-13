/**
 * Class (CS 123) This program prints a multiplication table up to 12 for an input number.
 * @author Bonny Vigil
 * @date 3/28/2023
 */

import java.util.Scanner;

public class MultiplicationTable
{
    /**
     * Main Method
     * @param args user inputs a number and the program outputs the multiplication table to 12 for that number
     */
    public static void main(String[] args)
    {
        System.out.println("Enter a number between 1 and 12: "); //This asks the user to input a number.
        Scanner in = new Scanner(System.in); //Recieves the number.
        int importedNumber = in.nextInt();

        for(int i = 1; i <=12; i++) //This for loop 12 sets a counter at 1, continues until the counter is 12, and adds one to the counter for each loop
        {
            for(int n = importedNumber; n <=importedNumber; n++) //This for loop takes the input number and sets n to that number, continues the loop while n is that number, and would add to n if necessary  
            {
                System.out.print(importedNumber + " x " + i + " = " + i*importedNumber); //Prints the multiplication line for each number 1-12

            }
            System.out.println(); //Prints on the next line
        }
    }
}