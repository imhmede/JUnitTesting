import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
//import java.util.*;
/**
 * This program generates an array containing ten random integers, then lists:
 * -the elements at an even position
 * -even elements
 * -the array in reverse order
 * -the first/last elements
 * @author Mercedes Theriault
 * @since 4-15-2023
 */
public class PA11_ArrayElements 
{
    /**
     * This method takes an array of integers and returns an array of its elements at an even position
     * @param list      an array of integers
     * @return          an integer array containing the elements at even positions in the parameter
     */
    public static int[] evenIndex(int[] list)
    {
        //evenList will contain the elements at the even positions (odd indexes) in the parameter
        //uses floor division to determine the exact number of odd indexes
        int[] evenList = new int[Math.floorDiv(list.length, 2)];
        //j is used to hold the index of evenList as the for loop goes through i, the index of the parameter
        int j = 0;
        for(int i=1; i<list.length; i+=2)
        {
            //updates each element of evenList with elements at even positions of the parameter
            evenList[j] = list[i];
            j++;
        }
        return evenList;
    }

    /**
     * This method takes an array of integers and retuens an array containing the even valued elements
     * @param list      an array of integers
     * @return          an integer array containing the even elements of the parameter
     */
    public static int[] evenElements(int[] list)
    {
         //evenVal will contain the even valued elements in the parameter
        int[] evenVal = new int[list.length];
        int j = 0;
        for(int i=0; i<list.length; i++)
        {
            //if the value of list at i is even, it is added to evenVal
            if(list[i]%2 == 0)
            {
                evenVal[j] = list[i];
                j++;
            }
        }
        return evenVal;
    }
    /**
     * This method returns an integer array with the elements of it's parameters' in a reverse order
     * @param list      an array of integers
     * @return          an array of reverse order to the parameter
     */
    public static int[] reverseArray(int[] list)
    {
        int[] revArr = new int[list.length];
        int j = 0;
        //the last item of list is assigned to index 0 of revArray
        //list index is decremented while revArray index is incremented for each iteration
        for(int i = list.length - 1; i >= 0; i--)
        {
            revArr[j] = list[i];
            j++;
        }
        return revArr;
    }

    /**
     * This method returns the first and last values of an array of integers as an array
     * @param list
     * @return
     */
    public static int[] firstLastVal(int[] list)
    {
        //defines firstLast as a 2 integer array containing the first and last value
        int[] firstLast = {list[0], list[list.length - 1]};
        return firstLast;
    }

    /**
     * This is the main method that generates the random array and calls the other methods then prints the results
     * @param args     a list of command-line prompts
     */
    public static void main(String[] args)
    {   
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        //the variable length determines the number of elements in the array
        int length = in.nextInt();
        Random rand = new Random();
        System.out.println(length + " long array with random elements: ");
        //creates a new array with the length inputted by user
        int[] randomArray = new int[length];
        //for loop to assign the elements to a random integer from 1-100, inclusive
        for(int i=0; i<randomArray.length; i++)
        {
            randomArray[i] = rand.nextInt(1,101);
            System.out.print("\t" + randomArray[i]);
        }

        //calls the methods and formats the results
        System.out.println("\nElements at an even index: ");
        for(int i=0; i<evenIndex(randomArray).length; i++)
        {
            System.out.print("\t" + evenIndex(randomArray)[i]);
        }

        System.out.println("\nEven elements: ");
        for(int i=0; i<evenElements(randomArray).length; i++)
        {
            //breaks if an element in evenElements is 0, since it is empty
            if(evenElements(randomArray)[i]==0)
            {
                break;
            }
            System.out.print("\t"+ evenElements(randomArray)[i]);
        }

        System.out.println("\nAll elements in reverse order: ");
        for(int i=0; i<reverseArray(randomArray).length; i++)
        {
            System.out.print("\t"+ reverseArray(randomArray)[i]);
        }

        System.out.println("\nFirst and last elements: \n\t" + Arrays.toString(firstLastVal(randomArray)));
    }
}