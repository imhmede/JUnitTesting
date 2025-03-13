/** This program checks whether two arrays have the same elements in the same order 
 * @author Paola Pereda
 * 2023-04-24
 * PA 12
*/
import java.util.Random;

public class ComparingArray
{
    /**
     * This equals method takes two arrays and compares each element
     * @param a an integer array
     * @param b an integer array
     * @return  returns type boolean type 
     */
    public static boolean equals(int[] a, int[] b)
    {
        if(a[0] == b[0])
        {
            for(int i = 0; i < a.length; i++)
            {
                if(a[i] != b[i])
                {
                    return false;
                }
            }
        }
        else
        {
            System.out.println("The two arrays do not have the same elements in the same order.");
            return false;
        }

        return true;

    }
    /**
     * This is the main method
     * @param args  a line of command-line arguments
     */
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        //array a
        for (int i = 0; i< 10; i++)
        {
            a[i] = rand.nextInt(100);
        }
        System.out.print("First array: " + "\n");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + " " + "\t");
        }
        //array b
        for (int i = 0; i< 10; i++)
        {
            b[i] = rand.nextInt(100);
        }
        System.out.println();
        System.out.print("Second array: " + "\n");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(b[i] + " " + "\t");
        }
        System.out.println();
        equals(a, b);

    }
}