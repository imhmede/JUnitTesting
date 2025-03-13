import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || 
                currentChar == 'o' || currentChar == 'u' || currentChar == 'y') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
