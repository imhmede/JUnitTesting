/*
Military Time Calculator
 Lauren Lofton
 CS123
 Lab 2b
 2) Write a program that prompts the user for two times in military format 
    (e.q. 0900, 1730) and prints the number of hours and minutes between 
    the two times. Here is a sample run. User input is in color.
                   Please enter the first time: 0900
                   Please enter the second time: 1730
                   8 hours and 30 minutes
    Extra credit if you can deal with the case where the first time is 
    later than the second. Here is a sample run.
                   Please enter the first time: 1730
                   Please enter the second time: 0900
                   15 hours and 30 minutes
 */

import javax.swing.*;

public class MilitaryTimeCalculator {

   public static void main(String[] args) {
    // requesting user input
       String input1 = JOptionPane.showInputDialog("Please Enter a Military Time (4 digits)");
       String input2 = JOptionPane.showInputDialog("Please Enter A Military Time (4 digits)");
    // converting string input into integer
       int firstNumber = Integer.parseInt(input1);
       int secondNumber = Integer.parseInt(input2);
    // logic
       int baseNumber = ((firstNumber - (firstNumber % 100) + 100) - 2400);
       int extra = ((firstNumber % 100) - 60) * -1;
       int difference;
    // if else statement to loop through logic output
       if (firstNumber > secondNumber & extra == 60) {
           difference = ((secondNumber - baseNumber) + 100);
       } else if (firstNumber > secondNumber) {
           difference = ((secondNumber - baseNumber) + extra);
       } else {
           difference = (secondNumber - firstNumber);
       }
    // response
       int hours = difference / 100;
       int minutes = difference % 100;
       System.out.println("The time difference is " + hours + " hours and " + minutes + " minutes.");
   }
}
