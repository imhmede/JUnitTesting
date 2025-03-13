import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * This program computes the average for the rows and columns of a 2-column of floating point numbers in a file the user provides
 */
public class PA13_FileAverage {

    /**
     * This method calculates the average of each row in a given text file
     * @param fileName         A text file the user provides
     * @throws FileNotFoundException
     */
    public static void rowAvg(File fileName) throws FileNotFoundException
    {
        Scanner in= new Scanner(fileName);
        int i = 1;
        //the main while loop iterates through all of the file's lines
        while (in.hasNextLine())
        {
            //sum is used to hold the sum of the values in the current row
            double sum = 0;
            //numbers is the value of elements in the current row
            double numbers = 0;

            String row = in.nextLine();
            Scanner rowScanner = new Scanner(row);
            //the nested while loop iterates for the current line's elements
            while(rowScanner.hasNextDouble()){
                sum += rowScanner.nextDouble();
                numbers++;
            }
            System.out.printf("Row " + i + " average:\t\t" + "%.3f\n", sum/numbers);
            i++;
            rowScanner.close();
        }
        in.close();
    }

    /**
     * This method calculates the average of each of the two columns of a file.
     * @param fileName      A file the user provides
     * @throws FileNotFoundException
     */
    public static void columnAvg(File fileName) throws FileNotFoundException
    {
        //I attempted to create a 2D array to hold the values for of more than two columns, but I could not figure how without prompting the user for the parameters of the array
        Scanner in = new Scanner(fileName);
        //The number of columns expected is 2, so there will only be two sums
        double colSum1=0;
        double colSum2=0;
        //numbers is the number of lines and will be used to find the average
        int numbers = 0;

        //for each line in the file, the loop will alternate between adding the next element to colSum1 and colSum2
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            colSum1+= lineScanner.nextDouble();
            colSum2+= lineScanner.nextDouble();
            numbers++;
            lineScanner.close();
        }
        System.out.printf("Column 1 average:\t" + "%.3f\n", colSum1/numbers);
        System.out.printf("Column 2 average:\t" + "%.3f\n", colSum2/numbers);
        in.close();
        
    }

    /**
     * This is the main method
     * @param args  a list of command-line arguments
     * @throws FileNotFoundException
     */
     public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the name of the file: ");
        //creates a string of the file name and uses it to create a File variable
        String pathName = in.next();
        File file = new File(pathName);
        //calls and separates the methods rowAvg and colAvg, separating the results
        System.out.println("~~~~~~~~~~~~~~~");
        rowAvg(file);
        System.out.println("~~~~~~~~~~~~~~~");
        columnAvg(file);
    }
}
