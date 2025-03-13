/**
 *Kayla Van Curen
 *4-7-2023
 *CS 123 - Computer Science 1
 *Assignment- PA 09
*/

import java.util.Scanner;

public class StringRecursiveReversal {
  public static String reverse(String str) {
    int len = str.length();
    String result = "";


    //for(int i = 0;i<len;i++){
    for (int i = len - 1; i >= 0; i--) {
      //result += str.substring(len - i - 1,len - i - 1+1);
      result += str.charAt(i);
    }
    return result;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String str = scanner.nextLine();
    System.out.println("Reversed string: "+ reverse(str));
    scanner.close();
  }
}

