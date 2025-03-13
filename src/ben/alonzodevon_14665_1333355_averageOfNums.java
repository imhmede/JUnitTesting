/**This program reads a text file of numbers and prints out the average of the two numbers in the same row
 * @author  Devon Alonzo
 * @2023-05-04 18:27:48
 */
import java.util.Scanner;
import java.io.File;
import java.lang.Math;
import java.io.FileNotFoundException;
public class averageOfNums
{
    /**This method computes the average of every two numbers in the array
     * @param   array   a list of numbers
     * @return  the average of every two numbers
     */
    public static double compute(double[] array)
    {
        double scale = Math.pow(10, 2), average, sum = 0;
        int lines = 0;
        for(int i = 0; i < 15; i += 2)
        {
            sum = array[i] + array[i + 1];
            average = sum / 2;
            lines++;
            System.out.println("line " + lines + " average: " + Math.round(average * scale)  / scale);//printing and rounding the average
        }
        return sum;
    }
    /**This method reads a text file inputed by the user as well as fills the array with the text and casts to data type double
     * @param   file    the name of a file given by the user
     */
    public static void read(String file) throws FileNotFoundException
    {
        int i = 0;
        double []array = new double[16];
        Scanner in = new Scanner(new File(file));
        while(in.hasNextLine() && i < array.length)//filling the array and changing each word that is read into a double
        {
            array[i] = Double.parseDouble(in.next());
            i++;
        }
        compute(array);
    }
    /**This is the main method
     * @param   args    a list of command line arguments
     */
    public static void main (String args[]) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = in.nextLine();
        read(fileName);
    }
}