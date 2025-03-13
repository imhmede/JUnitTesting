/**
 *Kayla Van Curen
 *3-28-2023
 *CS 123 - Computer Science 1
 *Assignment- PA 08
*/

import java.util.Scanner;

public class Multiplicationtable
{

    public static void main(String[] args) {
	
        System.out.println("Enter a number between 1 and 12: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i <= 12; i++){
            if (n < 1 || n > 12){
                System.out.println("Number is out of range");
                break;
            }
            System.out.println(n+ " * " + i + " = " + (n*i));
        }
    
	}
}