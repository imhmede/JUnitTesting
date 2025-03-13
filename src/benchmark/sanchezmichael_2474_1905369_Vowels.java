/**
 * This program counts and outputs vowels of string input.
 * @author Michael Sanchez
 * Octover 30th 2023
 */

import java.util.Scanner;

public class Vowels {
    /**
     * This is the main method
     * @param   args    a list of possible command-line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = in.next();
        int vCount = 0;
        
        for (int index = 0; index < word.length(); index ++) { 
            char letter = word.charAt(index); //pulls character beginning at 0
            String let = Character.toString(letter); //convert character to string to allow case to be ignored
            //Checks the current let let against each vowel regardless of capitilization
            if (let.equalsIgnoreCase("a") || let.equalsIgnoreCase("e") || 
            let.equalsIgnoreCase("i") || let.equalsIgnoreCase("o") || 
            let.equalsIgnoreCase("u") || let.equalsIgnoreCase("y")) {
                vCount++; //increases if let was found to be a vowel
            }
        }
        System.out.println("The number of vowels in " + word + " is " + vCount + ".");
        //Prints original word along with how many vowels were found.
    }
    
}
