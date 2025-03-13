
//Name: Caleb Palmares
//Date: September 18th, 2022
//Assignment title: Lab 2_a
//This program reads an integer and breaks it into a sequence of individual digits.


import java.util.Scanner;

public class Test

{

	public static void main(String[] args) {
		
		//Create scanner input for user	
		Scanner in = new Scanner(System.in);
		
		//Ask user to input number to parse
		System.out.print("Enter the number: ");
		
		//Create variable to store user input
		int NumberToParse=in.nextInt();
		
		System.out.printf("The integer entered is: %s\n", Integer.toString(NumberToParse));
		
		in.close();
		
		//Loop through integer length, convert to a string, and 
		for (int i = 0; i < Integer.toString(NumberToParse).length(); i++) {
			
			//Print every digit with a space on same line
			System.out.print(Integer.toString(NumberToParse).charAt(i) + " ");
			
		}

	}
		
}

/*
Enter the number: 16834
The integer entered is: 16834
1 6 8 3 4 
 */

