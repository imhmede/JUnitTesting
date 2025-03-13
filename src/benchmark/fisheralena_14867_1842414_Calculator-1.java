/**
 * PS 03
 * This program calculates the sum, difference, product, and average of two integers
 * @author  Alena Fisher
 * October 9, 2023
 */

 import java.util.Scanner;

 public class Calculator {
    /**
     * This is the entry point of the program
     * @param   args   a list of possible arguments passed by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Gathering input from the user
        System.out.println("Enter the first integer: ");
        int number1 = in.nextInt();

        System.out.println("Enter the second integer: ");
        int number2 = in.nextInt();

        // Calculation of the integers
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int average = (number1 + number2) / 2;

        // Printing the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("The difference of " + number1 + " and " + number2 + " is " + difference);
        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);
        System.out.println("The average of " + number1 + " and " + number2 + " is " + average);
    }
 }