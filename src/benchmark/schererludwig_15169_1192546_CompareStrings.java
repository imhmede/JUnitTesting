/**
 * This program compares two Strings and determines whether they are equal or different from eachother
 * @author Ludwig Scherer
 * @date 03-04-2023
 */

import java.util.Scanner;

public class CompareStrings 
{
    /**
     * The main method
     * @param args a list of command-line arguments
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String firstWord = in.next(); /** first string input */
        System.out.println("Please enter another word:");
        String secondWord = in.next(); /** second string input */
        if (firstWord.compareTo(secondWord) == 0) /** Compares both strings to eachother and makes a decision based on the outcome */
        {
            System.out.println("All the same");
        }
        else
        {
        System.out.println("neither");
        }
        in.close();
    }
}
