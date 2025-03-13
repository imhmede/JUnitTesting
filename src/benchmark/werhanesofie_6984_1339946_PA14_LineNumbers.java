/**
 * PA14: This program reads a file inputed by the user and then writes a file that is the same as the input file but with line numbers.
 * @author  Werhane
 * @date    2023.05.04
 */


//imports the necessary classes and utilities
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;


public class PA14_LineNumbers
{
    /**
     * The main method.
     * @param args                      A series of command-line arguments.
     * @throws FileNotFoundException    If the input file entered does not exist, or the output file does not exist and cannot be created.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        //creates a scanner to get user input
        Scanner scr = new Scanner(System.in);

        //prompts the user to provide the file to be number-lined, then stores it's path as inputFile
        System.out.print("Enter the name of the file containing the text to be number-lined including its path: ");
        String inputFile = scr.nextLine();

        //prompts the user to provide the file to be filled/created, then stores it's path as outputFile
        System.out.print("Enter the name of the file to which the number-lined text will be stored, including its path (if the file does not exists a new one with the given name will be created): ");
        String outputFile = scr.nextLine();

        //fills/creates the number-lined file
        numberLines(inputFile, outputFile);
    }


    /**
     * Creates a file or fills a file with the content of the input file, with each line preceded by a line number surrounded by delimiters.
     * @param inputFile                 The location of the file containing the content to be line-numbered.
     * @param outputFile                The location of the file to which the line-numbered content will be stored.
     * @throws FileNotFoundException    If inputFile does have a file at that location, or outputFile does not have a file at that location and one cannot be created there.
     */
    public static void numberLines(String inputFile, String outputFile) throws FileNotFoundException
    {
        //creates a scanner to read the input file
        Scanner in = new Scanner(new File(inputFile));

        //creates a PrintWriter to write to the ouput file, creates the output file if necessary
        PrintWriter out = new PrintWriter(new FileOutputStream(new File(outputFile), true));

        //cycles through every line in the input file and prints that line with its corresponding line number to the output file
        int i = 1;
        out.println();
        while(in.hasNextLine())
        {
            out.printf("/* %s */ %s\n", i, in.nextLine());

            i++;
        }

        //closes the scanner and PrintWriter
        in.close();
        out.close();
    }
}