/**
 * This program takes input from a user and then reads a file in that local directory by
 * that name, and then reads each line and sends it to a outputfile; with an already given name, and
 *  this new file has lines where the lines are numbered at the beginning.
 * @author Daniel Sanchez
 * @version 1
 * Assignment PA14 lineCounter
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lineCounter {
    /**This is the main function it takes a input from the user, reads a file, sends the output to a file with
     * numbers on each respective line at thier beginning. 
     * @param input, inputFile, outputFile, fileInput, fileOutput count, line
     * @exception "file not found" @throws FileNotfoundException display error if file not found.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFile = input.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFile = input.nextLine();
        input.close();

        try {
            Scanner fileInput = new Scanner(new File(inputFile));
            PrintWriter fileOutput = new PrintWriter(outputFile);
            int count = 1;

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String modifiedLine = "/* " + count + " */ " + line;
                fileOutput.println(modifiedLine);
                count++;
            }

            fileInput.close();
            fileOutput.close();
            System.out.println("Done.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}