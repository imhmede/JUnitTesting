// Autumn Brown, 04/06/23, PA10

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: \n");
        String str = in.nextLine();
        in.close();

        String reversed = reverse(str);
        System.out.println(reversed);
    }
    public static String reverse(String str)
    {
        if (str.isEmpty())
        {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
