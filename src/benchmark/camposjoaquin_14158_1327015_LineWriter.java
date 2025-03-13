import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A program that reads lines from an input file, prefixes each line with a line number and a comment symbol, 
 * and writes the modified lines to an output file.
 */
public class LineWriter {
    
    /**
     * The main method of the program. Prompts the user for input and output file names, opens the input and 
     * output files, reads the input file line by line, adds a comment symbol and a line number to each line,
     * and writes the modified lines to the output file.
     * 
     * @param args command-line arguments (not used)
     * @throws FileNotFoundException if either the input or output file cannot be opened
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // Prompt the user for input and output file names
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();
        
        // Open the input and output files
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);
        
        // Read the input file line by line, add a comment symbol and a line number to each line,
        // and write the modified lines to the output file
        int lineCount = 1;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            out.printf("/* %d */ %s\n", lineCount, line);
            lineCount++;
        }
        
        // Close the input and output files
        in.close();
        out.close();
    }
}
