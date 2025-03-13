/** This code will take two inputs from a user and compare them to see if they are the same
 * DallanSilver
 * CS123 Comparison HW
 * 10/24/2023
 */
import java.util.Scanner;

public class CompareStrings {
    /** Here is the entry point for my code
     * @param   args   a comparison made from two inputs by the user
     */
    public static void main(String[] args) {
        // taking an input from the user
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String first = in.next();
        System.out.println(first);

        // taking second input from user
        System.out.println("Please enter another string: ");
        String second = in.next();
        System.out.println(second);

        if (first.equals(second))
        {
            System.out.println("All the same");
        }
        else
        {
            System.out.println("Not the same");
        }


    }
}