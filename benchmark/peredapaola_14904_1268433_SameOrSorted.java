 /*
  * This program takes numbers and compares them
  * @author Paola Pereda
  * 2023-04-03
  */

import java.util.Scanner;

public class SameOrSorted
{
    /**
     * This method takes x, y, z and compares them if they are all the same 
     * @param x     a boolean
     * @param y     a boolean
     * @param z     a booleam
     * @return same     if they are all the same 
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        return x == y && y ==z;
        

    }

    /**
     * This method takes x,y,z and compares them if they are all different
     * @param x     a boolean
     * @param y     a boolean
     * @param z     a boolean
     * @return different    if they are different 
     */
    public static boolean allDiffferent(double x, double y, double z)
    {
        return x!=y && x!=z && y!=z;

    }

    /**
     * This method takes x,y,z and compares them if they sorted
     * @param x     a boolean
     * @param y     a boolean
     * @param z     a boolean
     * @return sort    if they are sorted 
     */
    public static boolean sorted(double x, double y, double z)
    {
        
        return x <= y && y <= z;

    }


    /**
     * This is the main method
     * @param args      a list of command-line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double x = in.nextDouble();
        System.out.println("Enter the second number:");
        double y = in.nextDouble();
        System.out.println("Enter the third number:");
        double z = in.nextDouble();

        boolean allDiff = allDiffferent(x, y, z);
        boolean allSame = allTheSame(x, y, z);
        boolean allOrder = sorted(x, y, z);
        if(allDiff == true)
        {
            System.out.println("All the numbers are different.");
        }
        if(allSame == true)
        {
            System.out.println("All the numbers are the same.");
        }
        if(allOrder == true)
        {
            System.out.println("All the numbers are sorted.");
        }
       
        

        

    }
}