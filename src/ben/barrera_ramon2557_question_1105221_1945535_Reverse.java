/**
 * This program will reverse the the user string input
 * @author Ramon Barrera
 * Nov 12, 2023
 */

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a string");
        String input = in.nextLine();

            System.out.println(reverseString(input));
    }

     /**
         * A resursive method to reverse the string input of user
         * param    input   the input string
         * param    reverseString the reverse of the user input
         * @return a string displaying the reverse of the input
         */

    public static String reverseString(String input) {
        if (input.length() == 1) {
            return input;
        }else{
            String reverseString = reverseString(input.substring(1)) + input.charAt(0);
                return reverseString;
        }
    }
    
}


