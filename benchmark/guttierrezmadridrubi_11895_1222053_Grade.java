/* This program translates a letter grade into a number grade
 * @author Rubi Madrid CS123
 * @date 03.10.2023
 * @param a series of if else statements
 */

//imports scanner utility//
import java.util.Scanner;

public class Grade
{
    public static void main (String[]args)
    {
        //sets scanner input//
        Scanner in = new Scanner (System.in);

        //prompts user to enter letter grade//
        System.out.println("Enter a letter grade:");

        //sets input to variable grade//
        String grade = in.next();

        //prints out numeric value of letter grade A regardless if it was inputted as an uppercase or lowercase//
        if (grade.equalsIgnoreCase("a"))
        {
            System.out.println("The numeric value of the letter grade A is 4");
        }

        //prints out numeric value of letter grade B regardless if it was inputted as an uppercase or lowercase//
        else if (grade.equalsIgnoreCase("b"))
        {
            System.out.println("The numberic value of the letter grade B is 3");
        }

        //prints out numeric value of letter grade C regardless if it was inputted as an uppercase or lowercase//
        else if (grade.equalsIgnoreCase("c"))
        {
            System.out.println("The numeric value of the letter grade C is 2");
        }

        //prints out numeric value of letter grade D regardless if it was inputted as an uppercase or lowercase//
        else if (grade.equalsIgnoreCase("d"))
        {
            System.out.println("The numeric value of the letter grade D is 1");
        }

        //prints out numeric value of letter grade F regardless if it was inputted as an uppercase or lowercase//
        else if (grade.equalsIgnoreCase("f"))
        {
            System.out.println("The numeric value of the letter F is 0");
        }

        //prints out invalid entry if input is any other letter besides a,b,c,d, or f regardless if the input is upper or lowercase//
        else if (!grade.equalsIgnoreCase("a") || !grade.equalsIgnoreCase("b") || !grade.equalsIgnoreCase("c")
                || !grade.equalsIgnoreCase("d") || !grade.equalsIgnoreCase("f"))
                {
                    System.out.println("Invalid letter grade. Program is terminated.");
                }


    }
}
