/**
* This program compares two randomly generated arrays of a size, specified by the user, and prints out whether all elements are equal in position and value, or not.
* @author Ludwig Scherer
* @date 04-24-2023
*/

import java.util.Scanner;
import java.util.Random;
 
public class CompareArrays 
{
    /**
     * this method compares two given arrays and checks whether they are equal at every position or not
     * @param array1
     * @param array2
     * @return
     */  
    public static boolean compare(int[] array1, int[] array2)
    {
        int arrayLength = array1.length;
        int counter = 0;
        while(counter < arrayLength) // this loop goes through one element at a time to compare if they are equal to eachother 
        {
            if(array1[counter] == array2[counter])
            {
                counter++;
            }
            else
            {
                return false;
            }
        }
        return true;
    } 
    /**
     * this is the main method
     * @param args a string of command line arguments
     */    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How long dou you want the two arrays to be? ");
        int arrayLength = in.nextInt();
        Random random = new Random();
        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) // this loop fills both array with random integers ranging between 0-10
        {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
        }
        System.out.println("First Array: "); // prints the first array
        for(int i = 0; i < arrayLength; i++)
        {
            System.out.print(array1[i] + "  ");
        }
        System.out.println();
        System.out.println("Second Array: "); // prints the second array
        for(int i = 0; i < arrayLength; i++)
        {
            System.out.print(array2[i] + "  ");
        }
        System.out.println();
        if(compare(array1, array2))
        {
            System.out.println("Result: The two arrays have the same elements in the same order");
        }
        else
        {
            System.out.println("Result: The two arrays do not have the same elements in the same order");
        }
        in.close();
    }
}
 