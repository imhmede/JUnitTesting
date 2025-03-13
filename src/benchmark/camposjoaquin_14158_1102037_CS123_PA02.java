/*
Joaquin Campos
01-31-2023
Programming Assignment 02
*/

import java.util.Scanner; // Imports Scanner from java.util
public class CS123_PA02
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in); // Sets up Scanner
        
        System.out.print("Please enter a measurement in meters: ");
        double meters = in.nextDouble(); // Awaits input
        
        double miles = meters / 1609; // Converts meters to miles
        double feet = meters * 3.281; // Converts meters to feet
        double inches = meters * 39.37; // Converts meters to inches
        
        System.out.printf("The measurement in miles: %f", miles); // Prints miles
        System.out.printf("\nThe measurement in feet: %f", feet); // Prints feet
        System.out.printf("\nThe measurement in inches: %f", inches); // Prints inches
    }
}
