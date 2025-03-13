/*

Class: CS123
Description: Lab3_a
Author: Vince Gnodle
Date: 10/02/2022

*/

import java.util.Scanner; //import scanner to read input

public class GradingScale
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); //Declare scanner "in"
		String letterGrade;
		
		System.out.println("Enter the quiz grade: "); //prompt user to enter grade
	    double grade = in.nextDouble(); //accept grade from keyboard and assign it to variable "grade"
	    
	    //Series of if, else if, else statements to compare "grade" to a series of ranges to determine "letterGrade"
	    if (grade >= 90){
	        letterGrade = "A";
	        System.out.println("Letter grade is: " + letterGrade);
	    }
	    
	    else if (grade < 90 && grade >= 80){
	        letterGrade = "B";
	        System.out.println("Letter grade is: " + letterGrade);
	    }
	    
	    else if (grade < 80 && grade >= 70){
	        letterGrade = "C";
	        System.out.println("Letter grade is: " + letterGrade);
	    }
	    
	    else if (grade < 70 && grade >= 60){
	        letterGrade = "D";
	        System.out.println("Letter grade is: " + letterGrade);
	    }
	   
	    else {
	        letterGrade = "F";
	        System.out.println("Letter grade is: " + letterGrade);
	    }
	}
}
