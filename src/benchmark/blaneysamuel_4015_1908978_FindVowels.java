/**
 * This program prints the number of vowels contained in an input collected from the user.
 * @author Samuel Blaney
 * @since Oct 31, 2023
 */
import java.util.Scanner; // import scanner from java.util package.

public class FindVowels {

  /**
   * This is the main method where the user provided string is examined for vowels.
   * @param args  A list of possible command-line arguments passed by the program.
   */
  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter a word:"); 
    String userWord = in.nextLine(); // collects string from user.

   int  vowelCounter = 0; // initialize counter for vowel number.

   /* For loop that passes through each character in userWord, converts each character from userWord to a string, and compares the characters as strings to the vowels ignoring case sensitivity. */
    for (int i = 0; i < userWord.length(); i++) {
     char character = userWord.charAt(i);
      if (Character.toString(character).equalsIgnoreCase("a") || 
          Character.toString(character).equalsIgnoreCase("e") ||
          Character.toString(character).equalsIgnoreCase("i") || 
          Character.toString(character).equalsIgnoreCase("o") || 
          Character.toString(character).equalsIgnoreCase("u") || 
          Character.toString(character).equalsIgnoreCase("y")) { 
        vowelCounter++;
      }
    }

    System.out.printf("The number of vowels in %s is %d%n", userWord, vowelCounter); // printing number of vowels to the user. 
  }
}



