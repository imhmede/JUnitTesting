//Autumn Brown; 02-19-23; 

import java.util.Scanner;

public class PA3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        int NumberOne;
        int NumberTwo;
        int sum;
        int difference;
        int product;
        double average;

        System.out.print("Enter the first number: \n");
        NumberOne = in.nextInt();

        System.out.print("Enter the second numnber: \n");
        NumberTwo = in.nextInt();
        in.close ();

        sum = NumberOne + NumberTwo;
        difference = NumberTwo - NumberOne;
        product = NumberOne * NumberTwo;
        average = ((NumberOne + NumberTwo) / 2);

        System.out.print("\nThe sum of the two numbers is " + sum);
        System.out.print("\nThe difference between the two numbers is " + difference);
        System.out.print("\nThe product of the two numbers is " + product);
        System.out.printf("\nThe average is %.6f \n", average);
    }
}
