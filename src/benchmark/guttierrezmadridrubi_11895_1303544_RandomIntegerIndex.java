/* This program initializes an array with ten random integers and then prints out four lines of output containing
   every element at an even index, every even element, all elements in reverse order, the first and last element
 * @author Rubi Madrid CS123
 * @date 04.21.2023
 */


//imports Random java utility to create random integers in main method
import java.util.Random;


public class RandomIntegerIndex
{

    /*method to print out elements in even index of array
      @param array This is the integer parameter for evenIndex method
      */ 
      public static void evenIndex (int[] array)
    {
        //prints out "Elements at that an even index" and adds a return carriage
        System.out.println("Elements at an even index" + "\r");

        //for loop for i counter
        for(int i = 0; i < 10; i++)
        {
            //if i is divisible by 2 it will print the element at that index
            if (i %2 == 0)
            {
                System.out.printf("%d\t", array[i]);
            }
              
        }
    } 
    
    /*method to print out even elements in array
      @param array This is the integer parameter for evenNumbers method
      */ 
      public static void evenNumbers (int[] array)
    {
        //prints out "Even elements" and adds a carriage return
        System.out.println("Even elements" + "\r");

        //for loop for index position i
        for(int i = 0; i < 10; i++)
        {
            //if the number at index position i is even, it will print that number
            if (array[i] %2 == 0)
            {
                System.out.printf("%d\t", array[i]);
            }
              
        }
    }


    /*method to create to reverse an array by swapping the elements at opposite indexes
      @param array This is the integer parameter for reverseArray method
      */ 
        public static void reverseArray(int[] array)
    {
        //prints out "All elements in reverse order" and adds a carriage return
        System.out.println("All elements in reverse order" + "\r");

        //sets up for loop for every element at index i, divides array length in 2, increments i by 1
        for(int i = 0; i <array.length / 2; i++)
        {
            //copies element at index i into j variable
            int j = array[i];

            //copies variable at opposite index of i and places it in index i
            array[i] = array[array.length - i - 1];

            //copies element from variable j into the opposite index of index i
            array[array.length - i - 1] = j;
        }
    }
        

    /*method to print out first and last elements in array
      @param array This is the integer parameter for firstAndLast method
      */
    public static void firstAndLast(int[] array)
    {
        //prints out "[First Element, Last Element]" and adds a carriage return
        System.out.println("[First Element, Last Element]");
        
        //sets the first element under variable firstElement
        int firstElement = array[0];

        //sets last element under variable lastElement
        int lastElement = array[array.length-1];

        //prints out the first and last elements 
        System.out.print("["+ firstElement +", "+ lastElement + "]");


    }


    /*main method that calls on evenIndex, evenNumbers, reverseArray, and firstAndLast methods
     * @param a series of command-line arguments
     */
    public static void main(String[] args)
    {
        //initializes the type of array and the length of array
        int [] array =  new int[10];

        //calling Random utility
        Random rand = new Random();
        
        //setting limit for creating integers in certain range
        int upperbound = 100; 

        //starts for loop for when i is at the index position (starting at 0 and adding 1 every iteration)
        for(int i = 0; i < 10; i++)
        {
            //sets the array at index position i to have a random number
            array[i] = rand.nextInt(upperbound);
           // System.out.println(array[i]);
            
        }

        //prints out Array with Random Numbers and then inserts a carriage return 
        System.out.println("Array with Random Numbers:"+ "\r");

        //for every number at index i, print out that number
        for(int i =0; i < array.length; i++)
            System.out.printf("%d\t", array[i]);
        
        //prints a carriage return
        System.out.println("\r");

        //calls evenIndex method
        evenIndex(array);

        //prints a carriage return
        System.out.println("\r");

        //calls evenNumbers method
        evenNumbers(array); 

        //prints a carriage return
        System.out.println("\r");

        //calls firstAndLast method
        firstAndLast(array);

        //prints a carriage return
        System.out.println("\r");

        //calls reverseArray method
        reverseArray(array);
            //prints out all elements in reverseArray array
            for(int i =0; i < array.length; i++)
                System.out.printf("%d\t", array[i]);

    }
}
