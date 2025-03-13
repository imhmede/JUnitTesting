/**
 *This program takes 5 inputs and reads, scales, and reverses the sequence of numbers stored in an array
 * @author CS 123
 * 12/3/2023
 */
import java.util.Scanner;

public class Main {
    /**
     *Functions for reversing the sequence of numbers and multiplying them by 10
     */
    public static void main(String[]args ){
        double[] a = readInputs(5);
        multiply(a, 10);
        printReversed(a);
    }

    /**
     * Inputs for a sequence of floating-point numbers.
     * @param n n is the number of inputs to read
     * @return Reads a sequence of floating-point numbers.
     */
    public static double[] readInputs(int n){
        System.out.println("Enter " + n + " numbers: ");
        Scanner in = new Scanner(System.in);
        double[] inputs = new double[n];

        for(int i = 0; i <inputs.length; i++){
            inputs[i] = in.nextDouble();
        }
        return inputs;
    }

    /**
     *Multiplies all elements of an array by a factor.
     * @param values is use for run time
     * @param factor is for multiplying by 10
     */
    public static void multiply(double[] values, double factor){
        for(int i = 0; i < values.length; i++) {
            values[i] = values[i] * factor;
        }
    }

    /**
     *Traverse the array in reverse order, starting with the last element and prints
     * @param v is a counter
     */
    public static void printReversed(double[] v){
        for(int i = v.length-1; i >= 0; i--){
            System.out.print(v[i] + " ");
        }
    }
}