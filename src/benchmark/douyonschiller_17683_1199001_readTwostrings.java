/** 
 * This program reads in two strings and prints"all the same" if they are identical.Otherwise, it print"neither".
 * @ author Schiller Douyon
 * @ date 03/06/2023
 */
import java.util.Scanner;
public class readTwostrings
/**
 * The main method
 * @param args a list of command-line arguments
 */
{
    public static void main(String[] args)
{
 System.out.println("Enter the first String:");
Scanner in = new Scanner(System.in);
String word  = in.next();
in =  new Scanner (word);
String firstword = in.next();
System.out.println("Enter the second String:");
in =  new Scanner (word);
String secondword = in.next();
if (firstword==secondword)
{
System.out.print("all the same");
 }
else
{
System.out.println("neither");
}
}
}