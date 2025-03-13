/**
 * This is a program which assigns a letter grade to a score input by the user.
 * @author Kyle Dean
 * October 23, 2023
 */

import java.util.Scanner;

public class Grade {
    /*
     * This is the main method.
     * @param args a list of command line arguments which may be input by the user
     */

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a numerical grade from 0 to 100, inclusive:\n");
        double grade = in.nextDouble();

        if (grade < 0 || grade > 100)
        {
            System.out.print("The grade you have entered exceeds the required bounds.");
        }

        else if (grade >= 90)
        {
            System.out.print("Your grade is an A.");
        }

        else if (grade >= 80)
        {
            System.out.print("Your grade is a B.");
        }

        else if (grade >= 70)
        {
            System.out.print("Your letter grade is a C.");
        }

        else if (grade >= 60)
        {
            System.out.print("Your letter grade is a D.");
        }

        else
        {
            System.out.print("Your letter grade is an F.");
        }
    }
}