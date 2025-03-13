/**
This program takes two string inputs and determines if they are identical.
@author Daniel Sanchez
@version 1
Assignment: PA04
Date 3/6/2023
*/
import java.util.Scanner;
public class stringAnalogy {
    
/**
     * This method takes two inputs and runs a simple 'if else' statement.
     * @param args input is given twice by program user
     * @param args string userInput1 is comparard to string userInput2
     * @param args if else determines output and displays message of outcome
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);  // Created a Scanner object
        System.out.println("Enter the first string: "); // Ask for input 1
        String userInput1 = in.nextLine();  // Read user input 1
        System.out.println("Enter the second string: "); // Ask for input 2
        String userInput2 = in.nextLine();  // Read user input 2
        in.close(); //closes scanner no more parameters
        /** if else statement below checks if input is 'all the same' else it is 'neither'  */
        if (userInput1.equals(userInput2)) // if statement parameters string.equals(string)
        {
        System.out.println("ALL the same"); //Display if parameters of "if" were met
        }
        else
        System.out.println("neither"); //Display if parameters of "if" were not met
    }
}