/**
This program reads a text file
@author Morgan Smith
@date 05/02/2023
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

 public class InputFile
 {
    /**
     * This program writes to a text file
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
     */

    public static String read(String pathName) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(pathName));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while(in.hasNextLine())
        {
            String line = in.nextLine();
            System.out.println(" /* " + i + " */ " + line);
            sb.append(System.lineSeparator());
            i++;
        }
        in.close();
        return sb.toString();
    }
    /**
     * This is the main method
     * @param args A list of command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Enter the file name and the path where it is found: ");
        Scanner in = new Scanner(System.in);
        String pathname = in.nextLine();
        System.out.println(read(pathname));
    }
 }