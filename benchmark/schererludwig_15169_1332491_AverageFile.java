/**
 * this program opens a file, reads two columns of floating point numbers and computes the average of each line
 * @author Ludwig Scherer
 * @date 05-03-2023
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AverageFile 
{
    /**
     * thi method calculates the average of two floating point numbers per line and prints the result
     * @param fileName string input from the user
     * @throws FileNotFoundException
     */
    public static void getAverage(String fileName) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(fileName));
        int counter = 1;
        while(in.hasNextLine()) // this loop goes throufh the file line by line, gets the two numbers contained in each line and calculates the average
        {
            float number1 = Float.parseFloat(in.next());
            float number2 = Float.parseFloat(in.next());
            float averageOfLine = (number1 + number2) / 2;
            System.out.printf("Line(%d): %.2f  %.2f\n",counter, number1, number2);
            System.out.printf("     average = (%.2f + %.2f) / 2 = %.2f\n", number1, number2, averageOfLine); 
            counter++;
            in.nextLine();
        }
        in.close();
    }
    /**
     * the main method
     * @param args a string of command line arguments
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name including the path where it is located: ");
        String fileName = in.nextLine();
        getAverage(fileName); // method call to calculate the average of each line in a given file
        in.close();
    }
}
