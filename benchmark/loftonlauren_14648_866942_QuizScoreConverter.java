/*
Lauren Lofton
CS123
10/2/22
Lab 3a
Write a program that reads in a quiz score and assigns a letter grade for it,
according to the following table:
 
Score Grade 90-100 A; 80-89 B; 70-79 C; 60-69 D; less than 60 F;
*/
import javax.swing.JOptionPane;

public class QuizScoreConverter {

   public static void main(String[] args) {
// request user input
      String input = (JOptionPane.showInputDialog(null, "What is your grade?"));
// convert string input into integer
      int score = Integer.parseInt(input);
// loop through scores
      String message = null;
      if (score >= 90 && score <= 100) {
         message = "You got an A.";
      } else if (score >= 80 && score < 90) {
         message = "You got a B.";
      } else if (score >= 70 && score < 80) {
         message = "You got a C.";
      } else if (score >= 60 && score < 70) {
         message = "You got a D.";
      } else if (score >= 0 && score < 60) {
         message = "You got a F.";
      } else if (score < 0 || score > 100) {
         message = "Please enter a number between 0 and 100.";
      }
// response
      JOptionPane.showMessageDialog(null, message);
   }
}
