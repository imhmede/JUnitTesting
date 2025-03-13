/*
*          Class: CS 123 Computer Science 1
*          Description: Lab5A: Functions with 3 doubles
*          Author: Brandon Bleyenberg
*          Date: 10/30/2022
*/

import java.util.Scanner;

public class DoublesWithFunctions {
   public static void main(String[] args) {
      //Scanner object
      Scanner in = new Scanner(System.in);
      //Variable declarations
      double firstNumber;
      double secondNumber;
      double thirdNumber;
      
      //Print and reading for 3 numbers
      System.out.println("Enter your three numbers: ");
      firstNumber = in.nextDouble();
      secondNumber = in.nextDouble();
      thirdNumber = in.nextDouble();
      
      System.out.println("All the arguments are the same: " + allTheSame(firstNumber, secondNumber, thirdNumber) + "\nThe average is: " + average(firstNumber, secondNumber, thirdNumber) +
                         "\nThe smallest number is: " + theSmallest(firstNumber, secondNumber, thirdNumber) + "\nThe numbers are sorted starting with the smallest: " + sorted(firstNumber, secondNumber, thirdNumber));
   }
   
   /**
    * Determines if the 3 user numbers are all the same
    * @param x first input number
    * @param y second input number
    * @param z third input number
    * @return true of false if the numbers are the same
    */
   public static boolean allTheSame(double x, double y, double z) {
      return (x == y && y == z);   
   }
   
   /**
    * Calculates the average of the 3 user numbers
    * @param x first input number
    * @param y second input number
    * @param z third input number
    * @return the average
    */
   public static double average (double x, double y, double z) {
      return ((x + y +z) / 3); 
   }
   
   /**
    * Finds the smallest of the 3 numbers
    * @param x first input number
    * @param y second input number
    * @param z third input number
    * @return the smallest number
    */
   public static double theSmallest(double x, double y, double z) {
      return (Math.min(Math.min(x, y), z));       
   }
   
   /**
    * Determines if the 3 numbers are in order from smallest to greatest
    * @param x first input number
    * @param y second input number
    * @param z third input number
    * @return true or false if the numbers are smallest to greatest
    */
   public static boolean sorted(double x, double y, double z) {
      return (x <= y && y <= z); 
   }
}     

