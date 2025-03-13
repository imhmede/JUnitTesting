/**
 * Class CS 123; Assignment PA 07; This program outputs the number of vowels in an input word.
 * @author Bonny Vigil
 * @date 3-18-2023
 */

import java.util.Scanner;

public class VowelDetector
{
    /**
     * Main Method
     * @param args A user inputs a single word and the program uses a for loop to identify and count the number of vowels (a, e, i, o, u, and y) and outputs the number
     */
    public static void main(String[] args)
    {
        System.out.println("Enter a word: "); // This asks the user to input a word.
        
        Scanner in = new Scanner(System.in); //This accepts the input word.
        String word = in.next();

        int vowel = 0; //This sets the vowel count to 0.

        for (int counter = 0; counter <= (word.length()-1); counter++) //This is the for loop to run for each letter of the input word.
        {
            String wordLowerCase = word.toLowerCase(); //This turns the word to all lowercase letters.
            char letter = wordLowerCase.charAt(counter); //This separates each letter from the word into its own character.
            char vowelA = 'a'; //Each of these character declarations is for a vowel that will be scanned for.
            char vowelE = 'e';
            char vowelI = 'i';
            char vowelO = 'o';
            char vowelU = 'u';
            char vowelY = 'y';

            if (letter == vowelA || letter == vowelE || letter ==vowelI || letter == vowelO || letter == vowelU || letter == vowelY)
            //The above if statement is to identify vowels in the lowercase word.
            {
            vowel++; //This counts how many vowels are in the word.
            }
            
        }
        System.out.println("The number of vowels in " + word + " is: " + vowel); //This outputs the number of vowels in the word.
    }
}