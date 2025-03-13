/**
 * a program that determines and prints out the amount of vowels a given word has
 * @author Ludwig Scherer
 * @date 03-18-2023
 */

import java.util.Scanner;

public class Vowels 
{
    /**
     * the main method
     * @param args a list of command line arguments
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word of your choice: ");
        
        String word = in.next(); // gathers a string input from the user
        int vowelsAmount = 0;

        for(int i = 0; i < word.length(); i++) // iterates for the exact amount of loops corresponding to the amount of letters found in the string input
        {
           char currentChar = Character.toLowerCase(word.charAt(i)); // extracts one character from the word and converts it to lower case
           if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' || currentChar == 'y') // checks if the current character is a vowel
           {
            vowelsAmount++; // increases the amoutn of vowels found in the word by 1 if the condition is satisfied
           }
        }
        System.out.println("The amount of vowels in " + word + " is: " + vowelsAmount);
        in.close();
    }
}
