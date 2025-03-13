/**
 * PA13: Reads a text file given by the user containing two columns of floating-point numbers, then prints the average of each line (this is what the expected output indicates).
 * @author  Werhane
 * @date    2023.05.03
 */


//importing necessary classes and utilities
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


//class declaration
public class PA13_FileAverage_MatchExpectedOutput
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

        //prompts user input
        System.out.print("Enter the name of the file including the path where it is located:  ");

        //prints the averages of the two columns at each line of the file provided
        printAverages(scr.nextLine());
    }


    /**
     * Recieves a file containing two columns of floating point numbers and prints the average of the two columns at each line.
     * @param filePath                  The name of the file including its path.
     * @throws FileNotFoundException    If the file provided by the user cannot be found.
     */
    public static void printAverages(String filePath) throws FileNotFoundException
    {
        //creates a scanner to read the file
        Scanner in = new Scanner(new File(filePath));

        //prints the line, line number, and average of the two columns at each line (assumes that each line has but two columns)
        float firstColumn, secondColumn;
        int lineNumber = 1;
        while(in.hasNext())
        {
            firstColumn = in.nextFloat();
            secondColumn = in.nextFloat();

            System.out.printf("line(%s): %s \t %s \n", lineNumber, firstColumn, secondColumn);
            System.out.printf("\t average = (%s + %s)/2 = %s \n", firstColumn, secondColumn, (firstColumn + secondColumn)/2);
            
            lineNumber++;
        }
    
        //closes the file
        in.close();
    }
}