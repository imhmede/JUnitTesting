/**
 * A program that prints a random array and sorts it
 * Samuel Ortiz
 * 04-21-23
 * CS123
 * */


import java.util.Scanner;
import java.util.Random;

public class RandomArray
{
    /**
     * a method to print all numbers at the even indexes
     * @param randomNumbers the array of random numbers
     * method uses if statement to check for which indexes are even 
     * */
    public static void evenIndex(int[] randomNumbers)
    {
        System.out.print("Elements at an even index: ");
        for (int i = 0; i < randomNumbers.length; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.print(randomNumbers[i] + " ");
                }
            }
            System.out.println();
    }
    /**
     * A method to check which elements are even
     * @param randomNumbers the array of random numbers
     * method uses if statement to check which elements are even
     * */
    public static void evenElement(int[] randomNumbers)
    {
        System.out.print("Even elements: ");
        for (int i = 0; i < randomNumbers.length; i++)
        {
            if (randomNumbers[i] % 2 == 0)
            {
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * A method to reverse the order of the array
     * @param randomNumbers the array of random numbers
     * uses for loop to reverse order
     * */
    public static void reverseOrder(int[] randomNumbers)
    {
        System.out.print("All elements in reverse order: ");
        for (int i = randomNumbers.length - 1; i >= 0; i--)
        {
            System.out.print(randomNumbers[i] + " ");
        }
            System.out.println();
    }
    /**
     * a method to print the first and last elements of the Array
     * @param randomNumbers the array of random numbers
     **/
    public static void firstLast(int[] randomNumbers)
    {
        System.out.print("First element, Last Element: ");
        System.out.print(randomNumbers[0] + " " + randomNumbers[randomNumbers.length - 1]);
        System.out.println();
    }
    /**
     * Main method
     * @param evenIndex, evenElement, reverseOrder, firstLast
     * generates random array and calls other methods to print results
     * */
    public static void main(String[] args)
    {
        Random rand = new Random();
        System.out.print("Array: ");
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = rand.nextInt(100);
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        evenIndex(randomNumbers);
        evenElement(randomNumbers);
        reverseOrder(randomNumbers);
        firstLast(randomNumbers);
    }
}