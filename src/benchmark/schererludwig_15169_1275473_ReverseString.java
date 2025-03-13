/**
 * this program reverses a string given by the user
 * @author Ludwig Scherer
 * @date 04-07-2023
 */

import java.util.Scanner;

public class ReverseString 
{
    /**
     * this method reverses a string input
     * @param str String value
     * @return reversed input string
     */
    public static String reverse(String str) // start reversing from last to first character */
    {
        String lastChar = Character.toString(str.charAt(str.length() - 1));
        if(str.length() == 1) //base case of the recursive method
        {
            return str;
        } 
        else
        {
            return lastChar + reverse(str.substring(0, str.length() - 1)); //recursive method call to reverse the remaining string and add it to the former last character of the string 
        }
    }
    /**
     * the main method
     * @param args a list of command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = in.next();
        String revString = reverse(str); //reverse() method call to reverse the input string
        System.out.println("The reversed word is: " + revString);
        in.close();
    }
    
}
