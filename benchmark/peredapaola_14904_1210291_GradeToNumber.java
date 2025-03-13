/**
* This program will translate a letter grade into a number grade
* @author Paola Pereda
* @2023-03-10
* PA 05
*/
import java.util.Scanner;

public class GradeToNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade:");
        String grade = in.next();
        if (grade.equalsIgnoreCase("A"))
        {
            System.out.println("The numeric value of the letter grade A is 4.");
        }
        else if (grade.equalsIgnoreCase("B"))
        {
            System.out.println("The numeric value of the letter grade B is 3.");
        }
        else if (grade.equalsIgnoreCase("C"))
        {
            System.out.println("The numeric value of the letter grade C is 2.");
        }
        else if (grade.equalsIgnoreCase("D"))
        {
            System.out.println("The numeric value of the letter grade D is 1.");
        }
        else if (grade.equalsIgnoreCase("F"))
        {
            System.out.println("The numeric value of the letter grade F is 0.");
        }
        else
        {
            System.out.println("Invalid letter grade. Program is terminated.");
        }
        
    }

}