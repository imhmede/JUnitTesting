/**
 * This program compares two strings given by a user and prints if the are identical or not.
 * @author Vivian Iracheta
 * Oct. 25th, 2023
 */

 import java.util.Scanner;

 public class CompareStrings {
    /**
     * This is the main method
     * @params  args   a list of command-line arguements provided by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the first string: ");
        String string1 = in.next();
        System.out.println("Enter the second string: ");
        String string2 = in.next();

        if(string1.equalsIgnoreCase (string2)) {
            System.out.println("All the same");
        }
        else {
            System.out.println("Neither");
        }
        
    }
 } 
        
        
    


    

