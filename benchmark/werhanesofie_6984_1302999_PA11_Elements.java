/**
 * PA11: initializes an array of ten random integers, then prints a line containing every element at an even index, every even element, all the 
 * elements in reverse order, and a line containing only the first and last element.
 * @author  Werhane
 * @date    2023.04.19
 */

//imports Random so that it may be used to generate random elements for the array later
import java.util.Random;

public class PA11_Elements
{
    /**
     * The main method.
     * @param args  A series of command-line arguments.
     */
    public static void main(String[] args)
    {
        //initializes an array of length 10
        int[] randomArray = new int[10];

        //fills the array with random integers
        Random random = new Random();
        for(int i = 0; i < 10; i++)
        {
            randomArray[i] = random.nextInt(100); //bounded at 100 since that's what you seem to have done based on the expected output
        }

        //prints the array containing the random numbers
        System.out.println("Elements of the array:");
        for(int i = 0; i < 10; i++)
        {
            System.out.printf("\t%d", randomArray[i]);
        }

        //prints the elements at even indicies
        System.out.printf("\n%s\n", "Elements at an even index (and at index 0):");
        for(int i = 0; i < 10; i++)
        {
            if(i%2 == 0)
            {
                System.out.printf("\t%d", randomArray[i]);
            }
        }

        //prints the even elements of the matrix
        System.out.printf("\n%s\n", "Even elements:");
        for(int i = 0; i < 10; i++)
        {
            if(randomArray[i]%2 == 0)
            {
                System.out.printf("\t%d", randomArray[i]);
            }
        }

        //prints the elements of the matrix in reverse order
        System.out.printf("\n%s\n", "All elements in reverse order:");
        for(int i = 9; i >= 0; i--)
        {
            System.out.printf("\t%d", randomArray[i]);
        }

        //prints the first and last element
        System.out.printf("\n%s\n\t[%d, %d]", "[First Element, Last Element]:", randomArray[0], randomArray[9]);
    }
}