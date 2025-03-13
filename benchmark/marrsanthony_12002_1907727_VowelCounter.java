/**
* This program finds the number of vowels in any word
* @author CS123 Anthony Marrs
* Oct 31, 2023
*/
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert the word to lowercase for case insensitivity

        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
                vowelCount++;
            }
        }

        System.out.println("The number of vowels in " + word + " is " + vowelCount);
    }
}