/*
Joaquin Campos
03-09-2023
Prgraomming Assignment 08
*/
import java.util.Scanner; // Imports Scanner from java.util
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Defines Scanner in
		
		int tableLine = -1; // Initial value to enter while loop
		while ((tableLine > 12) || (tableLine < 1)) {
		    
		    System.out.print("Enter a number between 1 and 12: ");
		    tableLine = in.nextInt(); // Awaits input
		    
		    if ((tableLine > 12) || (tableLine < 1)) { // Prints error message if number is out of range
		        System.out.println("Error: Number not in range. Please try again!");
		    }
		}
		
		int multiplication = 0; // Initial value for the multiplication result
		for (int i = 0; i <= 12; i++) { // Creates a for loop that lasts for 13 iterations (0-12)
		    
		    System.out.printf("%d * %d = %d", tableLine, i, multiplication); // Prints results
		    System.out.println(); // Line break
		    multiplication += tableLine; // More efficient to add to an existing int rather than definining a new int each iteration
		}
	}
}
