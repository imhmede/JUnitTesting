/* This program reads in a number within a range of 1 to 12 and prints the multiplication table of that number
 * @author Paola Pereda
 * PA 08
 * 2023-03-28
 */ 
import java.util.Scanner;

public class MultiplicationTable
{
    /*
     * The main method 
     * @param args a list of user comand-line arguments 
     */
    public static void main(String[] args) /* args: list of strings passed by the user */
    {
        Scanner in = new Scanner(System.in); /* takes in information from the keyboard */
        System.out.println("Enter a number between 1 and 12:"); /*  shows the user to enter a number*/
        int inputNumber = in.nextInt(); /* stores the user input as variable type integer */
        for(int num = 0; num <= 12; num++) /* a for loop to run 12 times starting at 0 */
        {
            int product = inputNumber * num; /* the user input number times the number of times 
            it goes through the for loop all the way to 12 */
            System.out.println(inputNumber + " X " + num + " = " + product); /* prints out the multiplication table */
        }

    }
}