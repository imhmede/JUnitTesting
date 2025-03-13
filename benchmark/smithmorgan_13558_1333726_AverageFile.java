/**
This program reads a file containing two columns of floating-point numbers and prints the average of each column.
@author Morgan Smith
@date 05/04/2023 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AverageFile
{
    /**
     * This method writes to a text file
     * @param pathName The name of the file including the path to where it is located
     * @param line a line to write to a file
     * @throws FileNotFoundException 
     */
    public static void write(String pathName, String line) throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter(new FileOutputStream(new File(pathName), true));
        out.printf("%s\n", line);
        out.close();
    }
     /**
     * This method reads a text file and calls another method to write to a file
     * @param pathName The name of the file including the path to where it is located
     * @return double
     */
    public static double read(String pathName) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(pathName));
        double sum1 = 0, sum2 = 0;
        int count = 0;
        while(in.hasNextDouble())
        {
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            sum1 += num1;
            sum2 += num2;
            count++;
        }
        in.close();
        double average1 = sum1/count;
        double average2 = sum2/count;
        System.out.printf("The average of column 1 is: %.2f\n", average1);
        System.out.printf("The average of column 2 is: %.2f\n", average2);
        return average1;
    }
     /**
     * This is the main method
     * @param args A list of command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Enter the file name and if necessary, its path: ");
        Scanner in = new Scanner(System.in);
        String pathname = in.nextLine();
        System.out.println(read(pathname));
    }
}