import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the first number: ");
        Scanner in1 = new Scanner(System.in);
        double firstNumber = in1.nextDouble();
        System.out.print("Enter the second number: ");
        Scanner in2 = new Scanner(System.in);
        double secondNumber = in2.nextDouble();
        System.out.printf("The sum of the two numbers is: %.1f\n", firstNumber + secondNumber);
        double difference = firstNumber - secondNumber;
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + firstNumber * secondNumber);
        System.out.println("The average of the two numbers is: "+ (firstNumber + secondNumber)/ 2);
    }
}
