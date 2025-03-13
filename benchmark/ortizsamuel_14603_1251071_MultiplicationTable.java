/**
 * A program that prints a multiplaction table based off user input
 * Samuel Ortiz
 * 03-28-2023
 * */
import java.util.Scanner;
public class MultiplicationTable
{
	public static void main(String[] args)//main method 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 12");//prompt for user input
		int number = in.nextInt();// variable declaration from user input
		int i=0;//counter
		while (i<13)// while loop to print the multplication table
		{
		    System.out.println(number + "*" + i + "=" + number*i);//printing the result
		    i++;
		}
		
	}
}
