
/*
Name: Caleb Palmares
Date: September 30th, 2022
Assignment title: Lab 2_b
This program reads two military times and calculates the difference.
*/

import java.util.Scanner;

public class LabTwoB

{

public static void main(String[] args) {

   //Create scanner input for user	
   Scanner scannerTimeInput = new Scanner(System.in);

   //Ask user to input number to parse
   System.out.print("Enter two times in military format separated by a \",\": ");
   
   //Store user input as a comma delimited String Array
   String[] timesToParse = scannerTimeInput.nextLine().split(",");

   scannerTimeInput.close();

   //Capture first time and the first two characters of this value, then convert to minutes by multiplying by 60
   Double firstTimeHours = Double.parseDouble(timesToParse[0].substring(0, 2)) * 60;

   //Capture first time and the third/fourth characters of this value, which are the minutes
   Double firstTimeMinutes = Double.parseDouble(timesToParse[0].substring(2, 4));

   //Use new variable to store complete first time
   Double firstTime = firstTimeHours + firstTimeMinutes;

   //Capture second time and the first two characters of this value, then convert to minutes by multiplying by 60
   Double secondTimeHours = Double.parseDouble(timesToParse[1].substring(0, 2)) * 60;

   //Capture second time and the third/fourth characters of this value, which are the minutes
   Double secondTimeMinutes = Double.parseDouble(timesToParse[1].substring(2, 4));

   //Use new variable to store complete second time
   Double secondTime = secondTimeHours + secondTimeMinutes;
   
   if(firstTime < secondTime){

      //Split the double time difference. The [0] positon has the hours; the [1] position has the minute as a decimal
	  String[] splitTime = String.valueOf(Math.abs((firstTime - secondTime) / 60)).split("\\.");
	  
	  //Since the minutes are a decimal, this value must be converted back to minutes by adding the "." and multiplying by "60"
	  System.out.printf("Difference of %s hours and %s minutes.\n", splitTime[0], (Double.parseDouble("." + splitTime[1]) * 60));

   }

   if(firstTime > secondTime){

	String[] splitTime = String.valueOf(((24 - (firstTime / 60)) + secondTime / 60)).split("\\.");
	
	System.out.printf("Difference of %s hours and %s minutes.\n", splitTime[0], (Double.parseDouble("." + splitTime[1]) * 60));

   }

}

}

/*
Enter two times in military format separated by a ",": 0900,1730
Difference of 8 hours and 30.0 minutes.

Enter two times in military format separated by a ",": 1730,0900
Difference of 15 hours and 30.0 minutes.
 */

