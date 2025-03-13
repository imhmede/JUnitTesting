  /**
  * Write a program that reads in a number within the range of 1 to 12 and prints the multiplication table of that number
  *@Kiari Roberts
  *@2023-28-10
* */
import java.util.Scanner;

public class Numbers {
   
 public static void main(String[] args) {
  try (Scanner in = new Scanner(System.in)) {
    //this allows the user to enter in what the progam asks 
    System.out.print("Enter in a number between 1 and 12: ");
    //This prints out "input a number"
      int num1 = in.nextInt();
      //This lets the program read the number you inputed 
       
      for (int i=0; i< 12; i++){
       System.out.println(num1 + " x " + (i+1) + " = " + 
         (num1 * (i+1)));
         //The number the user inputed added by 1 and multiply it by that number
      }
}
 }
}

