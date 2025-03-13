import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //User chooses a number
        System.out.print("Enter a number between 1 and 12: ");
        int number = in.nextInt();

        in.close();

        //for loop loops through 12x by multiplying the user's chosen number.
        //Printing statement uses simple multiplication and simple java programming to produce desired outcome.
        //I started the n at -1 so it can show the multiplication from 0-12 instead of 1-12.
        for (int n = -1; n < 12; n++)
        {
            System.out.println(number + "x" + (n+1) + "=" + (number*(n+1)));
        }
    }
}