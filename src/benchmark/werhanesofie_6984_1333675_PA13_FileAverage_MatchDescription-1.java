/**
 * PA13: Reads a text file given by the user containing two columns of floating-point numbers, then prints the average of each column.
 * @author  Werhane
 * @date    2023.05.03
 */


//importing necessary classes and utilities
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


//class declaration
public class PA13_FileAverage_MatchDescription
{
    /**
     * The main method.
     * @param args                      A series of command-line arguments.
     * @throws FileNotFoundException    If the file provided by the user cannot be found.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        //creates a scanner to get user input
        Scanner scr = new Scanner(System.in);

        //prompts the user for input
        System.out.print("Enter the name of the file including the path where it is located:  ");

        //prints the average of the total of each column in the file provided by the user
        printAverages(scr.nextLine());
    }


    /**
     * Recieves a file containing two (equal length) columns of floating point numbers and prints the average of each of the two columns.
     * @param filePath                  The name of the file including its path.
     * @throws FileNotFoundException    If the file provided by the user cannot be found.
     */
    public static void printAverages(String filePath) throws FileNotFoundException
    {
        //creates a scanner to read the file
        Scanner in = new Scanner(new File(filePath));

        //goes through every element of the file and creates a sum of the elements in each column (assumes that there are but two columns), and counts the elements in the columns
        float firstColumn = 0, secondColumn = 0;
        int i = 0;
        while(in.hasNext())
        {
            firstColumn = firstColumn + in.nextFloat();
            secondColumn = secondColumn + in.nextFloat();

            i++;
        }

        //prints the average of the each columns
        System.out.printf("The average of first column is: %s\nThe average of the second column is: %s", firstColumn/i, secondColumn/i);

        //closes the file
        in.close();
    }
}