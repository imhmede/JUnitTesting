/**
This program takes a numeric input and then displays its multiplication table up to 12.
@author Daniel Sanchez
@version 1
Assignment: PA07 vowelCount
Date: 3/26/2023
*/
import java.util.Scanner;
public class productRange { //class
    /**
     * This method takes numeric input and determines its multiplication tables within parameter range.
     * @param args input is given once by program user.
     * a variable is initialized as a counter named counter.
     * for loop goes through length of the string
     * 'for' statment goes through a range of iterations
     * 'if' statment checks boolean, does arithmetic, and displays by each line respectively.
     */
    public static void main(String[] args) //method
    {
        Scanner in = new Scanner(System.in);  //Created a Scanner object
        System.out.println("Enter a number between 1 and 12: "); //Ask for input 1
        int userInput1 = in.nextInt();  //Read user input 1
        int counter = 0;  //Variable initialized outside of loop for coutning
        for(int i = 0; i <= 12; i++) // for loop runs iteration beneath in if statement 12 times
        {
            if(userInput1 <= 12 && userInput1 >= 1) // if parameters for range of acceptable input
            {
                System.out.println(userInput1 + " x " + counter + " = " + counter * userInput1); //Display multiplication table of input given
                counter =counter +1; // counter for iterations adds outside the loop of the body
            }
        }
        in.close();// closes scanner
    }
}