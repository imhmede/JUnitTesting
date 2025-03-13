/*
*          Class: CS 123 Computer Science 1
*          Description: Lab4: Working on some properties of a sequence of integer
*          Author: Brandon Bleyenberg
*          Date: 10/16/2022
*/

import java.util.Scanner;

public class IntegerSequence {
   public static void main(String[] args) {
      //Scanner object
      Scanner in = new Scanner(System.in);
      //Declaring variables
      int nValueIntegers;
      int userInteger;
      //Declaring and initializing variables
      int sequenceSum = 0;
      int smallestInput = 0;
      int largestInput = 0;
      int evenCounter = 0;
      int oddCounter = 0;
      int previousInteger = 0;
      boolean avoidRepetition = true;
      String cumulativeSum = "";
      String adjacentDuplicates = "";

      //Print and read statement for the number of integers the user will input
      System.out.print("Enter the total number of integers in the sequence: ");
      nValueIntegers = in.nextInt();
      
      //Print statement for user to enter integers
      System.out.print("Enter the integers: ");

      /** for loop that will read the amount of integers equal to the amount the user stated that they will input
       * for loop will subject each integer in the sequence to different calculations and assignments
       * Finding the smallest input, largest input, number of even integers, number of odd integers, the cumulative sum, and any adjacent duplicates 
       */
      for (int i = 1; i <= nValueIntegers; i++) {
         //Reading the sequence of integers
         userInteger = in.nextInt();
         //Calculating the cumulative sum at each iteration
         sequenceSum = sequenceSum + userInteger;
         //Changing the cumulative sum into a string to show the cumulative sum at each iteration by building the string
         cumulativeSum = cumulativeSum + Integer.toString(sequenceSum) + " ";
         
         /** Checking if the input is an even number
          * 0 is considered an even number using proof of contradiction and the formula for an odd number
          * x=2k+1 where x=0, and k is an integer. k = -1/2 which is not an integer.
          */
         if (userInteger % 2 == 0) {
            //If true, adds to the total amount of even numbers
            evenCounter++;   
         }
         //If the integer is not even, then it is odd.
         else {
            //Adds to the total amount of odd numbers
            oddCounter++;   
         }
         //if statement for the first iteration (first integer) of the for loop     
         if (i == 1) {
            //First integer is the smallest
            smallestInput = userInteger;
            //First integer is the largest
            largestInput = userInteger;
         }
         //else statement for the rest of the iterations of the for loop after the first and the rest of the sequence of integers after the first
         else {
            //Compares the current integer to the smallest and assigns based on which integer is smaller
            smallestInput = Math.min(smallestInput , userInteger);
            //Compares the current integer to the largest and assigns based on which integer is larger
            largestInput = Math.max(largestInput , userInteger);
            
            /**if statement checking if the current integer matches the previous integer
             * Boolean is used to avoid repetition in output like
             * Example: input (3 3 3) output: (3 3)
             * Does not avoid: Input:(3 3 5 5 3 3) output (3 5 3)
             * Not sure if it is supposed to or not
             */
            if (userInteger == previousInteger && avoidRepetition == true) {
               //Builds a string showing which integers have an adjacent duplicate
               adjacentDuplicates = adjacentDuplicates + Integer.toString(userInteger) + " ";
               //Sets boolean to false
               avoidRepetition = false;  
            } 
            //else if statement if the current integer is not equal to the previous integer
            else if (userInteger != previousInteger) {
               //Sets boolean to true
               avoidRepetition = true;   
            }
         }
         //Assigns current integer to compare to the next integer in the next iteration
         previousInteger = userInteger;
         
      }
      //Print out statement of the values  
      System.out.println("\nThe smallest input is: " + smallestInput + "\nThe largest input is: " + largestInput + "\nThe amount of even numbers is: " + evenCounter + "\nThe amount of odd numbers is: " 
                         + oddCounter + "\nThe cumulative totals are: " + cumulativeSum +"\nThe adjacent duplicates are: " + adjacentDuplicates);
   }
}