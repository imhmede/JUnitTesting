// Anthony Marrs
// CS 123 - Computer Science I 001/1AW
// October 11, 2023. Assignment PS 03
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sumResult = num1 + num2;

        // Calculate the difference between the two numbers
        int diffResult = num1 - num2;

        // Calculate the product of the two numbers
        int productResult = num1 * num2;

        // Calculate the average of the two numbers
        double averageResult = (num1 + num2) / 2.0;

        // Print the results with appropriate labels
        System.out.println("The sum of the two numbers is : " + sumResult);
        System.out.println("The difference between the two numbers is: " + diffResult);
        System.out.println("The product of the two numbers is: " + productResult);
        System.out.println("The average is: " + averageResult);
        
        scanner.close(); // Close the scanner when done
    }
}