/*
Name: Jerta Pierre
Date: 4th March 2023
Assignment: PA 06 - CS213 Module 04 Assignment 06
 */

import java.util.Scanner;

public class PA_06_Temperature {
    public static void main(String[] args){
        // Variable to the temperature reading
        double temp;
        
        // Variable to hold the temperature scale
        Character scale;

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Get the temperature and scale from the user
        System.out.println("Enter the temperature:");
        temp = sc.nextDouble();
        System.out.println("Enter the scale of the temperature:");
        scale = sc.next(".").charAt(0); // Select the first character only incase input is a string 
        
        // If the scale is Fahrenheit, convert temperature to Celsius and set scale to Celcius
        if(scale.equals('F')){
            temp = (5 * (temp - 32) / 9);
            scale = 'C';
        }
        
        // Check the state of water
        if(scale.equals('C')){
            if(temp < 0){
            System.out.println("The water is solid");
            }else if(temp >= 0 && temp <= 100){
                System.out.println("The water is liquid");
            }else if(temp > 100){
                System.out.println("The water is gas");
            }
        }
    }
}
