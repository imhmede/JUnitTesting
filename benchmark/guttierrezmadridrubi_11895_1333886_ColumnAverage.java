/*
 * This program reads a file containing two columns of floating-point numbers and returns the average of each column
 * @author Rubi Madrid CS123
 * @date May 4, 2023
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 public class ColumnAverage
 {
    /*
     * This is the main method
     * @param a series of command-line prompts
     */
    public static void main(String[] args)
    {
        //sets up scanner
        Scanner input = new Scanner(System.in);

        //prompts user for file name
        System.out.print("Please enter the file name:");

        //saves next entered string as fileName 
        String fileName = input.next();

        //closes input scanner
        input.close();

        //creates new file from fileName
        File file = new File(fileName);

        //sets scanner object to null
        Scanner in = null;

        try
        {
            //reads file using scanner
            in = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            //prompts file does not exist message if FileNotFoundException is thrown 
            System.out.println("The file does not exist");
        }

        //saves double variable firstColumnSum 
        double firstColumnSum = 0;

        //saves double variable secondColumnSum
        double secondColumnSum = 0;

        //saves integer variable for rows in sample text
        int everyRow = 0;

        //while the file has a next line
        while (in.hasNextLine())
        {
            //splits the elements in row with by the spaces/tabs
            String [] row = in.nextLine().split("\\s+");

            //adds the content of the first column into the variable firstColumnSum
            firstColumnSum += Double.parseDouble(row[0]);

            //adds the content of the second column into the variable secondColumnSum
            secondColumnSum += Double.parseDouble(row[1]);

            //adds 1 to number of rows being read
            everyRow++;

        }
        //closes scanner
        in.close();

        //prints out the total of the first column divided by the number of rows
        System.out.printf("The average if the first column is: %.2f\n", firstColumnSum / everyRow);

        //prints out the total of the second column divided by the number of rows
        System.out.printf("The average of the second column is %.2f\n", secondColumnSum / everyRow);
    }
    
 }
 