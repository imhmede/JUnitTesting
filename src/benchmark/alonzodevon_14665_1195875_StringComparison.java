/** This program compares two words and if they are identical it will print all the same otherwise it will print neither 
@author Devon Alonzo
@2023-03-05 23:04:59*/
import java.util.Scanner; //importing scanner
public class StringComparison //creating class
{
    public static void main(String[] args) //creating method
    {
        Scanner in= new Scanner(System.in); //creating scanner object for user input
        System.out.println("Enter the first string: ");
        String firstWord=in.next(); //creating variables for the strings
        System.out.println("Enter the second string: ");
        String secondWord=in.next();
        
        if(firstWord.equals(secondWord)) //if statement to compare the two strings
        {
            System.out.println("All the same.");
        }
        else
        {
            System.out.println("Neither.");
        }
    }
}