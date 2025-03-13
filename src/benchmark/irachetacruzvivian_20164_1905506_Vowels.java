/**
 * This program reads a word provided by a user and prints the number of vowels that are in the word.
 * @author Vivian Iracheta
 * Oct. 30, 2023
 */

 import java.util.Scanner;
 public class Vowels {

    /**
     * This is the main method
     * @param   args   a list of command-line arguements passed by a user
     */
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = in.nextLine();
        int numVowels = 0;

        /**
         * Reads the string ptovided by the user and compares each letter to the vowels and checks to see if the letter is a vowel or not
         */
        for(int index = 0; index < str.length(); index++) {
            char vowelChar = str.charAt(index);              
            if(vowelChar == 'a' || vowelChar == 'e' || vowelChar == 'i' || vowelChar == 'o' || vowelChar == 'u' || vowelChar == 'y'
                || vowelChar =='A' || vowelChar =='E' || vowelChar == 'I' || vowelChar == 'O' || vowelChar == 'U' || vowelChar == 'Y') {
                numVowels++;
            }
        }        
        System.out.println("The number of vowels in " + str + " is " + numVowels);
    }             
 }