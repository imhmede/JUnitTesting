/**
 * This program reads, scales, and reverses a sequence of numbers stored in an array.
 * @author cs 123
 * @since Dec 3, 2023
 */
import java.util.Scanner;

public class NumberProcessor {

   /**
    * This is the main entry point for the program 
    * @param	args 	a list of possible command-line arguments.
    */
   public static void main(String[] args) {        
      double[] inputsArray = readInputs(5);
      multiplyInputs(inputsArray, 10);
      printReversed(inputsArray);
   }

   /**
    * Reads a sequence of floating-point numbers.
    * @param n the number of inputs to read
    * @return an array of double values
    */ 
   public static double[] readInputs(int n) {
      System.out.println("Enter " + n + " numbers: " );
      Scanner in = new Scanner(System.in); 
      double[] inputs = new double[n];
      for (int i = 0; i < inputs.length; i++){
	      inputs[i] = in.nextDouble();
      }
      return inputs;
   }

   
   /**
    * Multiplies all elements of an array by a factor.
    * @param values the array to be multiplied.
    * @param factor the multiplication factor.
    */
   public static void multiplyInputs(double[] values,double factor) {
      for(int i = 0; i < values.length; i++) {
         values[i] = values[i] * factor;
      }
   }

   /**
    * Prints an array in reverse order.
    * @param v the array to be printed in reverse order.
    */
   public static void printReversed(double[] v) {
      // Traverse the array in reverse order, starting with the last element
      for(int i = v.length - 1; i >= 0; i--) {
         System.out.print(v[i] + " ");
      }
      System.out.println();
   }
}

