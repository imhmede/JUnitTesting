/**
 * This program finds the sum and the differene between two integers
 * @author Ramon Barrera
 * 10/11/2023
 */
 
import java.util.Scanner;

public class javaCalculator {

    /**
     * This is the main entry point of the program
     * @param   args  a list of possible arguments passed by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        int sum = 0;
        int diff = 0;
        int product = 0;
        double average = 0;

        /*Receiving user input */
        System.out.println("Enter first integer: ");
        firstNumber = in.nextInt();
         System.out.println("Enter the second integer: ");
        secondNumber = in.nextInt();

        /* Computing the sum, difference, product, and average */
        sum = firstNumber + secondNumber;
        diff = (firstNumber - secondNumber);
        product = firstNumber * secondNumber;
        average = (firstNumber + secondNumber) / 2;

        if ( diff < 0) {
            diff = diff * -1;
        }
        //Output
        System.out.println("The sum of the two numbers is :" + sum);
        System.out.println("The difference between the two numbers is :" + diff);
        System.out.println("The product of the two number is :" + product);
        System.out.printf("The average is : %.6f" , + average);
        System.out.println();
        System.out.println();
    }

}
