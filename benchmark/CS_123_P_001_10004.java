import java.util.Scanner;

/**
 * This program reads, scales, and reverses a sequence of numbers, printing the result.
 * @author (Author unknown, insert here)
 * (Date of creation unknown, insert here)
 */

public class Main
{
    /**
     * This is the main method
     * @param args a list of command line arguments which may be input by the user
     */

    public static void main (String[] args)
    {
        // Set the scale factor by which to multiply the array elements to 10
        final int SCALE_FACTOR;
        SCALE_FACTOR = 10;

        // Set the length of the sequence of numbers to be input by the user to 5
        final int SEQUENCE_LENGTH;
        SEQUENCE_LENGTH = 5;

        // Collect inputs from user, scale the sequence elements, and print the reversal
        double[] sequence = readInputs(SEQUENCE_LENGTH);
        multiply(sequence, SCALE_FACTOR);
        printReversed(sequence);
    }

    /**
     * This method reads a user-input sequence of floating-point numbers
     * @param number the number of inputs to read
     * @return the array of numbers input by the user
     */

    public static double[] readInputs (int number)
    {
        System.out.println("Enter " + number + " numbers: ");
        Scanner in = new Scanner(System.in);
        double[] inputs = new double[number];

        // Traverse the generated array, replacing each value with the user input
        for(int i = 0; i < (inputs.length); i++)
        {
            inputs[i] = in.nextDouble();
        }

        return inputs;
    }

    /**
     * This method multiplies all elements of an array by a factor
     * @param values the array whose elements are to be scaled
     * @param factor the factor by which the elements are scaled
     */

    public static void multiply (double[] values, double factor)
    {
        // Traverse the input array values, multiplying each element by the scale factor
        for(int i = 0; i < (values.length); i++)
        {
            values[i] = (values[i] * factor);
        }
    }

    /**
     * This method prints an array in reverse order, then prints a spacer line
     * @param inputArray The array which is meant to be reversed and printed
     */

    public static void printReversed (double[] inputArray)
    {
        // Traverse the input array in reverse order, starting with the last element
        for(int i = ((inputArray.length) - 1); i >= 0; i--)
        {
            System.out.print(inputArray[i] + " ");
        }

        System.out.println();
    }
}