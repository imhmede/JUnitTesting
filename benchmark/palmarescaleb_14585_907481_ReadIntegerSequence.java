
/*
Name: Caleb Palmares
Date: October 19th, 2022
Assignment title: Lab 4
This program does the following:
   1. Prints the smallest and the largest of the inputs.
   2. Prints the number of even and odd inputs.
   3. Prints the cumulative totals.
   4. Prints all adjacent duplicates.
*/

import java.util.Scanner;

public class ReadIntegerSequence

{

public static void main(String[] args) {

   //Create scanner input for user	
   Scanner scannerGradeInput = new Scanner(System.in);

   //Ask user to input number to parse
   System.out.print("Enter integer: ");

   //Store user input
   String numbersInString = scannerGradeInput.nextLine();

   scannerGradeInput.close();

   System.out.println("Integer entered: " + numbersInString);

   int[] listOfNumbers = new int[numbersInString.length()];

   //Iterate through integer characters
   for(int i =0; i < numbersInString.length(); i++){
      listOfNumbers[i] = Integer.parseInt(Character.toString(numbersInString.charAt(i)));
   }

   int min = 10;
   int max = 0;
   int numberOfEvenInputs = 0;
   int numberOfOddInputs = 0;
   int cumulativeValue = 0;
   String cumulativeValueString = "";
   String adjacentDuplicateString = "";

   for(int i = 0; i < numbersInString.length(); i++){
      if(listOfNumbers[i] < min)
         min = listOfNumbers[i];
      if(listOfNumbers[i] > max)
         max = listOfNumbers[i];

      if((listOfNumbers[i] % 2) > 0){
         numberOfOddInputs++;
      }else{
         numberOfEvenInputs++;
      } 

      cumulativeValue = cumulativeValue + listOfNumbers[i];
      cumulativeValueString += " " + cumulativeValue;

   }

   //Iterate through integer characters to detect adjacent duplicates
   for(int i = 0; i < numbersInString.length() - 1; i++){
      if((listOfNumbers[i]) == (listOfNumbers[i + 1]) && !adjacentDuplicateString.contains(Integer.toString(listOfNumbers[i]))){
         adjacentDuplicateString += " " + listOfNumbers[i];
      }
   }

   System.out.println("Min: " + min);
   System.out.println("Max: " + max);
   System.out.println("Even: " + numberOfEvenInputs);
   System.out.println("Odd: " + numberOfOddInputs);
   System.out.println("Cumulative total: " + cumulativeValueString);
   System.out.println("Adjacent duplicates: " + adjacentDuplicateString);

   }

}
