import java.util.Scanner;
/** 
 * This program is a simple calculator using 2 user generated integers
 * @author Mercedes Theriault
 * @version 1 created on 2-18-2023
 */
public class PA03_Calculator{
    public static void main(String[] args)
    {
        //imlements a scanner that detects user input
        Scanner in = new Scanner(System.in);

        //asks user for a number, twice. assigns to variable
        System.out.println("Please enter the first number: ");
        int num_1 = in.nextInt();
        System.out.println("Please enter the second number: ");
        int num_2 = in.nextInt();

        /**prints the operations and results with one statement using \n to span multiple lines:
         * print( Sum: 1+2
         *   \nDifference: 2-1
         *   \nProduct 1*2
         *   \nAvg: (1+2)/2)
         * convert last line to float to show the full decimal
         */
        System.out.println("The sum of the two numbers is: " + (num_1 + num_2)
                            + "\nThe first number subtracted from the second number is: " + (num_2 - num_1)
                            + "\nThe product of the two numbers is: " + (num_1 * num_2)
                            + "\nThe average of the two numbers is: " + ((float)(num_1 + num_2) / 2));
    }
}