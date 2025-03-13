/**
 * This progarm finds the sum, difference, product, and average of two integer numbers provided by the user
 * @author Vivian Iracheta
 * Oct. 10, 2023
 */
import java.util.Scanner;

 public class Computing
 {
    /**
     * This is the main method
     * @param args a list of possible arguments passed by the user
     */
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        
        //Initializes the variables

        int firstNumber = 0;
        int secondNumber = 0;
        int sum = 0;
        int diff = 0;
        int product = 0;
        int average = 0;

        // Recieveing the integers from the user imput

        System.out.println("Enter the first integer number");
        firstNumber = in.nextInt();
        System.out.println("Enter the second integer number");
        secondNumber = in.nextInt();

        //Calculating the sum, difference, product, and average

        sum = firstNumber + secondNumber;
        diff = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        average = firstNumber + secondNumber % 2;

        //Prints the output on seperate lines

        System.out.println("Sum = " + sum);
        System.out.println("Differnce = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
 }