import java.util.Random;
/**
 * This program generates two arrays of the same length with random integer values, then checks if they contain the same elements in the same order
 * @author Mercedes Theriault
 * @since 4-23-2023
 */
public class PA12_CompareArrays {
    /**
     * This method compares the values of two arrays and returns true if the elements are equal and in the same order
     * @param a     an integer array
     * @param b     an integer array
     * @return      boolean, true if the parameters are equal in values and order
     */
    public static boolean equals(int[]a, int[]b)
    {
        boolean isEqual = false;
        //this loop iterates for all the indexes in the arrays and compares their values
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == b[i])
            {
                isEqual = true;
            }
            //if the two elements are not equal, isEqual is set to false and the for loop terminates
            else
            {
                isEqual = false;
                break;
            }
        }
        //isEqual will only be true if all values of a and b are equal at the same index
        return isEqual;
    }

    /**
     * This is the main method that generates and prints two integer arrays with random elements, then prints a statement in accordance to the results of the method equals.
     * @param args      a list of command-line prompts
     */
    public static void main(String[] args)
    {
        //Random initialization to generate random integers for the arrays
        Random rand = new Random();
        //creates two arrays with length 10
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];

        //for the respective arrays, each index is assigned a random integer value from 0-9 and is printed
        System.out.println("First Array:\n\t");
        for(int i = 0; i < firstArr.length; i++)
        {
            firstArr[i] = rand.nextInt(10);
            System.out.print(firstArr[i] + "\t");
        }

        System.out.println("\nSecond Array:\n\t");
        for(int i = 0; i < secondArr.length; i++)
        {
            secondArr[i] = rand.nextInt(10);
            System.out.print(secondArr[i] + "\t");
        }

        //prints a statement reflective of the results of equals(firstArr, secondArr)
        if(equals(firstArr, secondArr))
        {
            System.out.println("\nThe two arrays have the same elements in the same order.");
        }
        else
        {
            System.out.println("\nThe two arrays do not have the same elements in the same order.");
        }
    }
}
