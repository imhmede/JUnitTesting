/*
Joaquin Campos
01-31-2023
Programming Assignment 03
*/

import java.util.Scanner; // Imports Scanner from java.util
public class CS123_PA03
{
	public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // Sets up Scanner
        
        System.out.print("Enter the first number: ");
        int input1 = in.nextInt(); // First input
        
        System.out.print("Enter the second number: ");
        int input2 = in.nextInt(); // Second input
        
        float sum = input1 + input2; // Sum of inputs, floating point for the average
        int diff = input1 - input2; // Difference between inputs
        int prod = input1 * input2; // Product of inputs
        float avg = sum / 2; // Average of inputs, floating point in case average is a non-integer number
        
        System.out.printf("The sum of the two numbers is %.0f", sum); // Prints sum
        System.out.printf("\nThe difference between the two numbers is %d", diff); // Prints difference
        System.out.printf("\nThe product of the two numbers is %d", prod); // Prints product
        System.out.printf("\nThe average of the two numbers is %.1f", avg); // Prints average
    }
}
