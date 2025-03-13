
/**
 * CS123 Java_1
 * @author Joe
 * Programming Assignment 8
 * 3/28/2023
 */


/**
 * This program is used to output the multiplication table from 0 to 12 of a user defined value from 1 to 12.
 */
import java.util.*;


public class MultiplicationTable{
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        /**
         * The section below will declare and initiate the required values to complete the program.
         */
        
        int n=0;
        int num = 0;
        int product= 0;
 
       /**
        * The section below will evaluate the user defined integer to verify that it meets the programs criteria. If the user enters a value 
        * outside of the range of 1 to 12, the program will ask the user to restart the program with an appropriate value. Otherwise, the entry
        * will proceed into the nested while loop to generate the multiplication table. 
        */
        
        System.out.println("Please choose a whole number from 1 to 12.");
        num = input.nextInt();
        
        if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9 || num == 10 || num == 12) {
            while (n <= 12) {
                product = num * n;
                System.out.println(Integer.toString(num) + " X " + n + " = " + product);
                n = n + 1;
            }
        } else {
            
            System.out.println("Please restart the program and enter a whole number between 1 to 12.");
            
        }    
    }
}
