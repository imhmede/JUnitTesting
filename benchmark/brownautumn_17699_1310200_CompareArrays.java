import java.util.Random;


public class CompareArrays
{
   
    //Main method, declares the two arrays, and prints out their random numbers using Random variable rand.
    public static void main(String[] arg)
    {
        Random rand = new Random();

        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println("\nFirst Array:");

        for (int i = 0; i < a.length; i++)
        {
            a[i] = rand.nextInt(50);
            if (i > 0)
            {
                System.out.print(" | ");
            }
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSecond array:");

        for (int i = 0; i < b.length; i++)
        {
            b[i] = rand.nextInt(50);
            if (i > 0)
            {
                System.out.print(" | ");
            }
            System.out.print(b[i] +" ");
        }
        //Using conditionals, the following code prints out the whether the method equals has true or false conditions based on the random numbers in the arrays.
        if (equals(a,b) == false)
        {
            System.out.println("\nThe two arrays do not have the same elements in the same order.");
        }
        else
        {
            System.out.print("\nThe two arrays do have the same elements in the same order.");
        }
    }
    //The following method equals contains the arrays a and b, and it determines whether the two arrays are the exact same using booleans.
    public static boolean equals(int[] a, int[] b)
    {
        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }
        return true;
    }
}