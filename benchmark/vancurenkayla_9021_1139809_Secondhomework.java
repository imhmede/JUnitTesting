/**
 Kayla Van Curen
 2-13-2023
 CS 123 - Computer Science 1
 Assignment - PA 02
*/

import java.util.Scanner;

public class Secondhomework
{
	public static void main(String[] args){
		float meters,miles;
		double feet,inches;
	
		System.out.println("Please enter a measurement in meters: ");
		Scanner in = new Scanner(System.in);
		meters = (float) in.nextDouble();
		miles = meters / 1609;
		System.out.println("The measurment in miles: " + miles);
		feet = meters * 3.281;
		System.out.println("The measurment in feet: " + feet);
		inches = meters * 39.37;
		System.out.println("The measurment in inches: " + inches);
	}
}
		