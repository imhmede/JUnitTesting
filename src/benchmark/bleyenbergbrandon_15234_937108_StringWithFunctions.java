/*
*          Class: CS 123 Computer Science 1
*          Description: Lab5B: Functions with a string
*          Author: Brandon Bleyenberg
*          Date: 10/30/2022
*/

import java.util.Scanner;

public class StringWithFunctions {
   public static void main(String[] args) {
      //Scanner object
      Scanner in = new Scanner(System.in);
      String userString;
      int repeatValue;
      
      //Print and read statement for the user string
      System.out.print("Enter your string: ");
      userString = in.nextLine();
      //Print and read statement for how many times the user wants their string to be repeated
      System.out.print("Enter the amount of times you want the string repeated: ");
      repeatValue = in.nextInt();
      
      //Print statement for the return values of my functions
      System.out.println("The middle character(s) is: '" + middle(userString) + "'" + "\nRepeated string: " + repeat(userString, repeatValue) + "\nNumber of vowels in the string: " 
                         + countVowels(userString) + "\nThe amount of words are: " + countWords(userString));
   }
   
   /**
    * Finds the middle character(s) of the inputted string
    * @param str user inputted string
    * @return middle character(s) of the string
    */
   public static String middle(String str) {
      //Returns two middle characters if the string has an even amount of characters
      if (str.length() % 2 == 0) {
         return Character.toString(str.charAt((str.length() / 2) - 1)) + Character.toString(str.charAt(str.length() / 2));
      }
      //Returns the middle character if the string has an odd amount of characters
      else {
         return Character.toString(str.charAt((str.length() / 2))); 
      }   
   }
   
   /**
    * Repeats the inputted string 
    * @param str user inputted string
    * @param n amount of times the user wants the string
    * @return the string repeated n times
    */
   public static String repeat(String str, int n) {
      //Variable declaration and initialization
      String repeatString = "";
      //Statement to build the string
      for (int i = 1; i <= n; i++) {
         repeatString = repeatString + str;  
      }
      return repeatString;
   }
   
   /**
    * Counts the vowels in the inputted string
    * @param str user inputted string
    * @return the number of vowels
    */
   public static int countVowels(String str) {
      //Variable declarations and initializations
      String vowels = "AaEeIiOoUu";
      int counter = 0;
      //Loop checking over every character of the user string
      for (int i = 0; i < str.length(); i++) {
         //Loop checking over every vowel in the created string
         for (int j = 0; j < vowels.length(); j++) {
            //Counter goes up if the character in the user string is the same as a checter in the vowel string
            if (str.charAt(i) == vowels.charAt(j)) {
            counter++;
            
            //Ends the second loop if the characters match
            break;
            }
         }
      }
      return counter; 
   }
   
   /**
    * Counts the words in the string
    * @param str user inputted string
    * @return the number of words in the string
    */
   public static int countWords(String str) { 
      //Variable declarations and initializations
      int counter = 0;
      boolean wordFinder = true;
      //Loop checking over every character in the user string
      for (int i = 0; i < str.length(); i++) {
         //Compares if the character is not a whitespace and the value of the boolean
         //Boolean stops repetitve counting of the whitespaces as new words
         if (str.charAt(i) != ' ' && wordFinder == true) {
            counter++;
            wordFinder = false;
         }
         //Resets the boolean to stop repetitive counting
         else if (str.charAt(i) == ' ') {
            wordFinder = true;
         }
      }
      return counter;       
   }
}     

