/**
 * Compares to strings and outputs same or neither
 * @author Michael Sanchez
 * October 25, 2023
 */

 import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        /** List of arguments within main method */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string"); //prompts user for first string
        String string1 = in.next(); //assigns input to string1
        System.out.println("Enter the second string"); //Prompts user for second string
        String string2 = in.next(); //assigns input to string2

        if (string1.equalsIgnoreCase(string2)) { //compares values of string1 against string2
            System.out.println("All the same.");
        }
        else {
            System.out.println("Neither.");
        }
    }
}
