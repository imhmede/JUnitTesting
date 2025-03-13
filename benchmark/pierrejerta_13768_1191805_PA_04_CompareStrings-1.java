/*
Name: Jerta Pierre
Date: 4th March 2023
Assignment: PA 04 - CS213 Module 04 Assignment 04
 */

import java.util.Scanner;

public class PA_04_CompareStrings {
    public static void main(String[] args){
        // Decalaring variables to hold the two strings
        String str1,str2;

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Get the user inputs
        System.out.println("Enter the first string:");
        str1 = sc.next();
        System.out.println("Enter the second string:");
        str2 = sc.next();
        
        // Compare the two strings
        if(str1.equals(str2)){
            System.out.println("All the same");
        }else{
            System.out.println("neither");
        }
    }
}
