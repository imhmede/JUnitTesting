
/**
 * CS123 PA_07
 * @author Joseph Padilla
 * 3/21/2023
 */

import java.util.*;

/**
 * The purpose of this program is to count the number of vowels 
 * in a word provided by the user. 
 */

public class Vowels {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        /**
         * The following section of the program will declare and initiate the necessary variables.
         */
                
        System.out.println("Enter a word:");
        String word = input.nextLine();
        int count = word.length();
        int n = 0;
        int vowel = 0;
        
        /**
         * The following while loop will execute the integer value of variable count times. 
         */
        
        while (n < count) {
            
            /**
             * The following line of code is necessary to convert the characters to strings so that they can be compared in the next if statement. 
             */
            
            String character = Character.toString(word.charAt(n));
            
            /**
             * The following if statement will compare the character/string at position n to the vowels identified in the argument. If the argument is true, 
             * the variable vowel will increase by one. If the argument is true or false, the value n will increase by one and the loop will repeat until 
             * n equals count - 1. 
             */
            
            if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u") || character.equals("y") || character.equals("A") || character.equals("E") || character.equals("I") || character.equals("O") || character.equals("U") || character.equals("Y")) {
                vowel = vowel + 1;
            }
            n = n + 1;
        }
        
        /**
         * The last line of code outputs the number of vowels to the user. 
         */
        
        System.out.println("The number of vowels in " + word + " is " + vowel);
    }
}
