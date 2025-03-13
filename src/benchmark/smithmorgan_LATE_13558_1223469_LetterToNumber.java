/**
@author morgansmith
CS123 PA05
03-10-23
 */
import java.util.Scanner;

 public class LetterToNumber
{
     public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a letter grade: ");
        String Letter = in.next();
        if(Letter.equalsIgnoreCase("A"))
            System.out.println("The numerical value of letter grade A is 4");
        else if(Letter.equalsIgnoreCase("B"))
            System.out.println("The numerical value of letter grade B is 3");
        else if(Letter.equalsIgnoreCase("C"))
            System.out.println("The numerical value of letter grade C is 2");
        else if(Letter.equalsIgnoreCase("D"))
            System.out.println("The numerical value of letter grade D is 1");
         else if(Letter.equalsIgnoreCase("F"))
            System.out.println("The numerical value of letter grade F is 0");
        else
            System.out.println("Invalid letter grade. Program is terminated. ");
     }
}