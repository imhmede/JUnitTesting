/**
*@author Morgan Smith
*@date 04/07/2023
CS 123 PA 10
*/
import java.util.Scanner; //imports scanner that reads user input

public class Reverse
{
    /**
     * This method reverses a string starting at the second position until there is one character left in the string
     * @param str allows user input to be used in the method reverse
     * @return
     */
    public static String reverse(String str) 
    {
        if(str.length() == 1) 
        {
            return str; //was able to figure out that this was needed in order for program to run but would like to gain more understanding as to its purpose for the overall recursive function//
        }
        else
        {
            String firstCharacter = str.substring(0, 1); //assigns the first character to a variable so it can be added to the end of the word//
            return reverse (str.substring(1, str.length())) + firstCharacter; // returns data type string by taking a character starting at the second position and adding the next character to the front allowing it to be reversed//
        }
    }
    /**
     * This is the main method
     * @param args A list of command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Please enter a string: "); //Prompts user to enter a word
        Scanner in = new Scanner(System.in); //recognizes the user input
        String str = in.next(); //input is assigned to variable str
        System.out.println(reverse(str)); //prints the final reversed product- reverse is a function of the variable string (similar to f(x))
    }
}