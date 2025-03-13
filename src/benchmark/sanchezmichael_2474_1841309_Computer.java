import java.util.Scanner;

public class Computer {
    /**
     * @author Michael Sanchez
     * Date: 10/09/2023
     * Program that prompts the user for two integers and then prints:
     * the sum of the two numbers,
     * the difference between the two numbers,
     * the product of the two numbers,
     * and the average.
     */
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:"); //message to user for first number
        Integer num1 = in.nextInt(); //prompts user for first integer
        System.out.println("Enter the second number:"); //message to user for second number
        int num2 = in.nextInt(); //prompts user for second integer

        int numSum = num1 + num2; //computation of sum
        int numSub = num1 - num2; //computation of subtraction
        int numProd = num1 * num2; //computation of multiplicaton
        double numAve = (double)numSum / 2; //cast numSum to double and computation of average

        System.out.print("The sum of the two numbers is ");
        System.out.println(numSum);
        System.out.print("The difference between the two numbers is ");
        System.out.println(numSub);
        System.out.print("The product of the two numbers is ");
        System.out.println(numProd);
        System.out.printf("The average is %.6f", numAve);
        System.out.println();
        System.out.println();
     }
}

/**
 * Declare necessary variables
 * Prompt user for twice for two input numbers
 * Add num1 to num2 and print sum as output
 * Subtract num1 and num2 then print output
 * Multiply num1 and num2 then print output
 * Take average of num1 and num2 and print average
 */