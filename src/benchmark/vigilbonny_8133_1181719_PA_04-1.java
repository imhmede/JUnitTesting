/**
 * (CS 123)  This program compares two strings 
 * @author Bonny Vigil
 * @date 2/27/2023
 * Assignment Title: PA_04
 */

 import java.util.Scanner;

 public class PA_04
{
    /**
     * This method compares two strings.  It is the main method.
     * @param args      if statement to compare to strings that a user will input - answers: "all the same" or "neither"
     */
    public static void main(String[] args)
    {
        System.out.println("Enter a first string: "); //user inputs a string, stored as firstString

        Scanner in = new Scanner(System.in);
        String firstString = in.next();

        System.out.println("Enter a second string: "); //user inputs a second string, stored as secondString

        in = new Scanner(System.in);
        String secondString = in.next();

        if (firstString.equals(secondString)) //if statement to compare the two strings with two possible responses ("all the same" or "neither")
        {
            System.out.println("All the same.");
        }

        else
        {
            System.out.println("Neither");
        }

    }
}