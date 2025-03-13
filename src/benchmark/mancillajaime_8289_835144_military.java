/** Class:  CS123_Computer Science
    Description:  This program will split the current integer
    Author: Jay Mancilla
    Date: 9/17/2022
 */

import java.util.Scanner;

public class military
{
    /**
    This program calculates the time between specific military hour range
     */
    public static void main(String[] args)
    {
    //Get military times
        Scanner in = new Scanner(System.in); 

        System.out.print("Please enter first time in military format: ");
        int firstTime = in.nextInt();
        
        System.out.print("Please enter second time in military format: ");
        int secondTime = in.nextInt();

        
        int firstHour = firstTime / 100;
        int firstMinute = 1;

        
        //IF statment for first 2 numbers in front
        if (firstTime >=  900)
        {
            firstHour -= 2;
        }
           
       
            //IF statment for minutes last 2 numbers
        if (firstTime <=  900) 
        {
            firstMinute = firstTime % 100;
        }
            else 
            { 
            firstMinute = firstTime % 100;
            }
        //Info for 2nd time input
        
        int secondHour = 1;
        int secondMinute = 1;
 //-------------------------------------

        //IF statment for last 2 numbers in front
        if (secondTime <=  900) 
        {
            secondHour = secondTime / 100;
        }
            else 
            { 
            secondHour = secondTime / 100;
            }
        //IF statment for minutes last 2 numbers
        if (secondTime <=  900) 
        {
            secondMinute = secondTime % 100;
        }
        else 
        { 
            secondMinute = secondTime % 100;
        }



        
        //Print out the conversion
        System.out.println((secondHour - firstHour) + "Hours" + " "
        + (secondMinute - firstMinute) +"Min");
    
    }
}