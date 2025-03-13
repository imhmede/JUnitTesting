import java.util.Scanner;

/**
 * The purpose of this program is to calculate the sum, the difference, the product and the average of two integers
 * @author Ludwig Scherer 
 */

public class TwoIntegers
{

    /**
     * This method gathers the two integers from the user
     * @param a gathers integer a from the user
     * @param b gathers integer b from the user
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer a of your choice: ");
        int a = in.nextInt();

        System.out.print("Please enter an integer b of your choice: ");
        int b = in.nextInt();

        System.out.print("The sum of the numbers is: ");
        System.out.println(a + b); // calculates and prints the sum of a and b

        System.out.print("The difference between the two numbers is: ");
        System.out.println(a - b); // calculates and prints the difference of a and b

        System.out.print("The product of the two numbers is: ");
        System.out.println(a * b); // calculates and prints the product of a and b

        System.out.print("The average of the two numbers is: ");
        System.out.printf("%f%n", (a + b) / 2.0); // calculates and prints the average of and b. Also formats the output to six decimal places 

        in.close();
    }
    
}
