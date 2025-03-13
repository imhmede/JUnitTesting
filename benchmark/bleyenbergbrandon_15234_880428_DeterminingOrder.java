/*
*          Class: CS 123 Computer Science 1
*          Description: Lab3b: Determining if a sequence of integers is in order
*          Author: Brandon Bleyenberg
*          Date: 10/02/2022
*/

import java.util.Scanner;

public class DeterminingOrder {
   public static void main(String[] args) {
      //Declaring my variables and initializing one
      Scanner in = new Scanner(System.in);
      int integerOne;
      int integerTwo;
      int integerThree;
      String orderDetermination = "";
      
      //Print and read statement for the first integer
      System.out.print("Enter the first integer: ");
      integerOne = in.nextInt();

      //Print and read statement for the second integer
      System.out.print("Enter the second integer: ");
      integerTwo = in.nextInt();

      //Print and read statement for the third integer
      System.out.print("Enter the third integer: ");
      integerThree = in.nextInt();

      //Conditional statement determining an upward order
      if (integerOne < integerTwo) {
         //Conditional statement determining if the third integer follows order. If it is equal then it is still in order.
         if (integerTwo <= integerThree) {
            //Assigning variable in order because sequence is in order
            orderDetermination = " in order";   
         }
         //Continuation if third integer does not follow order
         else {
            //Assigning variable not in order due to third integer not following order
            orderDetermination = " not in order";   
         }    
      }
      //Conditional statement determining a downward order
      else if (integerOne > integerTwo) {
         //Conditional statement determining if the third integer follows order. If it is equal then it is still in order.
         if (integerTwo >= integerThree) {
            //Assigning in order because sequence is in order
            orderDetermination = " in order";   
         }
         //Continuation if third integer doesn't follow order
         else {
            //Assigning not in order because sequence is not in order
            orderDetermination = " not in order";   
         }  
      }
      //If the first and second integer are equal, then it doesn't matter what the third integer is 
      else if (integerOne == integerTwo) {
        //Assigning in order because this sequence will always be in order
        orderDetermination = " in order";
      }
      //Print statement of integers and if they are in order
      System.out.println(integerOne + " " + integerTwo + " " + integerThree + orderDetermination);
   }    
}