/**
 * This program finds the sum, difference, product, and average of the two numbers, as input by the user.
 * @author Kyle Dean
 * October 10, 2023
 */

import java.util.Scanner;
import static java.lang.Math.abs;

public class Calculator {

    /**
     * This is the entry point to the program.
     * @param args is a list of possible command line arguments passed by the user
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double number_total = 2; // This line sets the number of values to be collected and compared by the user to 2.

        /*
        The following lines collect the numbers from the user that are to be compared.
         */

        System.out.println("Enter the first number: ");
        int number1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();

        /*
        The following lines decide the comparisons between the numbers.
         */

        int number_sum = number1 + number2;
        int number_difference = number1 - number2;
        int number_product = number1*number2;
        double number_average = number_sum/number_total;

        int number_distance = abs(number_difference); // This line changes the value of the difference to a positive value, if negative.

        /*
        The following lines print the results of the program.
         */

        System.out.println("The sum of the two numbers is " + number_sum);
        System.out.println("The difference between the two numbers is " + number_distance);
        System.out.println("The product of the two numbers is " + number_product);
        System.out.println("The average is " + number_average);

    }
}
