/**
 * PS 04
 * This program compares two strings.
 * @author Amadeo Pena
 * 10/24/2023
 */

import java.util.Scanner;

public class CompareStrings {
    /**
     * This method compares strings on if they are equal.
     * @return Comparing strings
     */
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String stringOne = in.next();
        System.out.println("Enter the second string: ");
        String stringTwo = in.next();

        if (stringOne.equals(stringTwo)){
            System.out.println("All the same!");
        }
        else{
            System.out.println("Neither!");
        }

}
}
