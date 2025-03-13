 import java.util.Scanner;

/**
 * This program reads, scales and reverses a sequence of numbers.
 */

public class Main {

   /**
    * This is the main method, it will call upon the other methods in order to multiply array 
    values by a factor and to print the array in reverse order.
    @param args a list of all possible arguments that may be passed by the program
    */

   public static void main(String[] args) {        
      double[] a = readInputs(5);
      multiply(a, 10);
      printReversed(a);
   }


   /**
    * Reads a sequence of floating-point numbers.
   * n is the number of inputs to read
    */

   public static readInputs(double[]) {
      System.out.println("Enter numbers: ");
      Scanner in = new Scanner(System.in); 
      double[] inputs = new double[];
      for(int i = 0; i < inputs.length; i++) {
         (inputs[i] = in.nextDouble());
      }
      return inputs;
   }


   /**
    * Multiplies all elements of an array by a factor.
    */

   public static void multiply(double[] values, double factor) {
      for(int i = 0; i < values.length; i++) {
         (values[i] = values[i] * factor);
      }
   }


   /**
    * Prints an array in reverse order.
    * Traverse the array in reverse order, starting with the last element
    */

   public static void printReversed(double[] values) {
      for(int i = values.length-1; i >= 0; i--) {
         System.out.print(values[i]+" ");
      }
      System.out.println();
   }
}

