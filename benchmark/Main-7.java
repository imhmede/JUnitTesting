import java.util.Scanner;
/**
 * This program reads, scales and reverses a sequence of numbers.
 * It takes user input, multiplies the input values by a specified factor,
 * and then prints the reversed sequence.
 * 
 * December 2, 2023
 */
public class Main {
   /**
     * The main method of the program.
     */
   public static void main(String[]args )
   {        
      double[] a = readInputs(5);
      multiply(a, 10);
      printReversed(a);
   }

   /**
     * Reads a sequence of floating-point numbers.
     * 
     * @param n the number of inputs to read
     * @return an array containing the input values
     */
   public static double[] readInputs(int n) {

      System.out.println("Enter " + n + " numbers: " );
      Scanner in = new Scanner(System.in); 
      double[] inputs = new double[n];

      for(int i=0; i < inputs.length; i++) {
         inputs[i] = in.nextDouble();
      }
      return inputs;
   }

   /**
     * Multiplies all elements of an array by a factor.
     * 
     * @param values the array to be multiplied
     * @param factor the factor by which each element is multiplied
     */
   public static void multiply(double[] values, double factor) {
      for(int i=0; i < values.length; i++) {
         values[i] = values[i] * factor;
      }
   }

   /**
     * Prints an array in reverse order.
     * 
     * @param v the array to be printed in reverse order
     */
   public static void printReversed(double[] v) {
      // Traverse the array in reverse order, starting with the last element
      for(int i = v.length-1; i >= 0; i--) {
         System.out.print(v[i] + " ");
      }
      System.out.println();
   }
}
