 
 /** This program is designed to calculate a letter grade from a score input from the user.
  * @author Jordan Arguello
  * Oct 10/25/23
*/
import.java.util.Scanner;
public class Grades{
/** This method will review the input and produce a corresponding letter grade in return.
 * @param args a list of all possible arguments.
  */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Score = in.nextDouble();
    if
    (90 <= Score <= 100);
    System.out.println("A");
    if
    (80 <= Score <= 89);
    System.out.println("B");
    if
    (70 <= Score <= 79);
    System.out.println("C");
    if
    (60 <= Score <= 69);
    System.out.println("D");
    if
    (Score < 60);
    System.out.println("F");
    else
    System.out.println("Cannot compute grade");
  }
}
