/**
 * Assignment PA03: this program recieves two integers from the user, then returns the sum, difference, product and average of the two numbers.
 * @author Lincoln Werhane
 * @since 2023.07.17
 */

/**
 * Importing the Scanner for later use.
 */
import java.util.Scanner;

/**
 * Establishing class and method.
 */
public class PA03_SumDifferenceProductAverage
{

    /**
     * This is the main method, it gathers user inputs, does the math, and returns the appropriate values.
     * @param args  a list of arguments passed by the program user
     */
    public static void main(String[] args)
    {
        /**
         * Establishing scanner.
         * Printing a message to request the user input an integer.
         * Assigning that user input to a variable "firstNumber."
         * Printing a second message to request the user input an integer.
         * Assigning that user input to a variable "secondNumber."
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int firstNumber = in.nextInt();
        System.out.println("Enter another integer: ");
        int secondNumber = in.nextInt();

        /**
         * Printing the sum of the two numbers
         * Printing the difference between the second and first number.
         * Printing the difference between the first and second number. I am adding this line as the assignment did not specify in what order the subtraction should take place.
         * Printing the product of the two numbers.
         * Printing the average of the two numbers. Using 2f here will ensure that the operation is done on floating point numbers, allowing us to get the fractional part that is sometimes present in averages.
         */
        System.out.println("The sum of the two numbers is: " + (firstNumber + secondNumber));
        System.out.println("The difference between the second number and the first is: " + (secondNumber - firstNumber));
        System.out.println("The difference between the first number and the second is: " + (firstNumber - secondNumber));
        System.out.println("The product of the two numbers is: " + (firstNumber * secondNumber));
        System.out.println("The average of the two numbers is: " + ((firstNumber + secondNumber)/2f));
    }
}