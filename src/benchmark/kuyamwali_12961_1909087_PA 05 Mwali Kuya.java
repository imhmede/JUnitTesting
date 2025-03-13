
    
    /** 
     * This program finds the vowels in a given word
     * @author Mwali Kuya
     * 31st October 2023
     */

public class vowel


    import java.util.Scanner;
/*
*this method finds the vowels in a given word or name
*@param args a list of possible arguements passed by the user
*
 */
public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");// prompt user for a word
        String word = scanner.nextLine().toLowerCase(); // make input to lowercase
//use for loop and number declarations
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("aeiouy".indexOf(ch) != -1) { // program checks if their is a vowel
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}

}
