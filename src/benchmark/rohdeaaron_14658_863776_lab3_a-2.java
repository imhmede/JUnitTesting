/* Aaron Rohde - CS123
 * Assignment: Lab 3_a
 * Due:     10/02/2022
 */
import java.util.Scanner;
public class lab3_a
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int gradeIn;
        // Set default starting comparision grade
        int gradeCompare = 90;
        // Make grades an array to allow for a loop
        char[] gradeChar = {'A', 'B', 'C', 'D', 'F'};
        // Default to an F to reduce logic later
        int whichGrade = 4;
        System.out.print("Please enter the grade to evaluate: ");
        gradeIn = in.nextInt();
        /* Evaluate int for grade is greater than/equal to bottom 
         * allowable score for a grade better than F as that is the default
         * break the loop on success to stop wrong grade assignment for 
         * future true comparisons
         */
        for (int i = 0; i < 4; i++)
        {
            if ( gradeIn >= gradeCompare )
            {
                whichGrade = i;
                break;
            }
            // Subtract 10 for next loop comparison
            gradeCompare = gradeCompare - 10;
        }
        // Give answer to user with space added for clarity
        System.out.printf("%nThe letter grade for a %d is %c.%n", gradeIn, gradeChar[whichGrade]);
    } 
}