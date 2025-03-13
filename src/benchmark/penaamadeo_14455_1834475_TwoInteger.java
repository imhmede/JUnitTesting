/**
 * PS 03
 * This program shows the sum, diff, product, and average of two integers.
 * @author Amadeo Pena
 * 10/06/2023
 */
import java.util.Scanner;

public class TwoInteger {
    /**
     * This method computes the sum, diff, product, and average of two integers.
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = in.nextInt();
        System.out.println("Enter the second number: ");
        int numberTwo = in.nextInt();

        int sum = numberOne + numberTwo;
        System.out.println("The sum of the two numbers is " + sum);

        int dif = numberTwo - numberOne;
        System.out.println("The difference of the two numbers is " + dif);

        int product = numberOne * numberTwo;
        System.out.println("The product of the two numbers is " + product);

        float average = sum / 2 ;
        System.out.println("The average is " + average);
    }
    
}
