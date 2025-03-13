
import java.util.Scanner;


/**
 *
 * @Assignemnt CS123 Programming Assignment 10
 * @Author Joseph Padilla
 * @Date 4/6/23
 * @Purpose The purpose of the program is to take a user defined string and reverse the characters in that string and output the reversed string. 
 * 
 */

public class ReverseString {
    
    /**
     * 
     * @param str is the user defined string. 
     * @return true if string is empty, false when it is not.
     * 
     */
    
    public static String ReverseString(String str){
        
        if (str.isEmpty())
            return str;
        
        return ReverseString(str.substring(1)) + str.charAt(0);
    }
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        /**
         * 
         * @param reversed calls method ReverseString(str).
         * 
         */
        
        System.out.println("Enter a word:");
        String str = input.next();
        String reversed = ReverseString(str);
        System.out.println(reversed);
        
    }
}
