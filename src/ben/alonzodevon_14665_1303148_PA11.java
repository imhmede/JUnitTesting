/**This program creates 10 random integers and tells you the elements that are ane even index, the even elements,
 * all the elements in reverse order, and the first and last elements
 * @author Devon Alonzo
 * @2023-04-21 19:18:19
 */
public class Arrayrandom
{
    /**This method prints the first and last element of an array
     * @param array     An array, a list of items
     */
    public static void firstAndLast(int array[])
    {
        System.out.print("\n \nFirst and last elements: ");
        System.out.print(array[0] + ", " + array[array.length - 1]);
    }
     /**This method prints the whole array in reverse order
     * @param array     An array, a list of items
     */
    public static void reverse(int array[])
    {
        System.out.print("\n \nAll elements in reverse order: ");
        for(int i = array.length - 1; i > -1; i--)
        {
            System.out.print(array[i] + " ");
        }
    }
     /**This method prints every even element in an array
     * @param array     An array, a list of items
     */
    public static void evenElement(int array[])
    {
        System.out.print("\n \nEvery even element: ");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0 && array[i] != 0)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
     /**This method prints every element in an array that has an even index to the user
     * @param array     An array, a list of items
     */
    public static void evenIndex(int array[])
    {
        System.out.print("\n \nElements at even index: ");
        for(int i = 1; i < array.length; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
    /**This is the main method
     * @param args  a list of command line arguments
     */
    public static void main(String[] args)
    {
        int []array = new int[10];
        System.out.print("Array with random Numbers: ");
        for(int i = 0; i < array.length; i++) // for loop to fill an array with 10 random integers
        {
            double randomNum = Math.random() * 100;
            array[i] = (int)randomNum;
        }
        for(int i = 0; i < array.length; i++)// second for loop to print array
        {
            System.out.print(array[i] + " ");
        }
        evenIndex(array);
        evenElement(array);
        reverse(array);
        firstAndLast(array);
    }
}