/*
 * This program reads a file containing text and outputs it with numbers preceding the text.
 * @author Rubi Madrid CS123
 * @date 05.07.2023
 */

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 import java.util.Scanner; 


 public class InputOutputLines
 {
    /*
     * This is the main method 
     * @param a series of command-line arguments
     */
    public static void main (String[] args)
    {
        //Sets up new Scanner
        Scanner input = new Scanner(System.in);

        //prompts user for name of file to read
        System.out.println("Enter the file name of reading file:");

        //Sets the file name as fileNameInput
        String fileNameInput = input.next();

        //prompts user for the name of file to write
        System.out.println("Enter the file name of writing file:");

        //Sets the file name as fileNameOutput
        String fileNameOutput = input.next();

        //closes scanner
        input.close();

        //finds the file to read from
        File fileInput = new File(fileNameInput);
        
        //makes scanner input null
        Scanner in = null;
        
        //finds the file to write to
        File fileOutput = new File(fileNameOutput);
        
        //makes printwriter null
        PrintWriter out = null;

        //try catch statement if file is not found
        try
        {
            //sets scanner to fileInput
            in = new Scanner(fileInput);

            //sets printwriter to fileOutput
            out= new PrintWriter(fileOutput);   
        }
         catch (FileNotFoundException e1) 
         {
            // prints out message for user if file is not found
            System.out.println("The file is not found!");
         }

         //sets line numbers, starting at 1
         int lineNumber = 1;

         //while the input has another line, 
         while (in.hasNextLine())
         {
            //saves next line in string variable line
            String line = in.nextLine();

            //writes out to the output txt file with line number and /*  */ 
            out.write(String.format("/* %d */ %s\n", lineNumber, line));

            //increments lineNumber
            lineNumber++;
         }

         //closes output 
         out.close();

         //closes input
         in.close();

    }
 }