import java.util.Scanner;
/**
 * This program asks for a word from the user and outputs the word in reverse.
 * @author Mercedes Theriault
 * @since 4-3-2023
 */
public class PA10_RecursiveMethod {

    /**
     * This recursive method takes a word and returns the word in reverse
     * @param word     a String input
     * @return         a String value
     */
    public static String reverse(String word)
    {
        if (word.length() == 1)
        {
            return word;
        }
        //calls itself using a substring of the parameter starting from the second letter and placing the first at the end, repeating this subdivision until the substring is of length 1
        //for an example of "wolf" the steps are as follows:
        //olf + w;   lf + o + w;   f + l + o + w
        return reverse(word.substring(1)) + word.charAt(0);
    }

    /**
     * This is the main method that asks the user for a word then uses it as an argument to call reverse()
     * @param args     a list of command-line prompts
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = in.next();
        System.out.print(word + " in reverse is \"" + reverse(word) + "\"");
    }
}
