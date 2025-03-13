/**
* This program will reverse a user inputted string
* @author CS123 Anthony Marrs
* November 12, 2023
*/

import java.util.Scanner;

public class StringReversal {

    public static String reverseString(String str) {
        // Base case
        if (str.isEmpty()) {
            return str;
        }
        // Recursive call to reverse the substring from the second character till the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Input validation
        if (input.isEmpty()) {
            System.out.println("Please enter a valid string.");
        } else {
            String reversedString = reverseString(input);
            System.out.println("Reversed string: " + reversedString);
        }

        scanner.close();
    }
}