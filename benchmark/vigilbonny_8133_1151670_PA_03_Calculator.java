/**
 * This is a program to allow users to find the sum, difference, product, and average of two integers
 * @author Bonny Vigil
 * date: 2/18/2023
 * assignment title: PA_03
 */

import java.util.Scanner;

public class PA_03_Calculator

{
    /**
     * This method gathers two integers from the user.
     * @param args
     */

    public static void main(String[] args)

    {
        System.out.println("Enter an integer: "); //Receives one integer from the user
        Scanner in = new Scanner(System.in);
        int numberOne = in.nextInt();

        System.out.println("Enter a second integer: "); //Receives a second integer from the user
        int numberTwo = in.nextInt();

        int sum = (int) numberOne + numberTwo; //This calcuates the sum of the two integers
        int difference = (int) numberOne - numberTwo; //This calcuates the difference of the two integers
        int product = (int) numberOne * numberTwo; //This calculates the product of the two integers
        float average = (((float) numberOne + (float) numberTwo)/2); //This calculates the average of the two integers
    
        //The lines below print the four calucations from above
        System.out.println("The sum of the two numbers is " + (sum));
        System.out.println("The difference between the two numbers is " + (difference));
        System.out.println("The product of the two numbers is " + (product));
        System.out.printf("The average is %f",average);

    }


}