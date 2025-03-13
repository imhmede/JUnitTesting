/**
 * Class (CS 123, PA 13) This program reads a text file and outputs the average of the two numbers in the file.
 * @author Bonny Vigil
 * @date 5/4/2023
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AverageDoubleFile
{
    
    /**
     * This method outputs reads the file and outputs the average of two double numbers
     * @param fileName the name of the file being used 
     * @throws FileNotFoundException
     */
    public static void read(String fileName) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(fileName)); //takes in the values from the file
        int counter = 1; //counter for the line number in the output
        while(in.hasNextLine()) //while loop that reads as long as there is a line in the file
        {
            while(in.hasNextDouble()) //while loop that takes in each double number
            {
                System.out.println("line (" + counter + "): "); //prints the line
                double firstNumber = in.nextDouble(); //initializes the first double of the line
                double secondNumber = in.nextDouble(); //initializes the second double of the line
                double average = (firstNumber + secondNumber)/2; //finds the average
                System.out.println("The average of " + firstNumber + " and " + secondNumber + " is (rounded to 2 places after the decimal): "); //prints statement for user
                System.out.printf("\t (" + firstNumber + " + " + secondNumber + ")/2 = " + String.format("%.2f", average) + "\n"); //prints the average
                counter++; //counter
            }

        }
    } 

    /**
     * Main Method
     * @param args user inputs the file name, calls the read method
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Enter the file name: "); //asks for file name
        Scanner in = new Scanner(System.in); //takes in file name
        String name = in.nextLine(); //initializes the name
        read(name); //calls the read method
    }
}