/**
 * PA08: Reads a number inputed by the user between 1 and 12 and prints its multiplication table (for 1 through 12).
 * @author  Werhane
 * @date    2023.03.17
 */

//imports the InputMismatchException and Scanner methods to catch errors and get user input later
import java.util.InputMismatchException;
import java.util.Scanner;

//establishes the class
public class PA08_MultiplicationTable
{

    /**
     * The main method.
     * @param args  A list of command-line arguments passed by the user.
     */
    public static void main(String[] args)
    {
        //establishes a scanner in to get user input
        Scanner in = new Scanner(System.in);

        //prompts the user for input
        System.out.print("Enter a whole number between 1 and 12: ");

        try{
            //stores user input as a variable integer number
            int number = in.nextInt();

            //prints an error message and exits the program if the user enters an integer greater than 12 or less than 1.
            if(number < 1 || number > 12)
            {
                System.out.println("Not a whole number between 1 and 12.");
                System.exit(0);
            }

            /*
            * iteratres a variable integer i from 0 to twelve 
            * prints the multiplication of number with i at each iteration
            * the result is a printed multiplication table
            */
            for(int i = 0; i <= 12; i++)
            {
                System.out.println(number + " * " + i + " = " + (number*i));
            }
        }

        //prints an error message and exits the program in the event that the value entered is not an integer
        catch(InputMismatchException e)
        {
            System.out.println("Not a whole number between 1 and 12.");
            System.exit(0);
        }       
    }
}