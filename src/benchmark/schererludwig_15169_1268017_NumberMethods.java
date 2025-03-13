/**
 * this program compares three numbers given by the user to eachother and checks if they are all equal, all different and sorted in ascending order
 * @author Ludwig Scherer
 * @date 04-02-2023 
 */

import java.util.Scanner;

public class NumberMethods 
{
    /**
     * this method checks if all numbers are equal
     * @param x double value
     * @param y double value
     * @param z double value
     * @return returning boolean result of check
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        if(x == y && y == z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * this method checks if all numbers are different from each other
     * @param x
     * @param y
     * @param z
     * @return returning boolean result of check
     */
    public static boolean allDifferent(double x, double y, double z)
    {
        if(x != y && y != z && x != z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * this method checks if all numbers are entered in ascending order
     * @param x
     * @param y
     * @param z
     * @return returning boolean result of check
     */
    public static boolean sorted(double x, double y, double z)
    {
        if(x <= y && y <= z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * this is the main method
     * @param args a list of command line arguments
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double x = in.nextDouble();
        System.out.println("Enter the second number");
        double y = in.nextDouble();
        System.out.println("Enter the third number");
        double z = in.nextDouble();
        
        if(allTheSame(x, y, z))
        {
            System.out.println("All of the numbers are equal");
        }
        else if(allDifferent(x, y, z))
        {
            System.out.println("All of the numbers are different");
        }
        else 
        {
            System.out.println("The numbers are neither all equal, nor all different");
        }
        if(sorted(x, y, z))
        {
            System.out.println("The numbers are sorted in ascending order");
        }
        else
        {
            System.out.println("The numbers are not sorted in ascending order");
        }
        in.close();
    } 
}
