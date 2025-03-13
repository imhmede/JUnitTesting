/**
 * (CS 123, PA_11) This program imports 10 random integer numbers from a user and outputs information about the array.
 * @author Bonny Vigil
 * @date 04/20/2023
 */

import java.util.Scanner;

public class ArrayPrinting
{
    /**
     * This is the main method 
     * @param args Imports the array and calls methods to analyze the array.
     */
    public static void main(String[] args)
    {
        final int LENGTH = 10; // Establishes the length of the array
        int[] importedNumbers = new int[10]; //Initializes the array
        
        int currentSize = 0; //Creates a variable to keep track of the size of the array
        Scanner in = new Scanner(System.in);
        System.out.println("Type an integer number and press 'Enter'.  Repeat 10 times: "); //Asks for user to import numbers
        for (int i = 0; i<= LENGTH; i++) //For loop to create the array from the imported numbers
        {
            if (currentSize < importedNumbers.length) //If statement to keep the array the correct length and to import the numbers
            {
                importedNumbers[currentSize] = in.nextInt();
                currentSize++;
            }
        }
        System.out.println("Array with user-imported numbers:"); //Prints the user's numbers as an array
        for (int i = 0; i < currentSize; i++)
        {
            System.out.printf("%5d", importedNumbers[i]);
        }

        System.out.println("\nElements at an even index:"); //Prints the heading for the even index array
        evenIndex(importedNumbers); //calls the evenIndex method

        System.out.println("\nEven elements:"); //Prints the heading for the even elements array
        evenNumbers(importedNumbers); //calls the evenNumbers method

        System.out.println("\nAll elements in reverse order:"); //Prints the heading for the reverse order array
        reverseOrder(importedNumbers); //calls the reverseNumber method

        System.out.println("\n[First Element, Last Element]"); //Prints the heading for the first and last element
        firstLast(importedNumbers); //calls the firstLast method
    }
   
    /**
     * This method prints an array made up of only the numbers at even indexes in the initial array (from the main method)
     * @param array an array of integer numbers
     */
    public static void evenIndex(int[] array) 
    {
        for (int i = 1; i < array.length; i = i+2)
        {
            System.out.printf("%5d", array[i]);
        }
    }

    /**
     * This method prints an array made up of only the even numbers in the initial array (from the main method)
     * @param array an array of integer numbers
     */
    public static void evenNumbers(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]%2==0)
            {
                System.out.printf("%5d", array[i]);
            }
            
        }
    }

    /**
     * This method prints an array made up of the integers in the initial array (from the main method) in reverse order
     * @param array an array of integer numbers
     */
    public static void reverseOrder(int[] array)
    {
        for(int i = (array.length - 1); i >=0; i--)
        {
                System.out.printf("%5d", array[i]);
        }
    }

    /**
     * This method prints the first and last numbers in the initial array (from the main method)
     * @param array integer numbers that are taken from an array
     */
    public static void firstLast(int[] array)
    {
        System.out.print("[" + array[0] + ", " + array[array.length-1] + "]\n");
    }
}