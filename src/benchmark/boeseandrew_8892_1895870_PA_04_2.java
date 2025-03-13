/**
 PA 04
 Andrew Boese
 CS 123
 Essa Imhmed
 10/25/23
 */
import java.util.Scanner;
/**
 this code takes a number for 0 to a 100 form a user and returns a letter grade
 */
public class PA_04_2 {
    public static void main(String[] args) {
        //asks for grade form 0 to 100
        System.out.println("Enter a grade within the range of 0-100");
        Scanner G = new Scanner(System.in);
        int grade = G.nextInt(); // saves the user input as an integer

        //if statements for letter grade
        if (grade >= 90){
            System.out.println("Grade is A");
        }
        else if (grade >= 80) {
            System.out.println("Grade is B");
        }
        else if (grade >= 70) {
            System.out.println("Grade is C");
        }
        else if (grade >= 60) {
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Grade is F");
        }
    }
}
