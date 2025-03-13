/*
Joaquin Campos
02-21-2023
Programming Assignment 04
*/
import java.util.Scanner; // Imports Scanner from java.util
public class CS123_PA04 {
public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // Sets up Scanner
        
        System.out.print("Enter the first string: ");
        String input1 = in.nextLine(); // First input
        
        System.out.print("Enter the second string: ");
        String input2 = in.nextLine(); // Second input
        
        // Quick warning: This code is case-sensitive, so "Hello" != "HELLO"
        
        if (input1.equals(input2)) {
            System.out.println("All the same."); // Prints message symbolizing string equality
        }
        
        else {
            System.out.println("Neither."); // Prints message symbolizing string inequality
        }
    }
}