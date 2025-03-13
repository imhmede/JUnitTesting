import java.util.Scanner;
/** This is a program that takes a user input and assigns it to a letter grade
 * DallanSilver
 * CS123 Grade HW
 * 10/25/2023
 */
public class Grade {
    /** This is the entry point for my code
     * @param   args   This argues an input from user into a list of letter grades
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Taking a user input
        System.out.println("Please enter a number: ");
        int number = in.nextInt();

        // Converting input to letter grade
        if (number >= 90)
        {
            String NumberGrade = Integer.toString(number);
            System.out.println("A");
        }
        else if (number >= 80)
        {
            String NumberGradeB = Integer.toString(number);
            System.out.println("B");
        }
        else if (number >= 70)
        {
            String NumberGradeC = Integer.toString(number);
            System.out.print("C");
        }
        else if (number >= 60)
        {
            String NumberGradeD = Integer.toString(number);
            System.out.println("D");
        }
        else if (number >= 0)
        {
            String NumberGradeF = Integer.toString(number);
            System.out.println("F");
        }

    }
}
