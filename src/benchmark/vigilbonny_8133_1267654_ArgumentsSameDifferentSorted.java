/**
 * (CS 123, PA_09) This program outputs whether three numbers are the same or different, and if they're sorted lowest to highest.
 * @author Bonny Vigil
 * @date 04/03/2023
 */
import java.util.Scanner;

public class ArgumentsSameDifferentSorted
{
    /**
     * This method returns true if the three input numbers are the same.
     * @param x an input double number
     * @param y an input double number
     * @param z an input double number
     * @return true / false - The returning value is true if the numbers are the same and false if they aren't.
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        if (x == y && y == z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * This method returns true if the three input numbers are the different.
     * @param x an input double number
     * @param y an input double number
     * @param z an input double number
     * @return  true / false - The returning value is true if the numbers are different and false if they aren't.
     */
    public static boolean allDifferent(double x, double y, double z)
    {
        if (x != y || y != z || x != z) //If statement to deterimine that all the numbers are different.
        {
            return true;
        
        }
        else
        {
            return false;
        }
    }

    /**
     * This method returns true if the three input numbers are sorted lowest to highest.
     * @param x an input double number
     * @param y an input double number
     * @param z an input double number
     * @return true / false - The returning value is true if the numbers are sorted and false if they aren't.
     */
    public static boolean sorted(double x, double y, double z)
    {
        if (x <= y && y <= z) //The if statement to determine if the numbers are sorted.
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * This is the main method.
     * @param args Prints questions for the user, takes in the three numbers, and outputs information about the imported numbers.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: "); //Asks for a number from the user.
        double firstNumber = in.nextDouble();
        System.out.println("Enter the second number: "); //Asks for a number from the user.
        double secondNumber = in.nextDouble();
        System.out.println("Enter the third number: "); //Asks for a number from the user.
        double thirdNumber = in.nextDouble(); 
        if((allTheSame(firstNumber, secondNumber, thirdNumber)) == true) //If statement to determine if the numbers are the same and whether they are sorted.
        {
            System.out.println("All the numbers are the same.");
            if((sorted(firstNumber, secondNumber, thirdNumber)) == true)
            {
                System.out.println("All the numbers are sorted.");
            }
        }
        else if((allDifferent(firstNumber, secondNumber, thirdNumber)) == true) //If else statement to determine if the numbers are different and whether they are sorted.
        {
            System.out.println("All the numbers are different.");
            if((sorted(firstNumber, secondNumber, thirdNumber)) == true)
            {
                System.out.println("All the numbers are sorted.");
            }
        }
        
    }
}