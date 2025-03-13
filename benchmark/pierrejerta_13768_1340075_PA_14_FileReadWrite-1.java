/*
 * Java Program reads each line of the input file and sends it to the output file, preceded by line numbers
 * Date: 7th May 2023
 * Name: Jerta Pierre
 */
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PA_14_FileReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        // Read the input filename from the user
        System.out.print("Enter the input file name: ");
        String input_filename=input.nextLine();
        // Read the input filename from the user
        System.out.print("Enter the output file name: ");
        String output_filename=input.nextLine();
        
        // Remove leading and trailing spaces from the filenames
        input_filename = input_filename.trim();
        output_filename = output_filename.trim();
        int i=1;
        try{
            
            BufferedReader bufferedReader = null;
            String curLine;
            
            //Input and Output file objects
            File inputFile = new File(input_filename); 
            File outputFile = new File(output_filename);
            
            // FileReader object for reading from the input file
            FileReader reader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(reader);
            
            // FileWrite object for writing to the output file
            FileWriter output=new FileWriter(outputFile);
            /*Output file will b created at the roor of the project if it does not exist.
            If it exists, it will be overwritten
            */
            
            // Loop over the input file and write to the output file
            while ((curLine = bufferedReader.readLine()) != null){
                output.write("/* "+String.valueOf(i)+" */ "+curLine+"\n");
                i++;
            }
            
            //close the writer object
            output.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

    }
}
