/** Class:  CS123_Computer Science
    Description:  This program will tell if your numbers are in order.
    Author: Jay Mancilla
    Date:10/1/2022
 */

import java.util.Scanner;
public class AscOrder 
{
    public static void main(String[] args)
    {
        //Request number input for all 3 variables
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int x = in.nextInt();

        System.out.print("Enter your second number ");
        int y = in.nextInt();

        System.out.print("Enter your third number ");
        int z = in.nextInt();

        // if statment to tell if numbers are greater or less than
        if(x < y && y < z)
        {
            System.out.println("Numbers are In Order");
        }
        else
        {
            System.out.println("Numbers are NOT In Order");
        }
    
    }
}