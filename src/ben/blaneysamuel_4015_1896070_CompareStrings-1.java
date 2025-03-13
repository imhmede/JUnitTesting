/**
 * This program collects and chekcs if two strings are identical or not.
 * @author Samuel Blaney
 * @since Oct 25, 2023
 */
import java.util.Scanner;

public class CompareStrings {
  /**
   * This is the main  method where user string inputs will be compared.
   * @param args  a list of possible command-line arguments passed by the program.
   */
    public static void main(String [] args) {

    //collecting strings from user
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your first string: ");
    String stringOne = in.next();
    System.out.println("Enter your second string: ");
    String stringTwo = in.next();
    
    //comparing string inputs from user
    if (stringOne.equalsIgnoreCase(stringTwo)) {
      System.out.println("all the same");
    } else {
      System.out.println("neither");
    }
  }
}
