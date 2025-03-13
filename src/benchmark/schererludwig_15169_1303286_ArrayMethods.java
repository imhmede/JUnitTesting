/**
 * this program performs a number of operations on an array of 10 random numbers, selected from 0-100.
 * @author Ludwig Scherer
 * @date 04-19-2023
 */

import java.util.Random;
import java.util.Scanner;

public class ArrayMethods 
{
    /**
     * this method prints the elements located at an even index in form of a new array
     * @param values
     */
    public static void getEvenIndexElements(int[] values)
    {
        int arrayLength = (int) (values.length / 2); // calculates the necessary length of the output array
        int[] evenIndex = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++ ) // gets the element located at ever odd (java) index number and places it in the new array
        {
            evenIndex[i] = values[(2 * i) + 1];
        }
        for(int k = 0; k < evenIndex.length; k++) // prints the result
        {
            System.out.print(evenIndex[k] + "   ");
        }
        System.out.println();
        System.out.println();
    }
    /**
     * this method prints all elements that are even in form of a new array
     * @param values
     */
    public static void getEvenArrayValues(int[] values)
    {
        int arrayLength = 0;
        for(int i = 0; i < values.length; i++)
        {
            if((values[i] % 2) == 0) // this loop calculates the necessary length of the output array
            {
                arrayLength++;
            }
        }
        int[] evenValues = new int[arrayLength];
        int j = 0;
        for(int i = 0; i < values.length; i++) // loop to "look" at every element of the array
        {
            if((values[i] % 2) == 0) // determines if the element is an even or odd number, if it is even the element is placed into the new array
            {
                evenValues[j] = values[i];
                j++;
            }
        }
        for(int k = 0; k < evenValues.length; k++) // prints the result
        {
            System.out.print(evenValues[k] + "  ");
        }
        System.out.println();
        System.out.println();
    }
    /**
     * this method reverses the original array and prints it in form of a new array
     * @param values
     */
    public static void reverseArray(int[] values)
    {
        int[] reversedArray = new int[values.length]; // sets necessary length of the output array
        int i = 0;
        int j = values.length - 1;
        if(values.length == 1) // deals with the case that the array is only a single element
        {
            System.out.println(values[0]);
        }
        else
        {
            while(i <= j) // this loop switches the positions of the elements in the original array and places them into a new one
            {
                reversedArray[i] = values[j];
                reversedArray[j] = values[i];
                i++;
                j--;
            }
            for(int k = 0; k < values.length; k++) // prints the result
            {
                System.out.print(reversedArray[k] + "   ");
            }
        }
        System.out.println();
        System.out.println();
    }
    /**
     * this method prints the first and last element of the original array in form of a new array
     */
    public static void getFirstAndLastElement(int[] values)
    {
        int[] firstAndLast = new int[2];
        firstAndLast[0] = values[0];
        firstAndLast[1] = values[values.length - 1];
        System.out.print("[" + firstAndLast[0] + ", " + firstAndLast[1] + "]"); // prints the result
        System.out.println();
        System.out.println();
    }
    /**
     * the main method, calls upon all the previous methods
     * @param args
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter how big you want the array to be: ");
        int arrayLength = in.nextInt(); // sets the array length to the input number
        Random random = new Random();
        int[] values = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) // this loop generates an array with randomly generated integers
        {
          values[i] = random.nextInt(100);
        }
        System.out.println();
        System.out.println("Array with " + arrayLength + " random numbers from 0-100: ");
        for(int k = 0; k < arrayLength; k++)
        {
            System.out.print(values[k] + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Elements at an even index: ");
        getEvenIndexElements(values);
        System.out.println("Even Elements: ");
        getEvenArrayValues(values);
        System.out.println("All Elements in reverse order: ");
        reverseArray(values);
        System.out.println("[First Element, Last Element]");
        getFirstAndLastElement(values);
        in.close();
    }
}