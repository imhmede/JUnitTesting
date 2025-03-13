//Saul Marmolejo
//3-16-2023
//Programming Assignment 04

import java.util.Scanner;

public class stringchecker {
    
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String stringOne = myScanner.next();
        System.out.println("Enter the second string:");
        String stringTwo = myScanner.next();

        if (stringOne.equals(stringTwo)){
            System.out.println("All the same");
        } else {
            System.out.println("neither");
        }

    }
}
