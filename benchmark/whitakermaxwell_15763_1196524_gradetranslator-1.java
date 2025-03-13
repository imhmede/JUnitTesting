//Maxwell Whitaker
//3.6.2023
//PA05
import java.util.Scanner;

public class gradetranslator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter grade: ");
      String letterGrade = input.next().toUpperCase();
      
      int numericGrade;
      switch (letterGrade) {
         case "A":
            numericGrade = 4;
            break;
         case "B":
            numericGrade = 3;
            break;
         case "C":
            numericGrade = 2;
            break;
         case "D":
            numericGrade = 1;
            break;
         case "F":
            numericGrade = 0;
            break;
         default:
            numericGrade = -1;
            System.out.println("Invalid letter grade entered.");
            break;
      }
      
      if (numericGrade >= 0) {
         System.out.println("The numeric value of " + letterGrade + " is " + numericGrade + ".");
      }
   }
}
