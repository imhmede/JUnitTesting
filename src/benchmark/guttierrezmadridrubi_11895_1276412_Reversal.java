/* This program accepts a string input from the user and prints out the word in reverse
 * @author Rubi Madrid CS123
 * @date 04.07.2023
 */

 //imports java scanner for input
import java.util.Scanner;

public class Reversal
{
    /* This recursion cycle method calls itself and extracts the substring at index 1 and prints the character at index 0
       while the word length is greater than 0
     *@param word This is the string parameter to reverse method
     *@return word This closes the recursion cycle 
    */ 
  public static String reverse(String word)
  {
    //if pre-condition is true (if the length of the word is greater than zero )
    if (word.length() > 0)
    {
        //extracts substring at index 1
        reverse(word.substring(1));

        //prints out character at index 0 
        System.out.print(word.charAt(0));
    }
    return word; //base case, ends recursion cycle
  }

  /*This is the main method which calls reverse method
   * @param a series of command-line arguments
   */
  public static void main (String[] args)
  {
    //calls scanner utility
    Scanner in = new Scanner(System.in);

    //prompts user to enter a word
    System.out.println("Enter a word:");

    //stores user input in string word
    String word = in.next();

    //calls for reverse method
    reverse(word);

  }
}
