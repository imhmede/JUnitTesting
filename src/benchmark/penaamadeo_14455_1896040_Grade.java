/**
 * PS 04
 * This program gives a letter grade  from 0-100
 * @author Amadeo Pena
 * 10/24/2023
 */
import java.util.Scanner;

public class Grade {
     /**
     * This method computes a letter grade from a given number grade
     * @return Letter grade
     */
    public static void main(String[]args){

        Scanner in= new Scanner(System.in);

        System.out.println("Enter a number Grade(0-100):");
        int grade = in.nextInt();

        if (grade>= 90 && grade <101){
            System.out.println("A");
        }
        else if (grade >= 80 && grade <90){
            System.out.println("B");
        }
        else if (grade>= 70 && grade <80){
            System.out.println("C");
        }
        else if (grade >= 60 && grade <70){
            System.out.println("D");
        }
        else if (grade < 60 && grade >0){
            System.out.println("F");
        }
        else {
            System.out.println("Invalid number grade. Program is terminated");
        }

    }
    
}
