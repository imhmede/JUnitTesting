import java.util.Scanner;
// Lwesso Mukeni 
// Oct 10, 2023
// PS03

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        int sum = 0;
        int diff = 0;

        // input from user
        System.out.print("Enter the first number: ");
        firstNumber = in.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = in.nextInt();

        // computing the sum and the difference
        sum = firstNumber + secondNumber;
        diff = firstNumber - secondNumber;

        // computing the product and the average
        int product = firstNumber * secondNumber;
        double average = (double) (firstNumber + secondNumber) / 2;

        // Output
        System.out.println("The sum of the two numbers is " + sum);
        System.out.println("The difference between the two numbers is " + diff);
        System.out.println("The product of the two numbers is " + product);
        System.out.println("The average is " + average);
    }
}