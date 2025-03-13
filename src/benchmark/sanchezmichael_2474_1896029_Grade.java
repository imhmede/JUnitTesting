/**
 * Program gives the letter equivalent of number grade
 * @author Michael Sanchez
 * October 25th, 2023
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        /**List of arguments contained within the main method */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a grade between 0 - 100."); //Requests integer between 0-100
        int grade = in.nextInt();

        if (grade >= 90) { //Compares grade to specific number and outputs letter grade if meets criteria
            System.out.println("A");
        }
        else if (grade >= 80) {
            System.out.println("B");
        }
        else if (grade >= 70) {
        System.out.println("C");
        }
        else if (grade >= 60) {
        System.out.println("D");
        }
        else if (grade <= 59) {
        System.out.println("F");
        }
    }        
    
}
