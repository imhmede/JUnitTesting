//Saul Marmolejo
//2-20-2023
//Programming Assignment 3

import java.util.*;


public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double first = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double second = scanner.nextDouble();
        int addition = (int)first + (int)second;

        System.out.println("The sum of the two numbers is " + addition);
        if (second > first){
            int difference = (int)second - (int)first;
        } else {
            int difference = (int)first - (int)second;
        }
        int difference = (int)second - (int)first;
        System.out.println("The difference between the two numbers is " + difference);
        int product = (int)first*(int)second;
        System.out.println("The product of the two numbers is " + product);
        double average = (first + second)/2;
        System.out.println("The average is " + average);

    }
}