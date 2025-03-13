/*
Author: Jay Mancilla
Date: 2/4/2022
This program will ask for 2 integer inputs and calculate sum,diff,product, and avg
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Plase enter first number: ");
	    int frstNum = in.nextInt();
	    System.out.println("Enter second number: ");
	    int secNum = in.nextInt();
	    
	    int sum = frstNum + secNum;
	    int diff = frstNum - secNum;
	    int product = frstNum * secNum;
	    int avg = ((frstNum + secNum) / 2);
	    
	    System.out.println("The sum is: "+ sum);
	    System.out.println("The diff is: "+ diff);
	    System.out.println("The product of the two numbers is: "+ product);
	    System.out.println("The average is: "+avg);
		
	}
}
