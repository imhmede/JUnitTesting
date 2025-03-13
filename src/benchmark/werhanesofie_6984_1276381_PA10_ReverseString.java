/**
 * PA10: reads a string inputed by the user then prints the string in reverse using a recursive method.
 * @author  Werhane
 * @date    2023.03.29
 */

//imports scanner in order to get user input later
import java.util.Scanner;

public class PA10_ReverseString
{
    /**
     * The main method.
     * @param args  recieves a series of command-line arguements from the user
     */
    public static void main(String[] args)
    {
        //initiates a scanner to get user input
        Scanner in = new Scanner(System.in);

        //prompts user input and stores it as a variable string word
        System.out.print("Enter a word: ");
        String word = in.nextLine();

        System.out.println(reverse(word));
    }

    /**
     * Reverses a word.
     * @param str   the string to be reversed
     * @return      the reverse of the string that was entered
     */
    public static String reverse(String str)
    {
        //when the string consists of a single letter, it will return the string unmodified.
        if(str.length() == 0)
        {
            return str;
        }
        
        /* 
         * By calling reverse starting at index 1, we "chop off" the first character, shortening the string.  
         * This continues recursively until the string is just the last character, at which point it returns string.
         * The second portion of the statment then adds the first character in str for that recursion to the end.
         */
        else
        {   
        return reverse(str.substring(1, str.length())) + str.substring(0, 1);
        }

        /*
         * So if we enter "flow", since str.length() != 1, it will move to the return statment, returns "f" + ...
         * 
         * 1 reverse(low).
         * 2 Then, the same thing happens, and it calls reverse("ow").
         * 3 Then, the same thing happens, and it calls reverse("w").
         * 3 It then returns "w".
         * 2 Then it returns "w" + "o".
         * 1 Then it returns "wo" + "l".
         * 1 Then it returns "wol" + "f".
         * 
         * Sorry if this is too much documentation, I initially just did this to help myself work through the logic, but I thought it might be good to leave in.
         */
    }
}

