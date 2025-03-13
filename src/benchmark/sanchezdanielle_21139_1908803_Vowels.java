/** 
 * This program prints the number of vowels (a,e,i,o,u,y) in a word inputted by the user
 * @author Danielle Sanchez
 * Date: October 31,2023
 */
 
 import java.util.Scanner;
 public class Vowels
 { 
    /**
     * This is the main entry of the program
     * @param args a list pf possible arguments passed by the user
     */
     public static void main(String[] args)
     {
         Scanner in = new Scanner (System.in);
         System.out.println("Enter a word: ");
         String word = in.next();
         
         /*Determine how many letters in the word*/
         int word_number = word.length();
         
         /*Declare the vowels and compare to the word to get number of vowels*/
         int num_vowels = 0;
         for(int i=0; i<word_number; i++)
         {
             char vowels = word.charAt(i);
             if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u' || vowels == 'y')
             {
                 num_vowels++;
             }
         }
         System.out.println("The number of vowels in " + word + " is " + num_vowels);
     }
 }