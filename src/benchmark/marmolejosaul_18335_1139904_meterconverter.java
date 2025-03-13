//Saul Marmolejo
//2-13-2023
//Programming Assignment 02

import java.util.*;



public class meterconverter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a measurement in meters:");
        double input = scanner.nextDouble();
        double miles = input/1609;
        double feet = input*3.281;
        double inches = input*39.37;
        System.out.println("The measurement in miles: " + miles);
        System.out.println("The measurement in feet: " + feet);
        System.out.println("The measurement in inches: " + inches);

    }
}