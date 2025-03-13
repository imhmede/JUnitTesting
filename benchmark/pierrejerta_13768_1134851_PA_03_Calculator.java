import static java.lang.Math.abs;
import java.util.Scanner;

public class PA_03_Calculator {
    public static void main(String[] args) {
        // Variable declarations
        int sum,difference,product;
        double avg;
        
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Get the user inputs
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        
        // Computations
        sum = num1 + num2;
        difference = abs(num1 - num2);
        product = num1 * num2;
        avg = (num1 + num2) / 2.0;
        
        // Print output
        System.out.println("The sum of the two  numbers is " + sum);
        System.out.println("The difference between the two numbers is " + difference);
        System.out.println("The product of the two numbers is " + product);
        System.out.printf("The average is %.6f\n", avg);
    }
    
}
