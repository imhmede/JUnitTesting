/**
 * this program converts a letter grade into its correspoinding numerical grade
 * @author Ludwig Scherer
 * @date 03-10-2023
 */

 import java.util.Scanner;

public class Grade 
{
    /**
     * The main method
     * @param args a list of user command-line arguments
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter your letter grade");

        String letterGrade = in.next();
        char gradeChar = letterGrade.charAt(0);
        
        if (gradeChar == 'A' || gradeChar == 'a')
        {
        System.out.println("The numeric value for your letter grade is: 4");
        }
        else if (gradeChar == 'B' || gradeChar == 'b')
        {
        System.out.println("The numeric value for your letter grade is: 3");
        }
        else if (gradeChar == 'C' || gradeChar == 'c')
        {
        System.out.println("The numeric value for your letter grade is: 2");
        }
        else if (gradeChar == 'D' || gradeChar == 'd')
        {
        System.out.println("The numeric value for your letter grade is: 1");
        }
        else if (gradeChar == 'F' || gradeChar == 'f')
        {
        System.out.println("The numeric value for your letter grade is: 0");
        }
        else 
        {
            System.out.println("Invalid letter grade. Program is terminated");
            System.exit(0);
        }    

        in.close();
    }
}

