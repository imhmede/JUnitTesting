/*
 * Author: Derek White
 * Date: 10 October 2022
 *
 * Purpose: This program will recieve an integer input from the user as a string, split it into
 * individual characters, to then be compared and print out highest and lowest of the integer,
 * as well as duplicates of said integer (e.g. 1  5 5 6 6 9 9 will print out 1 5 6 9).
 *
 * It will also print out the cumulative numbers as a sum, e.g. 1 5 9 = 15, as well as the number
 * of even and odd numbers.
 */

import java.util.Scanner;
public class IntegerInputs {
   public static void bar(){
      /*
       * Function purely just for separating outputs from other functions
       */
      char bar = '\u2015';
      for(int position = 0; position < 50; position++){
	 System.out.print(colors('g') + bar + colors('r'));
      }
   }
   public static String colors(char input){
      /*
       * This function is just to set colors on the string
       * output to make it easier to read, despite the string
       * source code looking kinda ugly
       *
       * but user experience, am I right?
       */
      final String ANSI_RESET="\033[0;0m";
      final String ANSI_CYAN="\033[0;36m";
      final String ANSI_PURPLE="\033[1;38m";
      final String DEBUGGING_YELLOW = "\033[1;33m" + "\033[41m";
      final String ANSI_GREEN = "\033[0;32m";
      String color = ANSI_RESET;
      if(input == 'r'){
	 color = ANSI_RESET;
      }
      else if(input == 'c'){
	 color = ANSI_CYAN;
      }
      else if(input == 'p'){
	 color = ANSI_PURPLE;
      }
      else if(input == 'd'){
	 color = DEBUGGING_YELLOW;
      }
      else if(input == 'g'){
	 color = ANSI_GREEN;
      }
      return color;
   }
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      System.out.println(colors('c') + "Please enter some integer values: " + colors('r'));
      String userStringInput = userInput.nextLine();
      /*
       * Array setup to store data in one spot, and make access
       * nice and easy for all four of the functions by requirement
       * of this lab
       */
      int[] integerArray;
      integerArray = new int[userStringInput.length()];
      for(int userIn = 0; userIn < integerArray.length; userIn++){
         integerArray[userIn] = Integer.parseInt(Character.toString(userStringInput.charAt(userIn)));
      } 
      // Smallest and Largest Inputs
      smallestAndLargestInputs(integerArray, userStringInput.length());
      bar();
     
      // Cumulative Number Addition
      cumulativeNumberAddition(integerArray, userStringInput.length());
      bar();
      // Number of Odd and Even Inputs
      numberOfOddAndEvenInputs(integerArray, userStringInput.length());
      bar();
      // Adjacent Duplicates
      adjacentDuplicates(integerArray, integerArray.length);

   }
   public static void smallestAndLargestInputs(int[] parsed, int counter){
      int n = 0; // To signify the position of the array
      /* 
       * Going to start smallest and largest off with the first position
       * Just to make it a bit more flexible with other numbers, e.g. if a number
       * is negative or stupid large
       */
      int smallest = parsed[n];
      int largest = parsed[n];
      while(n < counter){
	 if(smallest >= parsed[n]){
	    smallest = parsed[n];
	 }
	 if(parsed[n] >= largest){
	    largest = parsed[n];
	 }
	 n++;
      }
      // First example of the ugly string setup, but trust me it looks nice on output.
      System.out.println(colors('p') + "\nLargest: " + colors('c') + largest + colors('r') + colors('p') +"\nSmallest: " + colors('c') + smallest +colors('r'));
   }

   public static void cumulativeNumberAddition(int[] parsed, int counter){
      /*
       * All that's going on here is creating a sum out of all of the integers
       * within the array
       */
      int n = 0;
      int sum = 0;
      while(n < counter){
   	 sum += parsed[n];
	 n++;
      }
      System.out.printf(colors('p') + "\nThe Cumulative Sum is: " + colors('c') + "%d\n" + colors('r'), sum);
   }

   public static void numberOfOddAndEvenInputs(int[] parsed, int counter){
      /*
       * Really simple odd/even counter, if an integer can be divided by two without anything left over,
       * it's an even number. If not, it's going to be odd.
       */
      int even = 0;
      int odd = 0;
      int n = 0;
      while(n < counter){
	 if(parsed[n] % 2 == 0){
	    even++;
	 }
	 else{
	    odd++;
	 }
	 n++;
      }
      System.out.printf(colors('p') + "\nNumber of Even numbers: " + colors('c') + "%d\n" + colors('r') + colors('p') + "Number of Odd Numbers: " + colors('c') + "%d\n" + colors('r'), even, odd);
   }
   public static void adjacentDuplicates(int[] parsed, int counter){
      /*
       * Lastly, the idea with this function is to check and see if
       * The adjacent number (n+1) is going to be the same as the current
       * number we are on (n). If so, it will print this number and continue
       * on throughout the loop. Thus, we are left with only one number printed.
       */
      int n = 0;
      n = 0;
      System.out.println(colors('p') + "\nThe following are duplicates that are adjacent to each other: " + colors('r'));
      while(n < counter-1){
	 int count = 0;
	 if(parsed[n+1] == parsed[n]){
	    count++;
	    System.out.println(colors('c') + parsed[n] + colors('r'));
   	 }
	 n++;
      }
      
   }



}
