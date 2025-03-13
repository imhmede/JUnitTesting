/*
*          Class: CS 123 Computer Science 1
*          Description: Lab2b: Printing the hours and minutes difference between two times.
*          Author: Brandon Bleyenberg
*          Date: 09/30/2022
*/

import java.util.Scanner;

public class MilitaryTime {
   public static void main(String[] args) {
      //Declaration of variables and initialization of a constant 
      Scanner in = new Scanner(System.in);
      String firstStringMilitaryTime;
      String secondStringMilitaryTime;
      int firstIntegerMilitaryTime;
      int secondIntegerMilitaryTime;
      int firstTotalMinutes;
      int secondTotalMinutes;
      int hoursDifference;
      int minutesDifference;
      final int DAY_TOTAL_MINUTES = 1440;

      //Print and read command for first military time
      System.out.print("Please enter the first time: ");
      firstStringMilitaryTime = in.nextLine();

      //Print and read command for second military time
      System.out.print("Please enter the second time: ");
      secondStringMilitaryTime = in.nextLine();

      //Converting the read strings into integers
      firstIntegerMilitaryTime = Integer.parseInt(firstStringMilitaryTime);
      secondIntegerMilitaryTime = Integer.parseInt(secondStringMilitaryTime);

      //Calculating the total minutes in each military time integer
      firstTotalMinutes = ((firstIntegerMilitaryTime / 100) * 60) + (firstIntegerMilitaryTime % 100);
      secondTotalMinutes = ((secondIntegerMilitaryTime / 100) * 60) + (secondIntegerMilitaryTime % 100);

      //Conditional statement for if the first military time is before the second military time
      if (firstIntegerMilitaryTime < secondIntegerMilitaryTime) {
         //Calculating the hours difference between the two times
         hoursDifference = (secondTotalMinutes - firstTotalMinutes) / 60;
         //Calculating the minutes difference between the two times
         minutesDifference = (secondTotalMinutes - firstTotalMinutes) % 60;

         //Printing out the difference in hours and minutes between the two times
         System.out.println(hoursDifference + " hours and " + minutesDifference + " minutes");
      }
      //Continuation of conditional statement if the second time is on the next day after the first time
      else {
         //Calculating the hours difference between the two times with the constant
         hoursDifference = ((DAY_TOTAL_MINUTES - firstTotalMinutes) + secondTotalMinutes) / 60;
         //Calculating the minutes difference between the two times with the constant
         minutesDifference = ((DAY_TOTAL_MINUTES - firstTotalMinutes) + secondTotalMinutes) % 60;   

         //Printing out the difference in hours and minutes between the two times
         System.out.println(hoursDifference + " hours and " + minutesDifference + " minutes");   
      }
   }
}