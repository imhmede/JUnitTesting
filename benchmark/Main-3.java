/**
 * This program reads, scales and reverses a sequence of numbers.
 * @author Alena Fisher
 * 13 December 2023
*/

import java.util.Scanner;

public class Main {
    /**
     * This is the entry point of the program
     * @param   args   a list of possible arguments passed by the user
    */

    public static void main(String[] args) {
        double[] a = read_inputs(5);
        multiply(a, 10);
        printreversed(a);
    }
    
    public static double[] read_inputs(int n) {
        /**
         * The method reads a sequence of floating-point numbers
         * n is the number of inputs to read
         * @param   a list of floating-point numbers passed by the user
        */
        
        System.out.println("Enter " + n + " numbers: ");
        Scanner in = new Scanner(System.in); 
        double[] inputs = new double[n];
        
        for( int i = 0; i < inputs.length; i++ ) {
            inputs[i] = in.nextDouble();
        }

        return inputs;
    }

    public static void multiply(double[] values, double factor) {
        /**
         * This method multiplies all elements of an array by a factor.
         * @param   an array of elements passed by the user.
        */
        
        for( int i = 0; i < values.length; i++ ) {
            values[i] = values[i] * factor;
        }
    }

    public static void printreversed(double[] v) {
        /**
         * This method prints an array in reversed order
         * @param   the array in reverse order
        */
        
        // Traverse the array in reverse order, starting with the last element
        for( int i = v.length - 1; i >= 0; i-- ) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println();
    }
}
