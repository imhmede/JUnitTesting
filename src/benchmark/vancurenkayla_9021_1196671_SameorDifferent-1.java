/**
 *Kayla Van Curen
 *3-6-2023
 *CS 123 - Computer Science 1
 *Assignment- PA 04
*/

import java.util.Scanner;

public class SameorDifferent
{
	public static void main(String[] args){

		System.out.println("Enter the first string: ");
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		System.out.println("Enter the second string: ");
		String str2 = in.next();
		in.close();
		
		if (str1.equals(str2)){
			System.out.println("All the same");
			}
		else{
			System.out.println("neither");
			}
			
		}

	}