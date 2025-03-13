import  java.util.Scanner;
/*Lwesso Mukeni
 * October 31, 2023
 * PA 05
 */

public class Vowel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine().toLowerCase();

        int vowelCount = 0;

        for (char currentChar : word.toCharArray()) {
            //checks if the current char is a vowel
            if ("aeiouy".indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        System.out.println("The Number of vowels in" + word + "is"+ vowelCount);
    }
}