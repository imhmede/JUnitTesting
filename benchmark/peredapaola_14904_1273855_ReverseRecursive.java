/**
 * This program computes the reverse of a string
 * @author Paola Pereda
 * @2023-04-06
 * PA 10
 */
import java.util.Scanner;

public class ReverseRecursive
{
    /**
     * This is method takes a string and reverses it 
     * @param str       a string
     * @return          " " returns a string
     */
public static String reverse(String str)
{
    if(str.length() <= 1)
    {
     System.out.println(str);
     return str;
      
    }
    else
    {
        System.out.print(str.charAt(str.length()-1));
        reverse(str.substring(0,str.length() - 1));
    }
    return " ";
}

/**
 * This is the main method
 * @param args      a line of command-line arguments
 */
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a word:");
    String word = in.next();
    System.out.println(reverse(word));
}

}