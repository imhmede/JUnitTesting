
/*
Name: Caleb Palmares
Date: October 1st, 2022
Assignment title: Lab 3_a
This program reads a numeric grade and outputs letter grade.
*/

import java.util.Scanner;

public class LabThreeA

{

public static void main(String[] args) {

   //Create scanner input for user	
   Scanner scannerGradeInput = new Scanner(System.in);

   //Ask user to input number to parse
   System.out.print("Enter your grade in numeric value: ");
   
   //Store user input as a comma delimited String Array
   Double timesToParse = scannerGradeInput.nextDouble();

   scannerGradeInput.close();

   //Initialize letter grade
   String Grade = "";

   if(timesToParse >= 90){
      Grade = "A";
   }else if(timesToParse >= 80 && timesToParse <= 89){
      Grade = "B";
   }else if(timesToParse >= 70 && timesToParse <= 79){
      Grade = "C";
   }else if(timesToParse >= 60 && timesToParse <= 69){
      Grade = "D";
   }else if(timesToParse < 60){
      Grade = "F";
   }
   
   System.out.println(Grade);

}

}
