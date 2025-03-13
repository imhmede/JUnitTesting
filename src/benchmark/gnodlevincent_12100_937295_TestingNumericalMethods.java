/*
Author: Vince Gnodle
Class: CS123
Date: 10/30/2022
Purpose: Lab 5_a
Description: testing various methods with numerical arguments
*/

import java.util.Scanner;

public class TestingNumericalMethods
{
    /**
    Compares the value of three different arguments.
    @param x is the first variable.
    @param y is the second variable.
    @param z is the third variable.
    @return boolean value true if the three variables are equal. Boolean value false otherwise. 
    */ 
    public static boolean allTheSame(double x, double y, double z){
        if (x == y && x == z){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    
    /**
    Computes the average value of three different arguments.
    @param x is the first variable.
    @param y is the second variable.
    @param z is the third variable.
    @return the average. 
    */
    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
    }
    
    
    /**
    Determines the argument with the smallest value.
    @param x is the first variable.
    @param y is the second variable.
    @param z is the third variable.
    @return the argument with the smallest value. 
    */
    public static double theSmallest(double x, double y, double z){
        double smallest = x;
        if (y < smallest){
            smallest = y;
        }
        if (z < smallest){
            smallest = z;
        }
        return smallest;
    }
    
    
    /**
    Determines if the arguments were entered in order (smallest value first).
    @param x is the first variable.
    @param y is the second variable.
    @param z is the third variable.
    @return true if arguments are in order. False if they are not. 
    */
    public static boolean sorted(double x, double y, double z){
        if (x < y && y < z){
            return true;
        }
        else{
            return false;
        }
    }
   
	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    System.out.println("Enter in three numbers: ");
	    
	    double x = in.nextDouble();
	    double y = in.nextDouble();
	    double z = in.nextDouble();
	    
	    //calls and prints the return value of 'allTheSame' method with arguments hard coded
		System.out.println("The arguments are all the same: This is " + allTheSame(x, y, z));
		
		//calls and prints the return value of 'average' method with arguments hard coded
		System.out.println("The average of the 3 arguments is " + average(x, y, z));
		
		//calls and prints the return value of 'smallest' method with arguments hard coded
		System.out.println("The smallest argument is " + theSmallest(x, y, z));
		
		//calls and prints the return value of 'sorted' method with arguments hard coded
		System.out.println("The arguments were entered in order: This is " + sorted(x, y, z));
	}
}
