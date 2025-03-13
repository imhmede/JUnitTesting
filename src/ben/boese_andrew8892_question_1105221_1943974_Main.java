/**
 Quiz 4
 Andrew Boese
 CS 123
 Essa Imhmed
 */
// Imported functions
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Function declaration
        String string, reverse="";

        // Prompts the user to enter a string
        System.out.println("Enter a string to be reversed");

        // Input
        Scanner input = new Scanner(System.in);
        string = input.nextLine();

        // Function reverseString
        char reverseString;

        // The logic for reverseString
        for (int i=0; i<string.length(); i++) {
            reverseString = string.charAt(i);
            reverse = reverseString + reverse;
        }
        // prints the results
        System.out.println("The revers of :"+string + ": is :" + reverse + ":");
    }
}
