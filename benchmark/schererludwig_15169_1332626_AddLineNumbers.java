/**
 * this program reads a text file, adds line numbers to each line and sends the content to a new file
 * @author Ludwig Scherer
 * @date 05-04-2023
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AddLineNumbers 
{
    /**
     * this method receives a text file, reads the content, adds line numbers, sends it to a new file and prints it
     * @param inputFileName // string input by the user
     * @param outputFileName // string input by the user
     * @throws FileNotFoundException
     */
    public static void addLineNumbers(String inputFileName, String outputFileName) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(inputFileName));
        ArrayList<String> lines = new ArrayList<String>(); // creates array list to store the lines of the file
        int i = 1;
        while(in.hasNextLine())
        {
            lines.add("/*" + i + "*/" + in.nextLine()); // adds the lines to the array list with the line number
            i++;
        }
        PrintWriter out = new PrintWriter(outputFileName);
        for(int j = 0; j < lines.size(); j++) // this loop writes the array list elements into the output file
        {
            out.println(lines.get(j));
        }
        out.close();
        Scanner in2 = new Scanner(new File(outputFileName));
        while(in2.hasNextLine()) // this loop prints the content of the output file
        {
            System.out.println(in2.nextLine());
        }
        in.close();
        in2.close();
    }
    /**
     * the main method
     * @param args a list of command line arguments
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        String inputFileName = in.nextLine();
        System.out.println("Enter the output file name: ");
        String outputFileName = in.nextLine();
        addLineNumbers(inputFileName, outputFileName); // calls the method to add line numbers
        in.close();
    }
}
