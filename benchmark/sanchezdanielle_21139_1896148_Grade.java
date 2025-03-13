/**This program prompts the user for a number grade within 0-100 and outputs a letter grade. 
 * @author Danielle Sanchez
 * Date: 10/24/2023
 */
 
 import java.util.Scanner;
 
 public class Grade
 {
     public static void main(String[] args)
     {
        /**
         * This is the main entry point of the program
         * @param args a list of possible arguments passed by the user
         */
         Scanner in = new Scanner(System.in);

         /*User Input */
         System.out.println("Please enter an integer grade: ");
         int num_grade = in.nextInt();
         
         /*Determine the letter grade for integer inputted by user */
         if(num_grade > 90)
         {
             System.out.println("A");
         }
         else if (num_grade > 80)
         {
             System.out.println("B");
         }
         else if (num_grade > 70)
         {
             System.out.println("C");
         }
         else if (num_grade > 60)
         {
             System.out.println("D");
         }
         else
         {
             System.out.println("F");
         }
     }
 }