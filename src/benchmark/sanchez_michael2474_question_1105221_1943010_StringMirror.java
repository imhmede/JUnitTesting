/**
 * A program that calls a function to reverse a string.
 * @author Michael Sanchez
 * November 11, 2023
 */
import java.util.Scanner;

public class StringMirror {

public static void main(String[] args) {
    /**
     * List of parameters that is used in the main method
     * @param args uInput is string provided by the user
     * @param args index is the length of the string
     * @param args letter is the character found at the designated location.
     */
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string.");
      String uInput = in.next(); 
        reverseString(uInput);
        }
  public static String reverseString(String uInput) {
      int index = uInput.length();
      for (int i = index - 1; i >= 0; i--) { 
          char letter = uInput.charAt(i);
          System.out.print(letter);
      }
      System.out.println();
      return uInput;
  }
}