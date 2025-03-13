import java.util.Scanner;

/**
 * PA 04
 * Comparing two strings to see if they are identical or not.
 * Paola Pereda
 * 2023-03-06
 */

public class StringComparing 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = in.next();
        System.out.println("Enter the second string:");
        String secondString = in.next();
        if (firstString.equals(secondString))
        {
            System.out.println("All the same");
        }

        else
        {
            System.out.println("Neither");
        }

    }
}