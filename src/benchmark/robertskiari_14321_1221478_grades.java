 /**
  * this program translates a letter grade into a number grade. Letter grades are A, B, C, D, and F. 
  *Their numeric values are 4, 3, 2, 1, and 0.
  *@Kiari Roberts
  *@2023-03-10
* */

import java.util.Scanner;

public class grades
{
 

public static void main (String[] args)
{
 try(Scanner in = new Scanner (System.in)){
    System.out.println("Enter in a letter grade:");
    String grades = in.next();
    {
        if (grades.equalsIgnoreCase("A"))
        {
            System.out.println("4");
        }
        if (grades.equalsIgnoreCase("B"))
        {
            System.out.println("3");
        }
        if (grades.equalsIgnoreCase("C"))
        {
            System.out.println("2");
        }
        if (grades.equalsIgnoreCase("D"))
        {
            System.out.println("1");
        }
        if (grades.equalsIgnoreCase("F"))
        {
            System.out.println("0");
        }
    }
}
}
}