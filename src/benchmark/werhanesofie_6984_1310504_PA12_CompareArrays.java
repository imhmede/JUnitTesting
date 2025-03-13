/**
 * PA12: This program checks to see if two randomly generated arrays have the same elements in the same order using a method equals(), 
 * then prints the result.
 * @author  Werhane
 * @date    2023.04.24
 */

//imports Random so that it may be used to generate random elements for the arrays later
import java.util.Random;

//establishes the class
public class PA12_CompareArrays
{
    /**
     * The main method.
     * @param args  A series of command-line arguments.
     */
    public static void main(String[] args)
    {
        //initializes two integer arrays with length 10(to match the expected output given)
        int[] array1 = new int[10];     int[] array2 = new int[10];

        //fills both arrays with random integers
        array1 = fillRandomly(array1);  array2 = fillRandomly(array2);

        //prints both arrays
        System.out.printf("%s\n%s\n%s\n%s\n", "First array:", intArrayToString(array1), "Second array:", intArrayToString(array2));

        //determines if both arrays have the same elements in the same order and prints the result
        if(equals(array1, array2))
        {
            System.out.println("The two arrays have the same elements in the same order.");
        }
        else
        {
            System.out.println("The two arrays do not have the same elements in the same order.");
        }
    }

    /**
     * Replaces every element in an array with a random number.
     * @param array The array to be filled.
     * @return      An array with length equal to the array entered where every element is a random number.
     */
    public static int[] fillRandomly(int[] array)
    {
        //creates a random variable that will be used to fill the array
        Random random = new Random();

        //iterates through every index of the array and fills it with a random integer
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10); //bounded from 0 - 9 to match expected output given
        }

        return array;
    }

    /**
     * Converts an integer array to a string.
     * @param array The array to be converted to a string.
     * @return      A string with format "array[0]  array[1]    ... array[n-1]    " where n is the length of the array.
     */
    public static String intArrayToString(int[] array)
    {
        //initializes the string that will hold the elements of the array
        String str = "";

        //iterates through every index in the array and adds the item at that index to str, with a tab afterwards
        for(int i = 0; i < array.length; i++)
        {
            str = str + array[i] + "    ";
        }

        return str;
    }

    /**
     * Determines if two arrays have the same elements in the same order.
     * @param firstArray    Any integer array.
     * @param secondArray   Any other integer array.
     * @return              True if the two arrays have the same elements in the same order, false otherwise.  Returns false if the two arrays are
     *                      of unequal length.
     */
    public static Boolean equals(int[] firstArray, int[] secondArray)
    {
        //checks to see if the two arrays have the same length
        if(firstArray.length == secondArray.length)
        {
            //cycles through all elements of the arrays
            for(int i = 0; i < firstArray.length; i++)
            {
                //compares the element at index i in both arrays, returns false if they are not equal
                if(firstArray[i] != secondArray[i])
                {
                    return false;
                }
            }
            
            //returns true if all the elements of the array are equal (if false has not yet been returned)
            return true;
        }

        //returns false if the two arrays do not have the same length.
        else
        {
            return false;
        }
    }
}