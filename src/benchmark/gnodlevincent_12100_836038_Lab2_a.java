/*

Class: CS123
Description: Lab2_a
Author: Vince Gnodle
Date: 09/18/2022

*/

import java.util.Scanner;

public class Lab2_a
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number= in.nextInt();
		in.nextLine();
		
		String numberInString = Integer.toString(in.nextInt());
		
		for (int i=0; i<numberInString.length(); i++)
		{
		    System.out.print(numberInString.charAt(i)+" ");
		}
	}
}
