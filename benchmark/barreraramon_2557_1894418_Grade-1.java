/** This program will convert number grade to letter grade
 * @author Ramon Barrera
 * Oct 19, 2023
 */

 import java.util.Scanner;

public class Grade {

    /** This is the entry point of the program
     * @param   args    a list of arguments passed on by the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.println("Please enter number grade within the range 0-100 ");
        int number = in.nextInt();

        if (number < 0 || number > 100) {
            System.out.println("Invalid range");
        }

       else if (number <= 100 && number >= 90) {
            System.out.println("A");
        }
        else if (number <= 89 && number >= 80) {
            System.out.println("B");
        }
        else if (number <= 79 && number >= 70) {
            System.out.println("C");
        }
        else if (number <= 69 && number >= 60) {
            System.out.println("D");     
        }

        else {
            System.out.println("F");
        }


    }

    
}
