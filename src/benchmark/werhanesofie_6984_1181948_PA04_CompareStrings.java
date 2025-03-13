/**
 * PA04: this program recieves two strings from the user, compares them, and prints all the same if they are identical or neither otherwise.
 * @author Lincoln Werhane
 * @since 2023.02.21
 * @version 1
 */


 import java.util.Scanner;  //will recieve user input later on

 public class PA04_CompareStrings
 {
    /**
     * The main method.
     * @param args a list of user command-line arguments.
     */
    public static void main(String[] args)
    {
        /*
         * creates a scanner to recieve user input
         * prints a message prompting user input
         * stores user input as a variable
         * prints a message prompting user input
         * stores user input as a variable
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = in.nextLine();
        System.out.println("Enter the second string:");
        String secondString = in.nextLine();


        /*
         * prints "all the same" if the two strings are identical
         * prints "neither" if the two strings are not identical
         */
        if(firstString.equals(secondString))
        {
            System.out.println("all the same");
        }
        else
        {
            System.out.println("neither");
        }
    }
 }