/*
Joaquin Campos
03-28-2023
Programming Assignment 10
*/
import java.util.Scanner; // Imports Scanner from java.util
public class Reverse {
    
    public static String reverse(String str) { // Defines function reverse
        
        int len = str.length(); // Takes length
        String reverseStr = ""; // Initializes reverseStr
        
        for (int i = 1; i <= len; i++) { // Increment i from 1 to the string length
            reverseStr += str.charAt(len - i); // Adds the character that is i characters away from the end
        }
        
        return reverseStr; // Returns the final reversed string
    }
    
    public static void main(String[] args) { // To test out the reverse function
        Scanner in = new Scanner(System.in); // Defines Scanner in
        
        System.out.print("Enter the string to reverse: ");
        String str = in.nextLine(); // Awaits input
        System.out.print(reverse(str)); // Prints the reversed string
    }
}
