//Jacob Rogers
//CS123P
//March 24, 2023
//PA_07

import java.util.Scanner;

public class VowelCounter {
   public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter a word:");
		   String word = input.nextLine().toLowerCase(); 
		   
		   int vowelCount = 0;
		   for (int i = 0; i < word.length(); i++) {
		       char ch = word.charAt(i);
		       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
		           vowelCount++;
		       }
		   }
		   
		   System.out.println("The number of vowels in " + word + " is " + vowelCount);
	}
   }
}
