import java.util.Scanner;
/*
 * Author: Derek White
 * Date: 4 October 2022
 *
 * The purpose of this program is to take a string input of numbers, and output the numbers
 * broken up individually.
 */
public class numberSplit {
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter some numbers, unseparated by spaces: ");
      String stringInput = userInput.next();
      for(int i = 0; i < stringInput.length(); ++i){
	 String individualNumbers = Character.toString(stringInput.charAt(i));
	 System.out.println(Integer.parseInt(individualNumbers));
      }
   }
}
