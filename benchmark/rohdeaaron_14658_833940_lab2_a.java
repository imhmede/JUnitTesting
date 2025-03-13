import java.util.Scanner;
public class lab2_a
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input;
        String output;

        // Get input
        System.out.print("Please enter a number: ");
        input = in.nextInt();

        // Conversion to string
        output = Integer.toString(input);

        // Convert any length string int into spaced out numbers
        output = addSpaces(output);

        // Return results
        System.out.print("your number spaced out is: " + output);
    }

    public static String addSpaces(String text)
    {
        String output = "";
        for (int i = 0; i < text.length(); i++)
        {
            output = output + text.charAt(i);
            // block a trailing space
            if ( i != text.length()-1 )
            {
                output = output + " ";
            }
        }
        return output;
    }
}