/*
 * This program reads two strings and prints if they are the same or different
 * @author Rubi Madrid CS123
 * @date 03.06.2023
 * @param args a command-line argument
 */
import java.util.Scanner;
public class CompareString
{
    public static void main (String[]args)
    {   //recieves user input//
        Scanner in = new Scanner (System.in);

        //prompts first string input//
        System.out.println("Enter the first string:");
        
        //stores return value in string1//
        String string1 = in.next();

        //prompts second string input//
        System.out.println("Enter the second string:");
        
        //stores return value in string2//
        String string2 = in.next();
        {
           //if statement to see if string1 is the same as string2, if proven true it will print "all the same"// 
           if (string1.equals(string2))
           {
            System.out.println("all the same");
           }
           //if previous if statement is proven false, then it will print "neither"//
           else
           {
            System.out.println("neither");
           }
        }
    }
}