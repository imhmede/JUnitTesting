import java.util.Scanner;

/**
 * This program uses recursion to write a string input in reverse order
 * @author: Ramon Oropesa
 * November 12, 2023
 */
public class reverseString {

  //creating base case for recursion method- this method will reverse the input string
  public static String reverseString(String inputString) {

    if (inpuString.lengthj() <=1) {
      return inputString; 
    }
    //Reversing the string 
    return reverseString(inputString.substring(1)) + inputString.charAt(0);
  }

  /**
  * This is the main method. This is where the recursion method will be implemented
  * @param args a list of possible command-line arguments
  */
  public static void main (String[] args) {
    Scanner in = new Scanner(system.in); 

    String userInput; 

  System.out.println("Enter a string: " ); 
  userInput= scanner.nextLine(); 

    //Calling the reverseString 
  String stringReversed = reverseString(userInput); 

  System.out.println("The reversed string is: " + stringReversed); 
  }

}
