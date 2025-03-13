/* This program initializes two arrays with random integer elements and 
  compares them to see if they have the same elements in the same order. 
 * @author Rubi Madrid CS123
 * @date 04.24.2023
 */

 //imports Random java utility to create random integers in main method
import java.util.Random;

public class SameArrays
{
    /*This method calls on the Random java util and fills the array with random integers
     *  @parameters int[] array1, and int[] array2
    */
    public static void fillArray (int[] array1, int[] array2)
    {
        //callls random util
        Random rand = new Random();

        //sets limit for random numbers at 100
        int upperbound = 100;

        //prints out "First Array:"
        System.out.println("First Array:\r");

        //sets up for loop for every element in array1
        for (int i =0; i < array1.length; i++)
        {
            //for every element in array1 at index i assign the next random integer with limit of 100
            array1[i] = rand.nextInt(upperbound);

            //prints out array1 at index i
            System.out.printf("%d\t", array1[i]);
        }
        //prints out "Second Array:"
        System.out.println("\nSecond Array:\r");

        //sets up for loop for every element in array2
        for (int i =0; i < array2.length; i++)
        {
            //for every element in array2 at index i assign the next random integer with limit of 100
            array2[i] = rand.nextInt(upperbound);

            //prints out array2 at index i
            System.out.printf("%d\t", array2[i]);
        }
    }   


    /*This method compares the elements in the first and second array
     *  @parameters int[] array1, and int[] array2
     *  @return true or false value
      */
    public static boolean equals(int[] array1, int[] array2)
    {
        //for every element in array1 at index[i]
        for (int i = 0; i < array1.length; i++)
        {
            //for every element in array2 at  index[j]
            for(int j = 0; j < array2.length; j++)
            {
                //if element in array1 at index[i] is equal to element in array2 at index[2]
                if (array1[i] == array2[j])
                {
                    //return boolean as true
                    return true;
                }
            }
        }
        //else return boolean as false
        return false;
    }

    /*This is the main method
     * @params args a list of command-line arguments
     */
    public static void main(String[] args)
    {
        //initializes the first array with a length of 10 elements
        int [] array1 = new int[10];

        //initializes the second array with a length of 10 elements 
        int [] array2 = new int[10];

        //calls fill array method to create random integers for every element in array
        fillArray(array1, array2);

        //calls equals method to print statements depending on boolean method result
        if (equals(array1, array2) == true)
        {
            System.out.println("The two arrays do have the same elements in the same order");
        } 
        else 
        {
            System.out.println("\nThe two arrays do not have the same elements in the same order");
        }
    
    }
    
}