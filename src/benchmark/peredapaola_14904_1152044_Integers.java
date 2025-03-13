/* Paola Pereda; February, 15, 2023; PA 03 */
import java.util.Scanner;

public class Integers 
{
    public static void main (String[] args)
    { 
        System.out.println("Enter the first integer:");
        Scanner in = new Scanner(System.in);
        int firstInteger = in.nextInt();
        System.out.println("Enter the second integer:");
        int secondInteger = in.nextInt();
        int sumTwo = (firstInteger + secondInteger);
        int diffTwo = (firstInteger - secondInteger);
        int productTwo = (firstInteger * secondInteger);
        float avergTwo = (sumTwo / (float) 2);



        System.out.println("The sum of the two numbers is" + " " + sumTwo);
        System.out.println("The difference between the two numbers is" + " " + diffTwo);
        System.out.println("The product of the two numbers is" + " " + productTwo);
        System.out.println("The average is" + " " + avergTwo);
        
        

    }
}