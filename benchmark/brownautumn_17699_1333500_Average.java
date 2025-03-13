import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Average
{
    public static void main(String[] args) throws FileNotFoundException
    {
        /* Scanner for the user input named console. */
        Scanner console = new Scanner(System.in);

        /* Asks the user which file they want to use, I used te given file, sample.txt */
        System.out.print("Enter the name of the file including the path where it is located: ");
        String FileName = console.next();

        /* The file the user wants to use is used. */
        File inFile = new File(FileName);
        Scanner in = new Scanner(inFile);

        /*I made variables for each column, and a counter named i for the amount of numbers in each column. */
        double column1 = 0.0;
        double column2 = 0.0;
        int i = 1;

        /*While loop continues through the file. */
        while (in.hasNextDouble())
        {
            if (i % 2 != 0)
            {
                column1 += in.nextDouble();
            }
            else
            {
                column2 += in.nextDouble();
            }

            i++;
        }

        int num = i / 2;

        /* Outputs the average of each column */
        System.out.printf("Average of the first column: %f\n", column1 / num);
        System.out.printf("Average of the second column: %f\n", column2 / num);

        in.close();
        console.close();
    }
}