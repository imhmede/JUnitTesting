/**
 * program to read input for letter grande a convert to number
 * Samuel Ortiz
 * 10-03-2023
 * */
 
import java.util.Scanner;
public class LetterGradeToNumber
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the letter grade");
		String grade = in.next();
		String A="A";
		String B="B";
		String C="C";
		String D="D";
		String F="F";
		if(grade.equalsIgnoreCase(A) || grade.equalsIgnoreCase(B) || grade.equalsIgnoreCase(C) || grade.equalsIgnoreCase(D) || grade.equalsIgnoreCase(F))
		{
		if(grade.equalsIgnoreCase(A) )
	    System.out.println("The Numerical value for the letter grade A is 4");
		if(grade.equalsIgnoreCase(B))
		System.out.println("The Numerical value for the letter grade B is 3");
		if(grade.equalsIgnoreCase(C))
		System.out.println("The Numerical value for the letter grade C is 2");
		if(grade.equalsIgnoreCase(D))
		System.out.println("The Numerical value for the letter grade D is 1");
		if(grade.equalsIgnoreCase(F))
		System.out.println("The Numerical value for the letter grade F is 0");
	    }
		else
		System.out.println("Invalid Letter Grade. Program Terminated");
	}	

}
