/**
 *This program counts the number of vowels "a,e,i,o,u,y" in a user input string.
 *@author Kyle Dean
 *30 Oct 2023
 */

import java.util.Scanner;

public class Vowels
{
    /**
     *This is the main method
     *@param args a list of command line arguments which may be input by the user
     */

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word:\n");

        String user_string = in.next();
        final String vowel_string = "aeiouy";

        int place_value;
        int current_vowel;
        int counter = 0;

        for (place_value = 0; place_value<user_string.length(); place_value++) //This iterates over the user input string
        {
            for (current_vowel = 0; current_vowel<6; current_vowel++) //This iterates over a set string containing the vowels to be checked against
            {
                if((user_string.substring(place_value,place_value+1)).equalsIgnoreCase(vowel_string.substring(current_vowel,current_vowel+1)))
                {
                    counter++;
                }
            }
        }

        System.out.println("The number of vowels in " + user_string +" is " + counter);

    }

}