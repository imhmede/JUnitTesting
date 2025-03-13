/**This program prompts the user for 2 strings and prints the identical ones, otherwise prints neither.
 * @author Danielle Sanchez
 * Date: 10/24/2023
 */
 
 import java.util.Scanner;
 
 public class CompareStrings
 { 
    /**
     * This is the main entry of the program
     * @param args a list of possible arguments passed by the user
     */
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);

         /*Ask for user imput */
         System.out.println("Enter the first string:\n");
         String first_string = in.next();
         System.out.println("Enter the second string:\n");
         String second_string = in.next();
         
         /*Determine if the strings are equal */
         if (first_string.equals(second_string))
         {
             System.out.println("All the same.");
         }
         else
         {
             System.out.println("Neither.");
         }
     }
 }