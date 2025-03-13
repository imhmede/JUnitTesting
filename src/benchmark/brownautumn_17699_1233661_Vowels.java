import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();
        in.close();

        int vowelCount = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' 
                || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y' 
                || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
                || word.charAt(i) == 'O' || word.charAt(i) == 'U' || word.charAt(i) == 'Y')

            {
                vowelCount++;
            }
        }

        System.out.println("The number of vowels in the word is: " + vowelCount + "\n");
    }
}