 /**
  * This program reads, scales and reverses a sequence of numbers.
  * @author CS 123 Students
  * Dec. 3, 2023
  */

import java.util.Scanner;

public class Main {
   
   /**
    * Reads a sequence of floating-point numbers.
    * @param n  the number of inputs to read
    * @return  an array of double values
    */
   public static double[] readInputs(int n) {
      System.out.println("Enter " + n + " numbers: ");
      Scanner in = new Scanner(System.in); 
      double[] inputs = new double[n];

      for (int i = 0; i < inputs.length; i++) {
         inputs[i] = in.nextDouble();
      }
      return inputs;
   }

   /**
   * Multiplies all elements of an array by a factor
   * @param values  the array of double values
   * @param factor  the factor to multiply by
   */
   public static void multiply(double[] values, double factor) {
      for (int i = 0; i < values.length; i++) {
         values[i] = values[i] * factor;
      }
   }

   /**
    * Prints an array in reverse order.
    * @param v  the array of double values to be printed in reverse
    */
   public static void printReversed(double[] v) {
      // Traverse the array in reverse order, starting with the last element
      for (int i = v.length - 1; i >= 0; i--) {
         System.out.print(v[i] + " ");
      }
      System.out.println();
   }

   /**
    * This is the main method.
    * @param args  a list of command-line arguments passed by the user
    */
    public static void main(String[] args) {        
      double[] a = readInputs(5);
      multiply(a, 10);
      printReversed(a);
   }
}

