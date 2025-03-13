/**
 * (CS 123, PA_10) This program prints an input word backwards.
 * @author Bonny Vigil
 * @date 04/06/2023
 */
import java.util.Scanner;

public class ReverseOutput
{
    /**
     * This method reverses the letters in the input word.
     * @param str an input of a string, a word from the main method.
     * @return the new letter string
     */
    public static String reverse(String str)
    {
        String newLetters = ""; //this opens up the method to work with a new string
        
        for(int i = str.length(); i>=1; i--) //a for loop to work from the end of the string back to the beginning
        {
            newLetters = str.substring((i-1), i); 
            System.out.print(newLetters);
        }
        return newLetters;
        
    }

    /**
     * This is the main method.
     * @param args prints a question for the user, imports a word, calls the reverse method
     */
    public static void main(String[] args)
    {
        System.out.println("Enter a word: "); //prints a question
        Scanner in = new Scanner(System.in); //takes in a word
        String word = in.next();

        reverse(word); //calls the main method
        System.out.println(" "); //ends the reverse word that is printed to the program ends cleanly
        
    }
}