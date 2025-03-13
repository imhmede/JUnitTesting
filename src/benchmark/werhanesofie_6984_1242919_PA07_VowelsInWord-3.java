/**
 * PA07: Reads a word inputed by the user and prints the number of vowels, where vowels are assumed to be a, e, i, o, u, and y.
 * @author  Werhane
 * @date 2023.03.15
 */


//imports a scanner to get user input later
import java.util.Scanner;

//establishes the class
public class PA07_VowelsInWord
{
    /**
     * The main method.
     * @param   args    recieves a series of command-line arguements from the user
     */
    public static void main(String[] args)
    {
        //initializes a scanner to get user input
        Scanner in = new Scanner(System.in);

        //prompts the user to enter a word, converts it to lower case to make it easier to compare and print later, and assigns it to a variable string word
        System.out.print("Enter a word: ");
        String word = in.next().toLowerCase();

        //initializes a variable integer vowelCount, which will be used in the loop to keep track of the number of vowels
        int vowelCount = 0;

        //loops through all the characters in the word
        for(int i = 0; i < word.length(); i++)
        {
            //increases vowelCount by one if the letter at index i is a vowel
            if(word.substring(i, i+1).matches("a|e|i|o|u|y"))
            {
                vowelCount++;
            }
        }

        //prints the result, using is if there is one vowel and are if there are mutiple vowels
        if(vowelCount == 1)
        {
            System.out.println("There is one vowel in the word " + word + ".");
        }
        else
        {
            System.out.println("There are " + vowelCount + " vowels in the word " + word + ".");
        }
    }
}