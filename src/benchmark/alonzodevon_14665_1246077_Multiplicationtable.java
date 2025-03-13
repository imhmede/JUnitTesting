/**This program reads a number from 1 to 12 and prints the multiplication table of the that number
@author Devon Alozno
@2023-03-26 20:24:03 */
import java.util.Scanner;
public class Multiplicationtable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Scanner object
        System.out.println("Enter a number from 1 to 12: ");
        int number;
        do //do while loop to prompt the user to keep entering a number unitl the number that is within th range of 1 and 12
        {
            number = in.nextInt();
            if(number < 1 || number > 12)
            System.out.println("Number is out of range please try again: ");
            
        }
        while(number < 1 || number > 12);

        for(int i = 0; i <= 12; i++) //outer for loop to create rows for the table
        {
            for(int counter = 0; counter <1; counter++) //inner for loop for the columns
            {
               int product = number * i;
               System.out.println(number + " x " + i + " = " + product);
            }
        }
    
    }
}