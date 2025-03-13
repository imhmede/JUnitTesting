/**
 * This program compares strings
 * @author: Ramon Oropesa
 * October 25,2023
 */
import.java.util.Scanner;

public class CompareStrings {
/**
 * This is the main method
 * @param args a list of possible arguments passed by the user
 */
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the first string: ");
    String string1= in.nextLine();

    System.out.println("Enter the second string: ");
    String string2= in.nextLine();

    if (string1.equalsIgnoreCase(string2)) {
      System.out.prinln("All the same")
    }
      else {
        System.out.println("neither)
    }


  }

}