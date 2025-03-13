import java.util.Scanner;
public class calculator
 {
    /**
    * @param args
    */
   public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double sum;
    double difference;
    double product;
    double average;
 System.out.print("Enter the first number: ");
 a = input.nextDouble();
 System.out.print("Enter the second number: ");
 b = input.nextDouble();
 input.close();
 sum = a + b;
 difference = a - b;
 product = a * b;
 average = ((a + b) / 2);
System.out.printf("\nThe sum of the two numbers is %.0f\n", sum);
System.out.printf("\nThe difference between the two numbers is %.0f\n", difference);
System.out.printf("\nThe product of the two numbers is %.0f\n", product);
System.out.printf("\nThe average is %.4f\n", average);

 }
}
