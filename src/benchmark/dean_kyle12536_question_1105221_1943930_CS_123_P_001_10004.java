/**
*This program reverses a string input by the user and prints the result of the reversal.
*@author Kyle Dean
*12 November 2023
*/

import java.util.Scanner;

public class StringReverser
{
    /**
    * This is the method that reverses a string passed as an argument.
    * @param inputstring The string which is input to be reversed.
    */

    public static String reverseString(String inputstring)
    {
        if (inputstring.length() <= 1)
        {
            return inputstring;
        }

        return (reverseString(inputstring.substring(1)) + inputstring.charAt(0));

    }


    /**
    * This is the main method and serves as the entry point to the program
    * @param args A list of command line arguments which may be passed by the user.
    */

    public static void main (String[] args)
        {
            Scanner in = new Scanner(System.in);

            System.out.print("Please input the string that you wish to reverse:\n");

            String inputstring = in.nextLine();

            System.out.print(reverseString(inputstring));

        }

}