//PA_03
//Jacob Rogers
//February 20, 2023

import java.util.Scanner;

public class PA_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        
        int diff = num1 - num2;
        System.out.println("The difference between the two numbers is: " + diff);

        
        int product = num1 * num2;
        System.out.println("The product of the two numbers is: " + product);

        
        double avg = (num1 + num2) / 2.0;
        System.out.println("The average is: " + avg);
    }
}