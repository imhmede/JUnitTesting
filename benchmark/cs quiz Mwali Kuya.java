
    
    /** 
     * This program reads, scales, and reverses a sequence of numbers.
     * @author Mwali Kuya
     * 4th December 2023
     */

public class 


    import java.util.Scanner;
/*
*this method reads, scales, and reverses a sequence of numbers.
*@param args a list of possible arguements passed by the user
*
 */

 import java.util.Scanner;

 
 public class Main {
     public static void main(String[] args) {
         double[] a = readInputs(5);
         multiply(a, 10);
         printReversed(a);
     }
 
     
    
     public static double[] readInputs(int n) {
         System.out.println("Enter " + n + " numbers: ");
         Scanner in = new Scanner(System.in);
         double[] inputs = new double[n];
         for (int i = 0; i < inputs.length; i++) {
             inputs[i] = in.nextDouble();
         }
         return inputs;
     }
 
     
     public static void multiply(double[] values, double factor) {
         for (int i = 0; i < values.length; i++) {
             values[i] = values[i] * factor;
         }
     }
 
     
     public static void printReversed(double[] v) {
         // array in reverse order, starting with the last element.
         for (int i = v.length - 1; i >= 0; i--) {
             System.out.print(v[i] + " ");
         }
         System.out.println();
     }
 }
 
 




