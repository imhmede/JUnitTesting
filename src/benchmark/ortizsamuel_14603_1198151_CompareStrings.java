/**
 * program that reads in two strings and prints “all the same” if they are identical otherwise, it prints “neither”
 * Samuel Ortiz
 * @2023-03-06
 * */
import java.util.Scanner;
public class CompareStrings
{
    /** 
     * The main method
     * @param args a list of command line arguments
     * */
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the first string: ");
	    String string1 = in.next();
	    System.out.println("Enter the second string: ");
	    String string2 = in.next();
	    if(string1 .equals (string2))
	    {
	        System.out.println("All the same");
	    }
	    else
	    {
	        System.out.println("Neither");
	    }
	}
}
