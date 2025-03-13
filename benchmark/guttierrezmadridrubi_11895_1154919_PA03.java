// CS123 Rubi Madrid PA03//

import java.util.Scanner;

public class PA03
{
    public static void main (String[]args)
    {   
        //Prompt for first number//
        System.out.println("Enter first number:");
        Scanner in = new Scanner (System.in);

        //assigning first integer variable//
        int firstNumber = in.nextInt();       

        //prompt for second number//
        System.out.println("Enter second number: ");

        //assigning second integer variable//
        int secondNumber = in.nextInt();

        //defining variables//
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        // average is divided by 2 since that is the amount of numbers entered//
        float average = (float)(firstNumber + secondNumber)/2;


        //Display results// 
        System.out.println("The sum of the two numbers is " + sum);
        System.out.println("The difference of the two numbers is " + difference);
        System.out.println("The product of the two numbers is " + product);
        System.out.println("The average of the two numbers is " + average);
    }
}