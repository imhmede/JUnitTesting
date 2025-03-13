/**This program takes a string as a parameter and returns a new string
 * that is the reverse of the input string.
 * @author Danielle Sanchez
 * 11/12/2023
 */

 import java.util.Scanner;

public class reverseString {
    /**
     * This is the main entry point of the program
     * @param args list of possible arguments passed by the user. 
     */
    
     public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        /*Get user input */
        System.out.println("Enter a string: ");
        String user_input = in.next();

        /*Call the reverse string function & input String */
        String new_word = ReverseString(user_input);

        /*Print the output of the reverse string */
        System.out.println("Here is the output of the reverse string " + new_word);


     }

/*This function returns the string reversed */
public static String ReverseString()
{
    /*Loop for reverse string */
    for(int k=user_input.length();k>0;k--)
    {
        String reverse = input_length.charAt(k-1);
    }
    return reverse;
}
}