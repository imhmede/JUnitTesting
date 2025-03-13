//Autumn Brown, PA04, 03-05-23
import java.util.Scanner;

public class CompareStrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String input1 = in.nextLine();

        System.out.print("Enter the second string: ");
        String input2 = in.nextLine();

        in.close();

        if (input1.equals(input2))
        {
            System.out.print("All the same\n");
        }
        else
        {
            System.out.print("Neither the same\n");
        }
    }
}