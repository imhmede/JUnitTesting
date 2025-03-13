/**
CS- 123
Author: Jay Mancilla
This program converts Meters into different measurements
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter amout of meters: ");
		double meters = in.nextDouble();
		double miles =  (meters / 1609);
		double feet = meters * 3.281;
		double inches = meters * 39.37;
		double test = 1609/100;
		
		System.out.println("The measurement in miles is: " + miles);
		System.out.println("The measurement in feet is: " +feet);
		System.out.println("The measurement in inches is: " +inches);
		
		
	}
}
