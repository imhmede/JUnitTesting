/**
This program takes two inputs and does basic arithmetic with those inputs.
@author Daniel Sanchez
@version 1
Assignment: PA03
Date: 2/20/2023
*/
import java.util.Scanner;
public class PA03 {  
    /**
     * This method takes two inputs and does basic arithmetic.
     * @param args input is given twice by program user
     * @param args string userInput1 converted to float and stored in number1
     * @param args string userInput2 converted to float and stored in  number2
     * @param args simple arithmetic (+, -, *, /) is used on floats and then displayed
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Created a Scanner object
        System.out.println("Enter a first number: "); // Ask for input 1
        String userInput1 = in.nextLine();  // Read user input 1
        System.out.println("Enter a second number: "); // Ask for input 2
        String userInput2 = in.nextLine();  // Read user input 2
        in.close(); //closes scanner no more parameters
        float number1 = Float.parseFloat(userInput1); // User input into float
        float number2 = Float.parseFloat(userInput2); // User input into float
        System.out.println("The sum of the two numbers is: " +(number1 + number2));  // Display user input as a sum
        System.out.println("The difference of the two numbers is: " +(number1 - number2));  // Display user input as a difference
        System.out.println("The product of the two numbers is: " +(number1 * number2));  // Display user input as a product
        System.out.println("The average is: " +(number1 + number2)/2);  // Display user input into as a average
    }
}