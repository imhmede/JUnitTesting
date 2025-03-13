import java.util.Random;
/**This program generates two random arrays and tells you if they have the same elements in the same order
 * @author Devon Alonzo
 * @2023-04-24 12:47:41
 */
public class compareArrays
{
    /**This method compares two arrays to see if they have the same elements in the same order
     * @param int[]a    a list of integers
     * @param int[]b    a list of integers
     * @return returning true if the arrays are the same or false if they are not
     */
    public static boolean equals(int[]a, int[]b)
    {
        boolean returnValue = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != b[i])
            {
                return returnValue;
            }
            if(a[i] == b[i] && i == a.length - 1)
            {
                returnValue = true;
            }
        }
        return returnValue;
    }
    /**This method prints the two arrays 
     * @param int[]a    a list of integer values
     * @param int[]b    a list of integer values
    */
    public static void printArrays(int []a, int[]b)
    {
        System.out.println("\nArray 1: ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("\nArray 2: ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
    /**This is the main method
     * @param args  a list of command line arguments
     */
    public static void main(String [] args)
    {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        Random rand = new Random();
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = rand.nextInt(10);
            array2[i] = rand.nextInt(10);
        }
        printArrays(array1, array2);

        if(equals(array1, array2) == true)
        {
            System.out.println("\n\nThe arrays have the same elements in the same order.");
        }
        else
        {
            System.out.println("\n\nThe arrays do not have the same elements in the same order.");
        }
    }
}