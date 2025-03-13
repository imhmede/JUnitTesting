/** 
 *This program takes the sum/difference/product and average of 2 numbers
 *@author: Ramon Oropesa
 *October 10,2023
 */
import java.util.Scanner; 
public class Calculator {

/**
 * This program caculates sum/diff/product and avg of 2 numbers
 * @param args a list of possible command-line arguments
 */
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in); 

        /*declaring variables*/ 
        int firstNumber = 0;
        int secondNumber = 0;
        int sum = 0;
        int diff = 0;
        int product = 0;
        int average = 0;

        /*Receving user input*/ 
        System.out.print( "Enter the first number: "); 
        firstNumber= in.nextInt(); 
        System.out.println( "Enter the second number: ");
        secondNumber= in.nextInt(); 

        /*Computing the solutions*/ 
        sum= firstNumber + secondNumber;
        diff= firstNumber - secondNumber;
        product= firstNumber * secondNumber;
        average= firstNumber * secondNumber / 2; 

        /*Displaying solutions*/
        System.out.println(" The sum of the two numbers is: " + sum);
        System.out.println(" The difference is: " + diff); 
        System.out.println(" The product of the two numbers is: " + product);
        System.out.println(" The average of the two numbers is: " + average); 

 
    }
}