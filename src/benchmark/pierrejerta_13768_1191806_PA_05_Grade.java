/*
Name: Jerta Pierre
Date: 4th March 2023
Assignment: PA 05 - CS213 Module 04 Assignment 05
 */

import java.util.Scanner;

public class PA_05_Grade {
    public static void main(String[] args){
        // Variable to hold the grade
        Character grade;

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Get the grade from the user
        System.out.println("Enter a letter grade:");
        grade = sc.next(".").charAt(0);
        
        // Check the grade
        if(grade.equals('A')){
            System.out.printf("The numeric value of the letter grade %c is 4\n", grade);
        }else if(grade.equals('B')){
            System.out.printf("The numeric value of the letter grade %c is 3\n", grade);
        }else if(grade.equals('C')){
            System.out.printf("The numeric value of the letter grade %c is 2\n", grade);
        }else if(grade.equals('D')){
            System.out.printf("The numeric value of the letter grade %c is 1\n", grade);
        }else if(grade.equals('F')){
            System.out.printf("The numeric value of the letter grade %c is 0\n", grade);
        }
    }
}
