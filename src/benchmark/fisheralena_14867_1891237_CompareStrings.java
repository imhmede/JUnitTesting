/**
 * PA 04
 * This program comapres two strings given by the user to see if they are identical
 * @author  Alena Fisher
 * October 17, 2023
 */

import java.util.Scanner;

public class CompareStrings {
    /**
         * This is the main method of the program
         * @param   args   a list of possible arguments passed by the user
         */
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstString = in.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = in.nextLine();

        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("The strings are equal");
        }

        else {
            System.out.println("The strings are not equal");
        }

    }
}