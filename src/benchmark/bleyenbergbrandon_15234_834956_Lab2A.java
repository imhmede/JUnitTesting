/*
 *          Class: CS 123 Computer Science 1
 *          Description: Lab2A; Taking a user inputted non-negative 5 digit integer and separating the individual digits in the integer.
 *          Author: Brandon Bleyenberg
 *          Date: 09/18/2022
 */

 import java.util.Scanner;

 public class Lab2A
 {
    public static void main(String[] args)
    {

        //Declaring variables and initializing one variable
        Scanner in = new Scanner(System.in);
        int userInteger, integerDigit, integerDivisor = 10000 ;

        //Print out statement for user input and scanning for the input
        System.out.println("Enter a non-negative, five digit integer: ");
        userInteger = in.nextInt();

        //Conditional statement
        while (integerDivisor >= 1)
        {
            //Finding the invidual left most digit
            integerDigit = userInteger / integerDivisor;

            //Determining the leftover digits
            userInteger = userInteger % integerDivisor;  

            //Reducing the divisor to account for the new userInteger
            integerDivisor = integerDivisor / 10;

            //Printing out the indivual digit with a space and without a new line
            System.out.print(integerDigit + " ");
        }
    }
 }