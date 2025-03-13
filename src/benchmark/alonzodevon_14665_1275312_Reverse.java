/**This program takes a string and prints it out in reverse 
 * @author Devon Alonzo
 * @2023-04-07 10:34:25
*/
import java.util.Scanner;
public class Reverse
{
    /**This recursion method extracts the last character and placees it in front to return the word typed in by the user in reverse order
     * @param str   a word
     * @return reverse ordered word     str backwards
     */
    public static String reverse(String str)
    {
        if(str.length() == 1)
        {
            return str;
        }
        else
        {
            return str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1)); //extracting last character and then placing it at the end
        }
    }
    /**This is the main method
     * @param args  a list of command line arguments
     */
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word: ");
       String word = in.next();
       System.out.println(reverse(word));
    }
}