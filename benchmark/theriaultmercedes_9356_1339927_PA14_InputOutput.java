import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * This program reads a file from the user and outputs the line with delimiters to another file
 * @author Mercedes Theriault
 * @date 5-1-2023
 */
public class PA14_InputOutput
{
    /**
     * This method reads the unput file and calls the write method for each line it contains
     * @param input         the file the that provides the lines
     * @param output        the file that is carried to the write() method
     * @throws FileNotFoundException
     */
    public static void read(File input, File output) throws FileNotFoundException
    {
        //creates a scanner to read the input file
        Scanner fileScanner = new Scanner(input);
        //lineNumber is the value of the current line
        int lineNumber = 1;

        //a while loop that will repeat until the file does not have a next line
        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            //if the current line is blank, the line is "skipped" and not sent to the write method
            if(!line.isBlank())
            {
                //calls the write method using the line number, line contents, and output file
                write(lineNumber, line, output);
                lineNumber++;
            }    
        }
        fileScanner.close();
    }

    /**
     * This method prints an individual line of the input file preceeded by the line number enclosed in a delimiter to an output file
     * @param lineNumber    int value for the current line in the input file
     * @param line          the current lines' contents
     * @param output        the file this method writes to
     * @throws FileNotFoundException
     */

    public static void write(int lineNumber, String line, File output) throws FileNotFoundException
    {
        //creates a PrintWriter to print to the output file
        PrintWriter out = new PrintWriter(new FileOutputStream(output, true));
        out.println("/* " + lineNumber + " */ " + line);
        out.close();
    }

    /**
     * This is the main method
     * @param args  a list of command-line arguments
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        //creates a scanner to read user inputs
        Scanner in = new Scanner(System.in);

        //user user input to create the input file
        System.out.println("Please enter the name of the input file: ");
        File inFile = new File(in.next());

        //uses user input to create the output file
        System.out.println("Please enter the name of the output file: ");
        File outFile = new File(in.next());

        //calls the read() method with the file input and output
        read(inFile, outFile);
        System.out.println("Done");
        in.close();

    }
}