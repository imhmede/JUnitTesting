/** This program translates a letter grade into a number grade
@author Devon Alonzo
@2023-03-10 10:32:46 */
import java.util.Scanner;
public class letterGrade
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a letter grade"); //creating scanner object, printing message for user and creating variable for letter grades
        String letterGrade = in.next();

        if (letterGrade.equalsIgnoreCase("A")) //if statements and else if statements to determine what letter grade will get what number
        {
            System.out.println("The numerical value of the grade is 4");
        }
        else if (letterGrade.equalsIgnoreCase("B"))
        {
            System.out.println("The numerical value of the grade is 3");
        }
        else if (letterGrade.equalsIgnoreCase("C"))
        {
            System.out.println("The numerical value of the grade is 2");
        }
        else if (letterGrade.equalsIgnoreCase("D"))
        {
            System.out.println("The numerical value of the grade is 1");
        }
        else if (letterGrade.equalsIgnoreCase("F"))
        {
            System.out.println("The numerical value of the grade is 0");
        }
        else
        {
            System.out.println("Invalid letter grade. Program terminated.");
        }
    }
}