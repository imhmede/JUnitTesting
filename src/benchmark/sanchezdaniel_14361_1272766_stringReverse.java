/**
 * This program takes a string input and reverses it via a recursive method.
 * @author Daniel Sanchez
 * @version 1
 * Assignment PA10 stringReverse
 * Date: 4/6/23
 */
import java.util.Scanner;
public class stringReverse {// class
    /**
     * This method takes a string and reverses it.
     * @param variable str is user input
     * @return returns str values
     * @return returns substring starting at second character and then adds first charachter at end.
     */
    public static String reverse(String str) //recursive method
    {
        if (str.isEmpty()) // if statement checks boolean if length 0
            return str; // return str values
        return reverse(str.substring(1)) + str.charAt(0); // return recursive values for below
    }
    /** 
     * This method passes user input (string) to a recursive method and then displays those string values in reverse.
     * @param input is given once.
     * Variable 'reversed' passes values of recursive method above.
     * Then new string is displayed in reverse order
    */
    public static void main(String[] args) { //main method
        String input; // variable string input declared
        Scanner scanner = new Scanner(System.in); //scanner object declared
        System.out.println("Enter a word: "); //ask for user string input
        input = scanner.nextLine(); //read input
        scanner.close(); // closing scanner no more parameter entries
        String reversed = reverse(input); //declared and initialized variable string taking values from recursive method return above
        System.out.println(reversed); //display newly reversed String
    }
}