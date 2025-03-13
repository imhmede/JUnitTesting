import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in);
        /*Ask the user for input and output file names, and make them into variables */
        System.out.print("Enter name of the text file: ");
        String inFileName = console.next();
        System.out.print("Enter the name of the output file: ");
        String outFileName = console.next();

        /*Make new file and printwriter using the user-input variable names */
        File inFile = new File(inFileName);
        Scanner in = new Scanner(inFile);

        PrintWriter out = new PrintWriter(outFileName);

        /*Create a counter for the line count */
        int count = 1;

        /*While loop loops through each line of the input file and adds a line count to it */
        /*Loop prints each line with the line count */
        while(in.hasNextLine())
        {   
            String name = in.nextLine();
            System.out.println("/*" + count + "*/ " + name);
            count++;
        }
        /*Close all scanners and printwriters!! */
        console.close();
        in.close();
        out.close();
    }
}