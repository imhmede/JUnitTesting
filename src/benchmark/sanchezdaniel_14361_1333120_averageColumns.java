/**
 * This program takes a input and then opens a file in a directory; similar to the 
 * location of the program being used, and then outputs the averge of the columns in
 * the .txt file provided which contains floating point numbers.
 * @author Daniel Sanchez
 * @version 1
 * Assignment PA13 averageColumns
 */
import java.io.*; //import io*
import java.util.Scanner; //import scanner

public class averageColumns { //class
    /**
     * This is the main method it takes input for a file name then opens the file
     * at the respective local directory and reads each line of the txt and then parses
     * two columns while keeping a running total of each column and then it finally calculates
     * a average and displays it.
     * @param variables sum1(column1 sum), sum2(column2 sum) take converted data and sum up a total
     * @param variable count the lines (for average)
     * @param variables avg1, avg2 both calculate averages for thier respective columns
     * @param Scanner object input and File object file created 
     * @param array String columns created with a " " delimiter
     * @exception "file not found" @throws FileNotFoundException displays error if file not found
     */
    public static void main(String[] args){ // main method
        Scanner input = new Scanner(System.in); // created scanner object
        System.out.print("Enter the file name: "); //display for input
        String fileName = input.nextLine(); //read user input
        try // try statment
        {
            File file = new File(fileName); // intialize file object pathway fileName
            Scanner fileInput = new Scanner(file); //scanner object reads contents of file
            double sum1 = 0, sum2 = 0; //variables sum1 and sum2 declared and intialized
            int count = 0; // variable count declared and intialized
            while (fileInput.hasNextLine()) // while loop goes through each line of the file
            { 
                String line = fileInput.nextLine(); // reads line of text from file
                String[] columns = line.split(" "); //array of strings with " " delimitar

                if (columns.length == 2) //if boolean; parse columns and add running totals for the values in the columns, and count ++ for average later
                {  
                    double column1 = Double.parseDouble(columns[0]); //converting
                    double column2 = Double.parseDouble(columns[1]); //converting
                    sum1 += column1; //adding to value
                    sum2 += column2; //adding to value
                    count++; 
                }
            }
            double avg1 = sum1 / count; //avg1 calculates average for  column 1
            double avg2 = sum2 / count; //avg2 calculates average for  column 2
            System.out.println("Average of column 1: " + avg1); //display average of column 1
            System.out.println("Average of column 2: " + avg2); //display average of column 2
            fileInput.close(); //closing file input
        } catch (FileNotFoundException e) { // catch statement incase wrong file name entered
            System.out.println("File not found: " + fileName); // display error if file not found with incorrect file name
        }
        input.close(); //closing scanner object
    }
}