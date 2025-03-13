/** Maxwell Whitaker
 * 3/28/2023
 * PA 08
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Input the number between 1 to 12.
        System.out.print("Enter a number within the range of 1 to 12: ");
        int num = input.nextInt();
//Prints out Invalid input if you input a number less then 1 or greater than 12
        if (num < 1 || num > 12) {
            System.out.println("Invalid input. Please input a number within the range of 1 to 12.");
            return;
        }
//Prints the sentence "Multuplication table #"
        System.out.println("Multiplication table of " + num + ":");
//Prints the multiplaciton talbe of the inputed number.
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
