/** This program will compare two strings and display "all the same" or "neither"
 * @author Ramon Barrera
 * Oct 19, 2023 
 */

 import java.util.Scanner;
 
public class CompareStrings {

    /** This is the entry point of the program
     * @param   args    a list of arguments passed on by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String string1 = in.next();

        System.out.println("Enter the second string:");
        String string2 = in.next();

        if (string1.equalsIgnoreCase(string2))
        {
            System.out.println("All the same");
        }

        else
            System.out.println("Neither");

    }
}
    
