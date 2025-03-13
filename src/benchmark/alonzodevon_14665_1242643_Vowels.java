/** This program reads how many vowels are in a user input word
@author Devon Alonzo
@2023-03-18 15:52:04 */
import java.util.Scanner;
public class Vowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Scanne object
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        int vowels = 0;

        for(int i = 0; i < word.length(); i++) //for loop
        {
            String vowelCheck = Character.toString(word.charAt(i));//casting the variable word so we can use charAt function to compre the letters to each other
            if (vowelCheck.equalsIgnoreCase("a") || vowelCheck.equalsIgnoreCase("e") || vowelCheck.equalsIgnoreCase("i") || vowelCheck.equalsIgnoreCase("o") || vowelCheck.equalsIgnoreCase("u") || vowelCheck.equalsIgnoreCase("y"))
            {
                vowels = vowels + 1;
            }
        }
        System.out.println("The number of vowels in " + '"' + word + '"' + " is " + vowels);
    }
}