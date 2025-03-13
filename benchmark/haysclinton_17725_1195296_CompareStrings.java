import java.util.Scanner;

public class CompareStrings
{
    public static void main(String[] args)
{
   //* Reads in Firste string */

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First String: ");
    System.out.println("");
    String FirstString = sc.nextLine();

    //*Reads in second string */

    System.out.print("Enter Second String: ");
    System.out.println("");
    String SecondString = sc.nextLine();

    //*Compares first and second string */


        
   if ( FirstString.equals(SecondString) ) {
    System.out.print("All the Same ");

   } else if (!FirstString.equals (SecondString) ) {
    System.out.print("neither");
   }
}
}






