//Hunter Crouch
//9/17/2022
//Lab3_a
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quiz score");
		int Qz_grade = in.nextInt();
		if(Qz_grade>=90)
		{
		    System.out.println("Grade of A");
		}
		else if(Qz_grade>=80)
		{
		    System.out.println("Grade of B");
		}
		else if(Qz_grade>=70)
		{
		    System.out.println("Grade of C");
		}
		else if(Qz_grade>=60)
		{
		    System.out.println("Grade of D");
		}
		else 
		{
		    System.out.println("Grade of E");
		}
		
	}
}
