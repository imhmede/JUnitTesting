/**
 * This program collects and converts a number grade to a corrisponding letter grade.
 * @author Samuel Blaney
 * @since Oct 25, 2023
 */
import java.util.Scanner;

public class Grade {
  /**
   * This is the main method where user number grades are converted to letter grades A, B, C, D, F.
   * @param args  a list of possible command-line arguments passed by the program.
   */
  public static void main(String [] args) {

    //collecting number grade from user
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your number grade for the course: ");
    int numberGrade = in.nextInt();
    
    //mapping grade to corrisponding letter grade using operators and ranges
    if (numberGrade >= 90 && numberGrade <= 100) {
      System.out.println("Course Letter Grade: A");
    } else if (numberGrade >= 80 && numberGrade < 90) {
      System.out.println("Course Letter Grade: B");
    } else if (numberGrade >= 70 && numberGrade < 80) {
      System.out.println("Course Letter Grade: C");
    } else if (numberGrade >= 60 && numberGrade < 70) {
      System.out.println("Course Letter Grade: D");
    } else if (numberGrade < 60) {
      System.out.println("Course Letter Grade: F");
    }
  }
}
