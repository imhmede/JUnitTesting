/**
 * PA09: gets three numbers entered by the user, determines if none, all, or two of the numbers are the same, as well as if the numbers are in
 * ascending numerical order, and prints the result.
 * @author  Werhane
 * @date    2023.03.29
 */



//imports the Scanner and InputMismatchException to recieve user input and catch errors later
import java.util.Scanner;   import java.util.InputMismatchException;



//establishes the class
public class PA09_SameDifferentSorted
{
    /**
     * The main method.
     * @param args  recieves a series of command-line arguements from the user
     */
    public static void main(String[] args)
    {
        //establishes a scanner in to get user input
        Scanner in = new Scanner(System.in);


        try
        {
            //prompts the user for the first number and stores it as a variable double firstNumber
            System.out.println("Enter the first number: ");
            double firstNumber = in.nextDouble();

            //prompts the user for the second number and stores it as a variable double secondNumber
            System.out.println("Enter the second number: ");
            double secondNumber = in.nextDouble();

            //prompts the user for the third number and stores it as a variable double thirdNumber
            System.out.println("Enter the third number: ");
            double thirdNumber = in.nextDouble();
            
            /*
            * determines if the numbers are all the same, if not, determines if the numbers are all different, prints the result if either are true
            * prints "Two of the numbers are the same." (only remaining option) if neither are true
            */
            if(allTheSame(firstNumber, secondNumber, thirdNumber))
            {
                System.out.println("All the numbers are the same.");
            }
            else if(allDifferent(firstNumber, secondNumber, thirdNumber))
            {
                System.out.println("All the numbers are different.");
            }
            else
            {
                System.out.println("Two of the numbers are the same.");
            }

            //determines if the numbers are sorted and prints the result
            if(sorted(firstNumber, secondNumber, thirdNumber))
            {
                System.out.println("The numbers are sorted.");
            }
            else
            {
                System.out.println("The numbers are not sorted.");
            }
        }


        //catches the exception in the case of a non-double input, prints an error message, and exits the program.
        catch(InputMismatchException e)
        {
            System.out.println("Invalid value entered.");
            System.exit(0);
        }
    }



    /**
     * Determines if three numbers of type double are equal.
     * @param x the first double
     * @param y the second double
     * @param z the third double
     * @return  true if all three numbers are equal, false if any two numbers are not equal
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        //returns true if x = y = z (transitive property), returns false otherwise
        if(x == y && y == z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    /**
     * Determines if three inputed numbers of type double are all different numbers.
     * @param x the first double
     * @param y the second double
     * @param z the third double
     * @return  true if all numbers are different, false if any two numbers are equal
     */
    public static boolean allDifferent(double x, double y, double z)
    {
        //determines if any two x, y, and z are equal to one another, returns false if true and true otherwise
        if(x == y || x == z || y == z)
        {
            return false;
        }
        else
        {
            return true;
        }
    }



    /**
     * Determines if three inputed numbers of type double are in ascending order.
     * @param x the first double
     * @param y the second double
     * @param z the third double
     * @return  true if x <= y <= z, false if otherwise
     */
    public static boolean sorted(double x, double y, double z)
    {
        //determines if x <= y <= z, returns true if true and false otherwise
        if(x <= y && y <= z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}