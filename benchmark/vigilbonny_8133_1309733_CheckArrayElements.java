/**
 * (CS 123, PA_12) This program compares elements of two arrays.
 * @author Bonny Vigil
 * @date 4-22-2023
 */

import java.util.Scanner;
import java.util.Random;

public class CheckArrayElements
{
    /**
     * This is the main method.
     * @param args Imports the length arrays, generates 2 random arrays, orders the array to compare them.  Calls the method to compare the 2 arrays.
     */
    public static void main(String[] args)
    {
        System.out.print("Enter an integer number for the length of the two arrays to be compared: "); //determines the length of the arrays
        System.out.println();
        Scanner in = new Scanner(System.in); //takes in the length
        int LENGTH = in.nextInt(); //sets the length as a number that doesn't change in this code
        int[] randomArray = new int[LENGTH]; //initializes the array
        Random rand = new Random(); //calls on the random import for the array
        int upperBound = 10; //this is the upper bound for the array (the highest number the array can go to)

        System.out.println("This is the first array: ");
        for(int i = 0; i < randomArray.length; i++) //this for loop puts numbers into the array
        {
            randomArray[i] = rand.nextInt(upperBound);
        }
        for(int i=0; i < randomArray.length; i++) // this for loop prints the array
        {
            System.out.print(randomArray[i]+ "\t");
        }

        System.out.println("\nThis is the second array: ");
        int[] randomArray2 = new int[LENGTH]; //initializes the second array

        for(int i = 0; i < randomArray2.length; i++) //fills the second array with random numbers
        {
            randomArray2[i] = rand.nextInt(upperBound);
        }
        for(int i=0; i < randomArray2.length; i++) //prints the second array
        {
            System.out.print(randomArray2[i]+ "\t");
        }


        boolean result = equals(randomArray, randomArray2); //calls the boolean method
        if(result == true) //prints the correct output for the comparison
        {
            System.out.println("\nThe two arrays share at least one element in the same location of the array.");
        }
        else
        {
            System.out.println("\nThe two arrays do not have the same elements in the same order.");
        }
       
    }

    /**
     * This method returns a boolean value for the comparison of the two arrays.
     * @param a the first randomly filled array
     * @param b the second randomly filled array
     * @return returns true if they are the same (same elements, same order) and false if not
     */
    public static boolean equals(int[] a, int[] b) 
    {
        for(int i = 0; i <= a.length - 1; i++) //for loop to compare each element of the arrays
        {
            if(a[i] == b[i])
            {
                return true;
            }
            
        }
        return false;
    }

}