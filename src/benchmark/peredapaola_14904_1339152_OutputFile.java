/** 
 * This program reads a file containing text and reads each line and sends it to the output file
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class OutputFile
{
    /**
     * This is the main method
     * @param args  a list of command-line arguments 
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Enter the file containing text:");
        Scanner in = new Scanner(System.in);
        String inputFile = in.next();
        System.out.println("Enter the output file:");
        String outputFile = in.next();

        ArrayList<String> text = new ArrayList<String>();
        Scanner in2 = new Scanner(new File(inputFile));
        while(in2.hasNextLine())
        {
            String line = in2.nextLine();
            text.add(line);
        }
        in2.close();

        PrintWriter out = new PrintWriter(new FileOutputStream(new File(outputFile), true), true);
        for(int i = 0; i < text.size(); i++)
        {
            out.println("/* " + (i + 1) + " */ " + text.get(i));
        }
        
        

    }

}