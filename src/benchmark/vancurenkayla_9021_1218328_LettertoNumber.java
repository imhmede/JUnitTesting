/**
 *Kayla Van Curen
 *3-10-2023
 *CS 123 - Computer Science 1
 *Assignment- PA 05
*/

import java.util.Scanner;

public class LettertoNumber
{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch >= 'A' && ch <= 'F' && ch != 'E')
		{
			System.out.print("The numeric value of the letter grade " + ch + " is ");
			switch(ch)
			{
				case 'A': System.out.println(4); break;
				case 'B': System.out.println(3); break;
				case 'C': System.out.println(2); break;
				case 'D': System.out.println(1); break;
				case 'F': System.out.println(0); 
			}
		}
		else
			System.out.println("Invalid letter grade. Program is terminated");
	}
}