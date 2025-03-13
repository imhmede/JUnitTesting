/**
@author Morgan Smith
CS123 PA 12
@date 04-24-2023
 */

import java.util.Random;

public class CompareArrays
{
    public static boolean equals(int[] a, int[] b)
    {
        if(a.length == b.length)
        {
             int i = 0;
             while(i < a.length)
            {
                if(a[i] != b[i])
                {
                    return false;
                }
                i++;
            }
            return true;
        }
        else
        {
            return false;
        }
        
    }
    /**
     * This is the main method
     * @param args Contains a list of command line arguments
     */
    public static void main(String[] args)
    {
        Random elements = new Random();
        int length = elements.nextInt(10);
        int[] a = new int[length];
        int[] b = new int[length];
        System.out.println("First array: ");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = elements.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Second array: ");
        for(int i = 0; i < b.length; i++)
        {
            b[i] = elements.nextInt(10);
            System.out.print(b[i] + " ");
        }
        System.out.println();
        if(equals(a,b) == false)
        {
            System.out.println("The arrays do not contain the same elements in the same order.");
        }
        else
        {
            System.out.println("The arrays do have the same elements in the same order.");
        }
    }
}