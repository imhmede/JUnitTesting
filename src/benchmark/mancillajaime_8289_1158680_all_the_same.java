/*
 *Author : Jaime Mancilla
 *Class  : CS - 123
 *Date   : 2-21-2013
 *Purpose: This program checks if 2 strings are equal.
 */

import java.util.Scanner;

public class all_the_same {
	public static void main(String[] args) {
		//Assigns input to str variable
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = in.next();
		System.out.println("Enter the second string: ");
		String str2 = in.next();
		
		//Checks if str are equal
		if(str1.equals(str2)) {
			System.out.println("All the same.");
		}
		else {
			System.out.println("Neither.");
		}
		
	}
	

}
