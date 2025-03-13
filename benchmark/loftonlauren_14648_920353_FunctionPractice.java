/**
 * Lauren Lofton 
 * 10/30/22 
 * CS 123 
 * Lab 5a
 *
 * Write the following methods and provide a program to test them. 
 * a. boolean allTheSame(double x, double y, double z), 
 * returning true if the arguments are the same, or false otherwise.
 * b. double average(double x, double y, double z), 
 * returning the average of the arguments.
 * c. double theSmallest(double x, double y, double z), 
 * returning the smallest of the arguments. 
 * d. boolean sorted(double x, double y, double z), 
 * returning true if the arguments are sorted, with the smallest one coming first.
 */
import javax.swing.*;

public class FunctionPractice {

   public static void main(String[] args) {
//request 3 numbers
      String input1 = (JOptionPane.showInputDialog("Please enter a whole number."));
      String input2 = (JOptionPane.showInputDialog("Please enter a second whole number."));
      String input3 = (JOptionPane.showInputDialog("Please enter a third whole number."));

//convert string numbers into integers
      double x = Integer.parseInt(input1);
      double y = Integer.parseInt(input2);
      double z = Integer.parseInt(input3);

//response
      JOptionPane.showMessageDialog(null,
             "Your numbers: " + x + ", " + y + ", " + z
             + "\nAll the same?  " + (allTheSame(x, y, z))
             + "\nAverage " + (average(x, y, z))
             + "\nSmallest number: " + (theSmallest(x, y, z))
             + "\nSorted smallest to largest?  " + (sorted(x, y, z))
      );
   }

//return true if the arguments are the same, or false otherwise.
   public static boolean allTheSame(double x, double y, double z) {
      return x == y && y == z;
   }

//return the average of the arguments
   public static double average(double x, double y, double z) {
      return (x + y + z) / 3;
   }
   
//return the smallest of the arguments
   public static double theSmallest(double x, double y, double z) {
      double smallest = x;
      if (y < smallest) {
         smallest = y;
      } else if (z < smallest) {
         smallest = z;
      }
      return smallest;
   }

//return true if the arguments are sorted, with the smallest one coming first
   public static boolean sorted(double x, double y, double z) {
      return x <= y && z >= y;
   }

}
