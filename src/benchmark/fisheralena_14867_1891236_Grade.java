/**
 * PS 04
 * This program prompts the user for a value between 1 and 100 and prints the corresponding letter grade
 * @author  Alena Fisher
 * October 17, 2023
 */

 import java.util.Scanner;

 public class Grade {
    /**
         * This is the main method of the program
         * @param   args   a list of possible arguments passed by the user
         */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a grade from 1-100: ");
        double grade = in.nextDouble();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        }

        else if (grade >= 80 && grade <=89) {
            System.out.println("B");
        }

        else if (grade >= 70 && grade <=79) {
            System.out.println("C");
        }

        else if (grade >=60 && grade <=69) {
            System.out.println("D");
        }

        else {
            System.out.println("F");
        }

    }
 }