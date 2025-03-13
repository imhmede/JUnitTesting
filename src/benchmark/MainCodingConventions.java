 import java.util.Scanner;

/**
*This program reads, scales and reverses a sequence of numbers.
*@author: CS 123 Class	
*Decemeber 5, 2023
*/

public class Main {

   /**
   *This method prints an array in reverse order
   *@param a list of possible command-line arguments
   */
   public static void main(String[] args) {        
      double[] a = read_inputs(5);
      multiply(a, 10);
      printReversed(a);
   }

   /**
   *This method reads a sequence of floating-point numbers
   *@param n is the number of inputs to read
   *@return input of arrays
   */
   public static double[] readInputs(int n) {
      System.out.println("Enter "+ n +" numbers: " );
      Scanner in = new Scanner(System.in); 
      double[] inputs = new double[n];

      for(int i=0; i < inputs.length; i++){
          inputs[i] = in.nextDouble();
}

      return inputs;
   }

   
   /**
   *This method multiplies all elements of an array by a factor.
   *@param numbers	
   */
  public static void multiply(double[] values, double factor) {
      for(int i=0; i < values.length; i++) {
         values[i]= values[i] * factor;
      }
   }

   /**
   *This method prints an array in reverse order
   *@param numbers	
   */

   public static void printReversed(double[] v) {
      // Traverse the array in reverse order, starting with the last element
      for(int i = v.length-1; i>=0; i--) {
         System.out.print(v[i]+" ");

      }
      System.out.println();
   }
}
