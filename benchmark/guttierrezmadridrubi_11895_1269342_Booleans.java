/**
 * this program accepts a user's input for integers and states if they are all the same, all different and sorted in order
 * 
 * @author Rubi Madrid  CS123
 * @date 04.03.2023
 */

 /*imports scanner utility */
 import java.util.Scanner;

 public class Booleans
 {
 /**
  * this method returns true if the arguments are all the same
    @param x the first number entered, a double value
    @param y the second number entered, a double value
    @param z the third number entered, a double value
    @return true or false depending on result of if statement
  */
 public static boolean allTheSame(double x, double y, double z)
 {
    if (x == y && y == z && z == x)
    {
        return true;
    }
    else
    {
        return false;
    }
 }

 /**
  * this method returns true if the arguments are all different
  @param x the first number entered, a double value
  @param y the second number entered, a double value
  @param z the third number entered, a double value
  @return true or false depending on result of if statement
  */
 public static boolean allDifferent(double x, double y, double z)
 {
    if (x != y && y != z && z != x)
    {
        return true;
    }
    else
    {
        return false;
    }
 }

/**
 * this method returns true if the arguments are sorted, with the smallest coming in first 
 * @param x the first number entered, a double value
 * @param y the second number entered, a double value
 * @param z the third number entered, a double value
 * @return true or false depending on result of if statement
 */
 public static boolean sorted(double x, double y, double z)
 {
    if (x < y && y < z )
    {
        return true;
    }
    else
    {
        return false;
    }
    
 }

 /**
  * This is the main method 
  @param a series of command-line arguments
  */
 public static void main (String[]args)
 {
    //imports scanner
    Scanner in = new Scanner(System.in);

    //prompts for first number
    System.out.println("Enter the first number:");

    //stores first number
    double x = in.nextDouble();

    //prompts for second number
    System.out.println("Enter the second number:");

    //stores second number
    double y = in.nextDouble();

    //prompts for third number
    System.out.println("Enter the third number:");

    //stores third number
    double z = in.nextDouble();

    //calls allTheSame method and prints out that numbers are the same
    if(allTheSame(x,y,z) == true)
    {
        System.out.println("All the numbers are the same");
    }
    
    //calls allDifferent method and prints out that numbers are different
    if(allDifferent(x,y,z) == true)
    {
        System.out.println("All the numbers are different");
    }

    // calls sorted method and prints out if numbers are sorted from smallest to largest
    if(sorted(x,y,z) == true)
    {
        System.out.println("All the numbers are sorted");
    }
 } 
}