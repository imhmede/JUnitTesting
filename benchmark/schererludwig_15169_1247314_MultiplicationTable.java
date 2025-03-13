/**
 * this program calculates the multiplication table of a number between 1 and 12
 * @author Ludwig Scherer
 * @date 03-27-2023
 */

 import java.util.Scanner;

public class MultiplicationTable 
{
    /**
     * the main method
     * @param args a list of command line arguments
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in); //gathers input from user
        System.out.println("Please enter any integer from 1 up to 12: ");
        int number = in.nextInt();
        
        if(number >= 1 && number <= 12) // filters out unwanted input
        {
            for(int i = 0; i <= 12; i++) // loop for the multiplication table
            {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
        else
        {
            System.out.println("Error: Please enter an integer from 1 up to 12: ");
            System.exit(0);
        }
        in.close();
    } 
}
