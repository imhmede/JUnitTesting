import java.util.Scanner;
public class PA05_LetterGrade 
{
/**This program takes a letter grade from the user and converts it to a numeric value 
 * @author Mercedes Theriault
 * @03-06-2023
*/ 
    public static void main(String[] args)
    {
        //Scanner implementation, uses in.next() to store a user input as variable letter
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = in.next();

        //if statements to individually check the letter input, outputs the respective numeric value
        //using .equalsIgnoreCase to remove case sensitivity for the user input
        if (letter.equalsIgnoreCase("A"))
        {
            System.out.println("The numeric value of the letter grade A is 4.");
        }
        else if (letter.equalsIgnoreCase("B"))
        {
            System.out.println("The numeric value of the letter grade B is 3.");
        }
        else if (letter.equalsIgnoreCase("C"))
        {
            System.out.println("The numeric value of the letter grade C is 2.");
        }
        else if (letter.equalsIgnoreCase("D"))
        {
            System.out.println("The numeric value of the letter grade D is 1.");
        }
        else if (letter.equalsIgnoreCase("F"))
        {
            System.out.println("The numeric value of the letter grade F is 0.");
        }
        //final else statement to catch invalid inputs
        else
        {
            System.out.println("Invalid letter grade. Program is terminated.");
        }
    }
}
