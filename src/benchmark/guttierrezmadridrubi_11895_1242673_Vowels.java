/**This program accepts a word input from the user and displays the number of vowels in the word.
 * @author Rubi Madrid CS123
 * @date 03.24.2023
 * @param word the string entered by the user
 * @param vowelNumber the number of vowels in the word
 * @param i the counter for the for loop
 * @param letter the character at the current counter index
 */

 //import scanner for later//
 import java.util.Scanner;

 public class Vowels
 {
    public static void main (String[]args)
    {
        //calling scanner
        Scanner in = new Scanner(System.in);

        //prompt user to enter word
        System.out.println("Enter a word:");

        //assigns input to variable
        String word = in.next();

        //sets up counter for number of vowels in word
        Integer vowelNumber = 0;


        //for statement that sets up counter i and adds 1 for every letter in the word
        for (Integer i = 0; i < word.length(); i++)
        {
            //converts the letter at index i into a character and assigns it to variable letter
            Character letter = Character.toLowerCase(word.charAt(i));
            
            //if statement that compares the letter to vowel character
           if (letter == 'a' || letter == 'e' || letter == 'i'|| letter == 'o' || letter == 'u' || letter == 'y')
           {    
                //adds vowel if one is found
                vowelNumber++;
           }
        }
        //prints out amount of vowels in word
        System.out.println("The number of vowels in " + word + " is " + vowelNumber);
    }   
 }