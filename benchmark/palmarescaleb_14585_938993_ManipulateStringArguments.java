
/*
Name: Caleb Palmares
Date: October 30th, 2022
Assignment title: Lab 5_b
This program does the following:
1. Returns middle character(s) from user input
2. Returns a repeated string as determined from user input
3. Returns all vowels from user input
4. Returns all words in a sentence from user input
*/

import java.util.Scanner;

public class ManipulateStringArguments

{
/**
Check middle
@param string
@return middle string
*/
   public static String middle(String str){
      //Declare integers
      Integer stringLength = str.length();

      Integer stringModulo = str.length() % 2;

      String returnedString = "";
      //If str count is even, return both middle characters
      if(stringModulo == 0){
         returnedString = String.valueOf(str.charAt((stringLength / 2) - 1)) + String.valueOf(str.charAt(stringLength / 2));
         return returnedString;
      }
      //If str is odd, only return middle character
      if(stringModulo == 1){
         Integer oddValuePosition = (stringLength / 2);
         returnedString = String.valueOf(str.charAt(oddValuePosition));
      }   
   //If no condition is met, return error
   if(returnedString == ""){
      return "Error returning value";
   }else{
      return returnedString;
   }

}
/**
return concat
@param string
@param int
@return middle string
*/
   public static String repeat(String str, int n){
      
      //Declare new variable for string to capture original value
      String returnString = str;

      //Loop and append passed variable
      for(int i = 0; i < n; i++){
         returnString += str;
      }
      
   return returnString;

   }
/**
return vowel count
@param string
@return int
*/
   public static int countVowels(String str){
   //Declare and initiate int
   int vowelCounter = 0;

   //Loop through str and check for vowels. If found, increment
   for (int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
         vowelCounter ++;
      }
   }

   return vowelCounter;

}


   public static int countWords(String str){
      //Split str and return new variable length
      String[] splitSentence = str.split(" ");
      return splitSentence.length;
      
   }


   public static void main(String[] args) {

      //Create scanner input for user	
      Scanner scannerBooleanInput = new Scanner(System.in);
      //Ask user to input string to parse
      System.out.print("Enter string to return middle character(s): ");
      //Store user input
      String stringInput = scannerBooleanInput.nextLine().trim();
      //Display entered string
      System.out.println("String entered: " + stringInput);
      System.out.println("Middle character(s): " + middle(stringInput));

      //Create scanner input for user	
      scannerBooleanInput = new Scanner(System.in);
      //Ask user to input string to parse
      System.out.print("Enter string and amount of repeated characters to be appended separated by a comma, e.g. (test,2): ");
      //Store user input
      String[] splitStringInput = scannerBooleanInput.nextLine().split(",");
      //Display entered string
      System.out.println("String entered: " + splitStringInput[0] + splitStringInput[1]);
      System.out.println("Returned string: " + repeat(splitStringInput[0], Integer.valueOf(splitStringInput[1])));

      //Create scanner input for user	
      scannerBooleanInput = new Scanner(System.in);
      //Ask user to input string to parse
      System.out.print("Enter string to return a count of all vowels: ");
      //Store user input
      stringInput = scannerBooleanInput.nextLine();
      //Display entered string
      System.out.println("String entered: " + stringInput);
      System.out.println("Vowel count: " + countVowels(stringInput.toLowerCase()));


      //Create scanner input for user	
      scannerBooleanInput = new Scanner(System.in);
      //Ask user to input string to parse
      System.out.print("Enter a sentence to return a count of all words: ");
      //Store user input
      stringInput = scannerBooleanInput.nextLine().trim();
      //Display entered string
      System.out.println("Sentence entered: " + stringInput);
      System.out.println("Number of words in sentence: " + countWords(stringInput.toLowerCase()));

      scannerBooleanInput.close();

   }


}
