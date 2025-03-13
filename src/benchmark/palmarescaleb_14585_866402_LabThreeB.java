
/*
Name: Caleb Palmares
Date: October 1st, 2022
Assignment title: Lab 3_b
This program reads an integer and determines if it's sorted.
*/

import java.util.Scanner;

public class LabThreeB

{

public static void main(String[] args) {

   //Create scanner input for user	
   Scanner scannerGradeInput = new Scanner(System.in);

   //Ask user to input number to parse
   System.out.print("Enter integer to determine if sorted: ");

   //Store user input as a comma delimited String Array
   Integer toSort = scannerGradeInput.nextInt();

   scannerGradeInput.close();

   //Initialize Boolean that captures if sorted
   Boolean integerInOrder = true;

   //Loop through integer length, minus 1, which prevents an out of bounds exception
   for (int i = 0; i < Integer.toString(toSort).length() - 1; i++) {

   //Print every digit with a space on same line
   if(Integer.toString(toSort).charAt(i) > Integer.toString(toSort).charAt(i + 1)){
      //If charAt(i) is greater than charAt(i + 1), then it's not sorted
      integerInOrder = false;
   }

}

   if(integerInOrder){
      System.out.printf("Integer %s is in order.\n", toSort);
   }else{
      System.out.printf("Integer %s is NOT in order.\n", toSort);
   }

}

}
