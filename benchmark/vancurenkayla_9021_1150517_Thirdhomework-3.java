/**
 Kayla Van Curen
 CS 123 - Computer Science 1
 Assignment - PA 03
*/

import java.util.Scanner;

public class Thirdhomework
{
	public static void main(String[] args){
		int first, second, sum, difference, product;
		float average;
	
		System.out.println("Enter the first number: ");
		Scanner in = new Scanner(System.in);
		first = in.nextInt();
		System.out.println("Enter the second number: ");
		second = in.nextInt();
		in.close();
		sum = first + second;
		System.out.println("The sum of the two numbers is " + sum);
		difference = Math.abs(first - second);
		System.out.println("The difference between the two numbers is " + difference);
		product = first * second;
		System.out.println("The product of the two numbers is " + product);
		average = (first + second) / 2;
		System.out.println("The average is " + average);
	}
}
		