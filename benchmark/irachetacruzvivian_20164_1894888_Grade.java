/**
 * This program asks a user to provide a number between 0 and 100 and then maps it to a letter grade which will be printed out.
 * @author Vivian Iracheta
 * Oct. 25th, 2023
 */

 import java.util.Scanner;
 
 public class Grade {
    /** This is the main method and enter point
     * @param   args  this is a list of command-line arguments passed by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = in.nextInt();

        if(number >= 90)
        {
            System.out.println(number + " is an A");
        }
        else 
        {
            if(number >= 80)
               System.out.println(number +" is a B");
        }
        {
            if(number >= 70 && number <= 79)
               System.out.println(number +" is a C");
        }
        {
            if(number <= 69 && number > 60)
               System.out.println(number +" ia a D");
        }
        {
            if(number <= 60)
               System.out.println(number +" is a F");
        }
    }    
 }