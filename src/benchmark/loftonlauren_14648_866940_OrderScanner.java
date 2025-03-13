/*
Lauren Lofton
CS123
10/01/22
Lab 3b
Write a program that reads in three integers and prints "in order" if they
are sorted in ascending or descending order, or "not in order" otherwise
*/
import javax.swing.JOptionPane;

public class OrderScanner {

   public static void main(String[] args) {
//request 3 numbers
      String input1 = (JOptionPane.showInputDialog(null, "Please enter a number."));
      String input2 = (JOptionPane.showInputDialog(null, "Please enter a second number."));
      String input3 = (JOptionPane.showInputDialog(null, "Please enter a third number."));
//convert string numbers into integers
      int num1 = Integer.parseInt(input1);
      int num2 = Integer.parseInt(input2);
      int num3 = Integer.parseInt(input3);
      String message;
// if else statement to loop through all "in order" posibilities
      if ((num1 <= num2 && num2 < num3) || (num1 < num2 && num2 <= num3) || (num1 > num2 && num2 >= num3) || (num1 >= num2 && num2 > num3)) {
         message = "In Order";
      } else {
         message = "Not in Order";
      }
//response
      JOptionPane.showMessageDialog(null, num1 + "  " + num2 + "  " + num3 + "    " + message);
   }
}
