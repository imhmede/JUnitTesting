 /**
  * This program will prompt the user for two numbers then, it will 
  *pring the sum, difference, product, and average of the numbers.
  *@author Jordan Arguello CS123
  * Oct, 11, 2023
  */
  import java.util.Scanner;

  public class Calculator{

 /**
   * This method will compute the sum, difference, product, and average
   * of two numbers.
   * @param args a list of possible arguments passed by user.
   */
  public static void main(String[] args){
Scanner in = new Scanner(System.in);
int firstNumber = 0;
int secondNumber = 0;
int sum = 0;
int difference = 0;
int product = 0;
int average = 0;

System.out.println("Enter first number");
firstNumber = in.nextInt();
System.out.println("Enter second number");
secondNumber = in.nextInt();

sum = firstNumber + secondNumber;
difference = firstNumber - secondNumber;
product = firstNumber * secondNumber;
average = (firstNumber + secondNumber) % 2;

System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);
System.out.println("Average: " + average);
  }
  }
 