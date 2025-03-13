import java.util.Scanner;
/**
 * PA 04
 * @author morgansmith
 03-07-2023
 */

public class Match
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter the first string: ");
        Scanner in = new Scanner(System.in); //allows user input//
        String in1 = in.next();
        System.out.println("Please enter the second string: ");
        String in2 = in.next();
        if (in1.equals(in2)) //if the first string is the same as the second "All the same" will be printed//
        {
            System.out.println("All the same");
        }
        else //if the "if" statement is not satisfied "Neither" will be printed//
        {
            System.out.println("Neither"); 
        }
    }
}