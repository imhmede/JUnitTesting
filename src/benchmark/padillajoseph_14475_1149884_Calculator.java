/**
 *Course: Java1_Assignment3
 * @author Joseph Padilla
 * 17Feb2023
 */

//This program will compute the sum, difference, product and average of two user generated numbers. 

import static java.lang.Math.abs;
import java.util.Scanner;

public class Calculator 
{
    public static Scanner input = new Scanner(System.in);
        
    public static void main(String[] args) 
    {
        int var1; //first user input
        int var2; //second user input
        
        System.out.println("Enter the first number:");
        var1 = input.nextInt();
        System.out.println("Enter the second number:");
        var2 = input.nextInt();
        
        int sum = var1 + var2; //computes the sum
        int diff = abs(var1 - var2); //compute the difference and assumes the smaller number is subtracted from the larger number. 
        int prod = var1 * var2; //computes the product
        double ave = (var1 + var2)/2; //computes the average
        
        System.out.println("The sum of the two numbers is " + sum);
        System.out.println("The difference between the two numbers is " + diff);
        System.out.println("The product of the two numbers is " + prod);
        System.out.printf("The average is %.6f %n",ave);
    }
}