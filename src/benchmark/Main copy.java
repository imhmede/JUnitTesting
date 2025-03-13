 /**
  * This code reads, scales, and reverses sequence of numbers
  * @author Ramon Barrera
  * Dec 3, 2023
  */
  import java.util.Scanner;

public class Main {

   /**
    * This is the main method of the program
    * @param args a list of possible arguments passed on by the user
    */

   public static void main(String[] args) {
      double[] userInput = readInputs(5);
      multiply (userInput, 10);
      printReversed (userInput);
   }

   /* 
   * A method that reads a sequence of floating-point numbers.
   * @param n  is the number of inputs to read
   * @ return  array inputs
   */
   public static double[] readInputs (int numbers) {
      System.out.println("Enter" + numbers + " numbers: ");
      Scanner in = new Scanner(System.in); 
      double[] inputs = new double[numbers];
      for (int i = 0; i < inputs.length; i++) {
         inputs[i] = in.nextDouble();
      }
      return inputs;
   }
   
   /* A method that multiplies all elements of an array by a factor.
    * @param values
    * @ factor
    */
   public static void multiply(double[] values,double factor) {
      for (int i = 0; i < values.length; i++) {
         values[i] = values[i] * factor;
      }
   }

   /**
   * A method that prints an array in reverse order.
   * @param v reversed array printed
   * Traverse the array in reverse order, starting with the last element
   */
   public static void printReversed(double[] v) {
      for (int i = v.length - 1; i >= 0; i--) {
         System.out.print(v[i] + " ");
      }
      System.out.println();
   }
}

