/** 
 * This program reads a file containing two columns of floating-point values and prints the average
 * @author Paola Pereda
 * 2023-05-04
 * PA 13
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileAverage
{
    /**
     * This is the main method
     * @param args  a list command line arguments
     */

     public static double[] average(String fileName) throws FileNotFoundException
     {
        Scanner in = new Scanner(new File(fileName));
        double avg1 = 0;
        double avg2 = 0;
        double len1 = 0;
        double len2 = 0;
        while(in.hasNextDouble())
        {
            int i = 1;
            while(i <= 2 )
            {
                if(i == 1)
                {
                    avg1 = avg1 + Double.valueOf(in.next()); 
                    len1++;
                }
                else
                {
                    avg2 = avg2 + Double.valueOf(in.next());
                    len2++;
                }
                i++;
            }
            

        }
        double[] avgs = {avg1 / len1, avg2 / len2};
        return avgs;
     }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name including the path it is located in:");
        String fileName = in.next();
        double[] avgs = average(fileName);
        for(int i = 0; i < 2; i++)
        {
            System.out.println("This is the average for column " + String.valueOf(i + 1) + " " + String.valueOf(avgs[i]));
        }
    }
}