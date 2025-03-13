//PA 02 CS123 Rubi Madrid//
import java.util.Scanner;  //user input//
public class PA02
{
    public static void main (String[]args)
    {
      System.out.println("Please enter a measurement in meters:");
      Scanner in = new Scanner (System.in);
      Double meters = in.nextDouble();                  //turns input into double// 
      Double miles = meters / 1609;                     // meters divided by 1609 equals miles//        
      Double feet = meters * 3.291;                     // meters multiplied by 3.291 equals feet//
      Double inches = meters*39.37;                    // meters multiplied by 39.37 equals inches//
                             
      System.out.println("The measurement in miles: " + miles);
      System.out.println("The measurement in feet: " + feet);
      System.out.println("The measurement in inches: " + inches);
    }
}