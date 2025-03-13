/**
 * Quiz 4
 * This program reverses a string
 * @author Amadeo Pena
 * 11/12/2023
 */
import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);

    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}