/**
 * This program collects a string from the user and prints the string reverse.
 * @author Samuel Blaney 
 * @since Nov 12, 2023
 */

import java.util.Scanner; // importing Scanner class

public class StringReversal { 
  /**
   * This is the main entry point of the program.
   * @param	args	list of possible command-line arguments.
   */
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word to reverse: "); // collecting word from user
    String userWord = in.nextLine();
    String userWordReverse = reverseString(userWord);
    System.out.println(userWord);
    System.out.println(userWordReverse);
  }

  /**
   * Method reverses given word.
   * @param str word from user
   * @return the reversed word
   */
  public static String reverseString(String str) {
      char[] charArray = str.toCharArray();
      int begin = 0;
      int end = charArray.length - 1;

      while (begin < end) {

	  char temp = charArray[begin];
	  charArray[begin] = charArray[end];
	  charArray[end] = temp;
	  //moving thorugh array
	  begin++;
	  end--;
      }

      return new String(charArray);
    }
      
  }

