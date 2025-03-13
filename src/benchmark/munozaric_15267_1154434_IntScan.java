import java.util.Scanner;

public class IntScan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    double average = (num1 + num2) / 2.0;


    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Average: " + average);

  }
}