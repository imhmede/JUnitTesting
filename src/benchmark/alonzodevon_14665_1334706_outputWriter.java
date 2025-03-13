/**This program prompts the user to enter an input file and then prompts the user for an output file to write the contents
 * into the output file with numbers assigned to each line
 * @author Devon Alonzo
 * @2023-05-05 12:49:22
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
public class outputWriter
{
    /**This method writes the contents of the input file in a new file and then adds the counters of the lines
     * @param   counter the number of lines
     * @param   fileName    The name of the output file
     * @param   line    the line of the input file to written on the new output file
      */
    public static void write(int counter, String fileName, String line) throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter(new FileOutputStream(new File(pathName), true));
        out.printf(counter + " %s\n", line);
        out.close();
    }
    /**This method reads a text file and call another method to write to a file and add numbers to the lines
     * @param   inputFile    the name of a text file that is going to be inputed
     * @param   outputFile   the name of a text file that is going to be outputed with the contents of the input file
     */
    public static void read(String inputFile, String outputFile) throws FileNotFoundException
    {
        int i = 1;
        Scanner in = new Scanner(new File(inputFile));
        while(in.hasNextLine())
        {
            write(i, outputFile, in.nextLine());
            i++;
        }
        in.close();
    }
    /**This is the main method
     * @param   args    A list of command line arguments
     */
    public static void main(String[]args) throws FileNotFoundException
    {
        System.out.println("Enter the input file name: ");
        Scanner in = new Scanner(System.in);
        String inputFileName = in.nextLine();
        System.out.println("Enter the output file name: ");
        String outputFileName = in.nextLine();
        read(inputFileName, outputFileName);
        in.close();
    }
}