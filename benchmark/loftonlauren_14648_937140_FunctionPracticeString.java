import javax.swing.*;

/**
 * Lauren Lofton
 * 10/30/22
 * CS 123
 * Lab 5b
 * Write the following methods and provide a program to test them. 
 * a. public static String middle(String str), 
 * returning a string containing the middle character in str if the length 
 * of the str is odd, or the two middle characters if the length of str is even.
 * b. public static String repeat(String str, int n), 
 * returning the string str repeated n times.
 * c. public static int countVowels(String str), 
 * returns a count of all vowels in the string str. 
 * d. public static int countWords(String str),
 * returning the count fall words in str. Words are separated by space.
 */
public class FunctionPracticeString {

   public static void main(String[] args) {
//Asking for input
      String myString = (JOptionPane.showInputDialog("Enter your string."));
      String multiplied = (JOptionPane.showInputDialog(
         "How many times do you want to repeat your string?"));

      int n = Integer.parseInt(multiplied);
//Multiply string input by integer input
      String newString = repeat(myString, n);
//Output
      JOptionPane.showMessageDialog(null,
                "Your string: " + myString
                + "\nYour middle character(s): " + (middle(myString))
                + "\nNumber of vowels in original string: " + countVowels(myString)
                + "\nNumber of words in original string: " + countWords(myString)
                + "\n\nYour string repeated " + n + " times: " + newString                
                + "\nNumber of vowels in repeated string: " + countVowels(myString)*n
                + "\nNumber of words in repeated string: " + countWords(myString)*n
      );
   }
//returning a string containing the middle character in str if the length of the 
//str is odd, or the two middle characters if the length of str is even.
   public static String middle(String myString) {
      int position;
      int length;
      if (myString.length() % 2 == 0) {
         position = myString.length() / 2 - 1;
         length = 2;
      } else {
         position = myString.length() / 2;
         length = 1;
      }
      return myString.substring(position, position + length);
   }
//returning the string str repeated n times.

   public static String repeat(String myString, int n) {
      String newString = "";
      for (int i = 0; i < n; i++) {
         newString += " " + myString;
                 
      }
      return newString;
   }
//returns a count of all vowels in the string str.
   public static int countVowels(String myString) {
      int count = 0;
      for (int i = 0; i < myString.length(); i++) {
         if (myString.charAt(i) == 'a' || myString.charAt(i) == 'A' 
            || myString.charAt(i) == 'e' || myString.charAt(i) == 'E' 
            || myString.charAt(i) == 'i' || myString.charAt(i) == 'I' 
            || myString.charAt(i) == 'o' || myString.charAt(i) == 'O' 
            || myString.charAt(i) == 'u' || myString.charAt(i) == 'U' ) {
            count++;
            }
      }
      return count;
   }
//returning the count of all words in str.
   public static int countWords(String myString) {
      int count = 0;
      if (!(" ".equals(myString.substring(0, 1))) 
         || !(" ".equals(myString.substring(myString.length() - 1)))) {
         for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == ' ') {
               count++;
            }
         }
         count = count + 1;
      }
      return count;
   }
}
