/** This is a program that takes a user input as a string and gives an output that indicates
 * how many vowels are in the string
 * DallanSilver
 * CS123 PA5
 * 10/29/2023
 */
import java.util.Scanner;

public class Vowels {

    /** Entry point for code that recieves input and argues a string output
     * @param   args   use for loops to check string and argue output
     */
    public static void main(String[] args) {
        // taking the user input

    Scanner in = new Scanner(System.in);
    System.out.println("please enter a word");
      String Word = in.next();
      int vowels = 0;

      // Starting for loop

      for(char c : Word.toCharArray()) 
      {
         if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
            ++vowels;
         }
      }
      System.out.println("String "+ Word +" has "+ vowels + " vowels.");
   }
}