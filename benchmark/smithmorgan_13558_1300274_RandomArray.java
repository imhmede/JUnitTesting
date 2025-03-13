/**
CS123 PA 11
@author Morgan Smith
@date 04-20-2023
 */

import java.util.Random;

public class RandomArray
{
/**
 * This is the main method
 * @param args A list of command line arguments
 */
    public static void main(String[] args) 
    {
        Random elements = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = elements.nextInt(100);
            System.out.printf(array[i] + " ");
        }
        System.out.println("");
        System.out.print("The elements positioned at an even index are: ");
        for (int i = 0; i < array.length; i += 2) //the counter has been changed to increment only through even positions in the array
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.print("The even elements are: ");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)// tests if the value in the array is even and prints it if it is
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("The elements in reverse order: ");
        for(int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("[First Element, Last Element]: " + "[" + array[0] + "," + array[array.length - 1] + "]");
    }
}