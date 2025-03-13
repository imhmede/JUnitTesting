/**
 * A program that reverses a given String
 * Samuel Ortiz
 * 04/07/2023
 * CS123
 * */
import java.util.Scanner;
public class StringReversal
{
    /**
     * Main Method
     * requesting user input and calling for recursion method reverse
     * @param String str object for reversal
     * */
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = in.next();
		System.out.println(reverse(str));
		in.close();
	}
	/**
	 * Recursion method reverse
	 * reverses the word from user input in Main method
	 * @param string length
	 * */
	public static String reverse(String str)
	{
	    if (str.length()>1)
	    {
	        return reverse(str.substring(1))+str.charAt(0);
	    }
	    return str;
	}
}
