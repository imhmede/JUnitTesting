import java.util.Scanner;
  /**
     * This program takes a user generated number from 1-12 and prints the multiplication table for that number
     * 
     * @author Mercedes Theriault
     * @since 3-27-2023
     */
public class PA08_MultTable 
{
  /**
   * This is the main method that asks the user for an integer number 1-12 and prints the multiplication table for that number
   * @param args supplies command-line arguments as String objects
   */
    public static void main(String[] args)
    {
        //scanner initialization
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer from 1-12: ");

        //multBase is the integer that will be used for the multiplication table
        int multBase = in.nextInt();

        //this for loop goes through all i values from 1-12, printing the product between multBase and i
        for (int i = 1; i <= 12; i++)
        {
            System.out.println(multBase + " x " + i + " = " + (i * multBase));
        }
    }
}
