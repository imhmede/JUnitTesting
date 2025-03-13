/*
Joaquin Campos
03-09-2023
Prgraomming Assignment 07
*/
import java.util.Scanner; // Imports Scanner from java.util
public class VowelCounter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Defines Scanner in
		
		System.out.print("Enter a word: ");
		String word = in.nextLine().toUpperCase(); // Awaits input
		
		int letters = word.length(); // Takes the length of the word
		int vowels = 0; // Sets initial value
		
		for (int i = 0; i < letters; i++) { // Creates a for loop that lasts for the length of the word
		    
		    if ((word.charAt(i) == 'A') || (word.charAt(i) == 'E') || (word.charAt(i) == 'I') ||
		    (word.charAt(i) == 'O') || (word.charAt(i) == 'U') || (word.charAt(i) == 'Y')) {
		        
		        vowels++; // For each letter, if it is a vowel, add 1 to the vowel counter
		    }
		}
		
		System.out.printf("The number of vowels in %s is %d", word, vowels); // Spits out the final value
	}
}
