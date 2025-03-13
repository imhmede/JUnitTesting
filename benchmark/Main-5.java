/**
* This is the corrected code according to Google Java Style Guide
* @author CS123 Anthony Marrs
* December 3, 2023
*/
import java.util.Scanner;
import java.util.InputMismatchException;

//This program reads, scales and reverses a sequence of numbers.

public class Main {
    public static void main(String[] args) {
        double[] numbers = readInputs(5);
        if (numbers != null) {
            multiply(numbers, 10);
            printReversed(numbers);
        }
    }

    // Reads a sequence of floating-point numbers.
    // count is the number of inputs to read
    public static double[] readInputs(int count) {
        System.out.println("Enter " + count + " numbers:");
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[count];
        int inputsRead = 0;

        while (inputsRead < count) {
            try {
                numbers[inputsRead] = scanner.nextDouble();
                inputsRead++;
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return numbers;
    }

    // Multiplies all elements of an array by a factor.
    public static void multiply(double[] numbers, double factor) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * factor;
        }
    }

    // Prints an array in reverse order.
    public static void printReversed(double[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}



