/**
 * This is a program which checks two strings to see if they are identical, ignoring case.
 * @author Kyle Dean
 * October 23, 2023
 */

import java.util.Scanner;

public class CompareStrings
{
    /*
     * This is the main method.
     * @param args a list of command line arguments which may be input by the user
     */

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first string:\n");
        String first_string = in.next();

        System.out.print("Enter the second string:\n");
        String second_string = in.next();

        int counter = 0;
        int discrepancy_count = 0;

        int string_length = first_string.length();

        String current_character;
        String compare_character;
        // These strings are declared to be used later in comparing the two input strings.

        while (counter < string_length)
        {
            if (!(first_string.length() == second_string.length()))
            {
                discrepancy_count += 1;
                break;
            }
            // This first check within the loop makes sure the strings are the same length.
            // In the case that they are not the same length, continuing the loop is unnecessary.

            current_character = Character.toString(first_string.charAt(counter));
            compare_character = Character.toString(second_string.charAt(counter));
            // The previous two lines convert the characters to strings to be compared

            if (!(current_character.equalsIgnoreCase(compare_character)))
            {
                discrepancy_count += 1;
            }

            counter += 1;
        }

        if (discrepancy_count == 0)
        {
            System.out.print("All the same");
        }

        else
        {
            System.out.print("neither");
        }
    }
}