/**
 * This program calculates the sum, difference, product, and average of two integers.
 * @author Samuel Blaney
 * @since Oct 11, 2023
 */
import java.util.Scanner; // import scanner from java.util package

public class Calculator {
    /**
     * This is the main entry point of the program.
     * This method prompts and collects two integer inputs from user, then finds and prints their sum, difference, product, and average.
     * @param args list of args passed by the program.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Integer:"); 
        int integerOne = in.nextInt(); // collects first integer from user.
        System.out.println("Enter Second Integer:");
        int integerTwo = in.nextInt(); // collects second integer form user.
        in.nextLine();
        /* Computing sum, difference, product, and average. */
        int sum = integerOne + integerTwo;
        int difference = integerOne - integerTwo;
        int product = integerOne * integerTwo;
        double average = (double)sum / 2; // using casting to allow for decimal precision in the average result.
        System.out.printf("Sum: %d%nDifference: %d%nProduct: %d%nAverage: %.2f%n", sum, difference, product, average); // prints calculations from provided integers on 4 seperate lines.
        in.close();
    }
}
