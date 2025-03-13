/**
 * Class (CS 123, PA 14) This program reads a text file and outputs the lines with numbers before them.
 * @author Bonny Vigil
 * @date 5/4/2023
 */

 import java.util.Scanner;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.PrintWriter;
 
 public class OutputNumberedLineFile
 {
     
     /**
      * This method reads the file and outputs the lines with numbers before them.
      * @param fileName the name of the file being used 
      *@param newFileName the name of the new file that will be written in the write method
      * @throws FileNotFoundException if no file is found
      */
     public static void read(String fileName, String newFileName) throws FileNotFoundException
     {
         Scanner in = new Scanner(new File(fileName)); //takes in the lines from the file
         int counter = 1; //counter for the line number in the output in the file
        
         String newName = newFileName;
         while(in.hasNextLine()) //while loop that reads as long as there is a line in the file
         {
            String line = in.nextLine(); //initializes 'line' as the next line
            String message = ("/* " + counter + " */ " + line); // 'message' is what goes in the file
            counter++; //counter for the numbers before the lines
            write(message, newName); //calls the write method to write the message in the file
         }
         
     } 
 
    /**
     * This method writes the message into the file.
     * @param newName this is the file name
     * @param line this is the message
     * @throws FileNotFoundException if no file is found
     */
    public static void write(String line, String newName) throws FileNotFoundException
    {   
        PrintWriter out = new PrintWriter(new FileOutputStream(new File(newName + ".txt"), true)); //write the file
        out.printf("%s\n", line); //prints the message into the file
        out.close(); //closes the file
    }

     /**
      * Main Method
      * @param args user inputs the file name, calls the read method
      */
     public static void main(String[] args) throws FileNotFoundException
     {
         System.out.println("Enter the current file name: "); //asks for file name
         Scanner in = new Scanner(System.in); //takes in file name
         String name = in.nextLine(); //initializes the name
        
         System.out.println("Enter the new file name: "); //asks for the new file name
         in = new Scanner(System.in); //takes new file name
         String newName = in.next(); //initializes the new file name

         read(name, newName); //calls the read method
        
     }
 }