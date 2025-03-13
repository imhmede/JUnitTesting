
/*
Name: Caleb Palmares
Date: October 30th, 2022
Assignment title: Lab 5_a
This program does the following:
1. Returns a boolean if all passed doubles are the same
2. Returns a double average for passed doubles
3. Returns the smalled double
4. Returns a boolean if passed doubles are sorted

*/

import java.util.Scanner;

public class CompareDoubleArguments

{
/**
Check if all same
@param x double
@param y double
@param z double
@return true or false
*/
   
   static boolean allTheSame(double x, double y, double z){
      if(x == y && y == z){
         return true;
      }else{
         return false;
      }
  }
/**
Check if all same
@param x double
@param y double
@param z double
@return averaged value
*/
   static double average(double x, double y, double z) {
      //Perform average and return
      Double averagedValue = ( (x + y + z) / 3 );
      return averagedValue;
   }
/**
Check if smallest
@param x double
@param y double
@param z double
@return the smallest
*/
   static double theSmallest(double x, double y, double z) {
      //Initiate with a dummy value
      Double min =  0.0;
      if(x <= y){
         min = x;
      }else{
         min = y;
      }
      if(min >= z){
         min = z;
      }
      return min;
   }
/**
Check if sorted
@param x double
@param y double
@param z double
@return if sorted
*/
   static boolean sorted(double x, double y, double z) {
      //Initiate with false
      boolean isSorted = false;
      
      if(x < y && y < z){
         isSorted = true;
      }
      return isSorted;
   }

public static void main(String[] args) {

   //Create scanner input for user	
   Scanner scannerBooleanInput = new Scanner(System.in);

   //Ask user to input number to parse
   System.out.print("Enter three double values separated by a comma: ");

   //Store user input
   String doubleInString = scannerBooleanInput.nextLine();

   scannerBooleanInput.close();
   //Display entered values
   System.out.println("Values entered: " + doubleInString);
   
   String[] splitDoubleString = doubleInString.split(",");
    
   if(allTheSame(Double.valueOf(splitDoubleString[0]),Double.valueOf(splitDoubleString[1]),Double.valueOf(splitDoubleString[2]))){
      System.out.println("Values '" + doubleInString + "' are all the same.");
   }else{
      System.out.println("Values '" + doubleInString + "' are not the same.");
   }

  System.out.println("The average for values '" + doubleInString + "' is " + average(Double.valueOf(splitDoubleString[0]), Double.valueOf(splitDoubleString[1]), Double.valueOf(splitDoubleString[2])) + ".");

  System.out.println("The smallest value in values '" + doubleInString + "' is " + theSmallest(Double.valueOf(splitDoubleString[0]), Double.valueOf(splitDoubleString[1]), Double.valueOf(splitDoubleString[2])));

   if(sorted(Double.valueOf(splitDoubleString[0]),Double.valueOf(splitDoubleString[1]),Double.valueOf(splitDoubleString[2]))){
      System.out.println("Values '" + doubleInString + "' are sorted.");
   }else{
      System.out.print("Values '" + doubleInString + "' are not sorted.");

      if(allTheSame(Double.valueOf(splitDoubleString[0]),Double.valueOf(splitDoubleString[1]),Double.valueOf(splitDoubleString[2]))){
         System.out.println(" All values are equal.");
      }

   }

}

}
