import java.util.Scanner;
public class base10ToLetterGrade {
	/* 
	 * Author: Derek White
	 * Date: 28 September 2022
	 *
	 *
	 * Purpose: This program will check the input decimal grade and translate it to a
	 * Letter grade.
	 */
	public static char calculate(int g){
		int inputGrade = g;
		if(inputGrade >= 90){
			return 'A';
		}
		else if(inputGrade >= 80){
			return 'B';
		}
		else if(inputGrade >= 70){
			return 'C';
		}
		else if(inputGrade >= 60){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	public static void main(String[] args){
		Scanner userinput = new Scanner(System.in); //Initializing Java's goofy user input
		System.out.println("Please enter grade");
		int gradeIn = userinput.nextInt(10); // Enforcing base 10
		char gradeOut = calculate(gradeIn);
		System.out.println("The grade is: " + gradeOut + '.');
	}
}
