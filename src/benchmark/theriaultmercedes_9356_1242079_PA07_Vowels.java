import java.util.Scanner;
public class PA07_Vowels 
/** This program takes a user generated word and prints the integer number of vowels it contains. In the program, a, e, i, o, u, and y are vowels
 * @author Mercedes Theriault
 * @3-17-2023
 */
{
    public static void main(String[] args)
    {
        //Scanner implementation and printing a prompt the user will respond to
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");

        //in.next() is used to initialize userWord as opposed to nextLine(), which could possibly be used in the future for multiple words
        String userWord = in.next();

        //vowelNum will hold the number of vowels that are contained in the word
        int vowelNum = 0;

        //in this loop, s is associated with the index of the word. it is initialized at 0 and increments by one for each iteration 
        //The loop occurs as long as s does not meet or exceede the number of characters in userWord
        for (int s=0; s < userWord.length(); s++)
        {
            //for each letter in userWord, the for loop will check if the character is a vowel. 
            //for brevity, only one if statement is used with multiple "or" condition checks with ||
            //if any of the conditions are true, the number of vowels is incremented
            //could possibly use cases, but we have not learned them at this point
            if (userWord.substring(s, s+1).equalsIgnoreCase("A")
                        ||userWord.substring(s, s+1).equalsIgnoreCase("E")
                        ||userWord.substring(s, s+1).equalsIgnoreCase("I")
                        ||userWord.substring(s, s+1).equalsIgnoreCase("O")
                        ||userWord.substring(s, s+1).equalsIgnoreCase("U")
                        ||userWord.substring(s, s+1).equalsIgnoreCase("Y"))
            {
                vowelNum++;
            }
        }

        //prints the user generated word along with the number of vowels
        System.out.print("The number of vowels in \"" + userWord + "\" is: " + vowelNum);
    }
}
