//Samuel Ortiz, PA02, 02-12-2023
import java.util.Scanner;
public class Main
{
               public static void main(String[] args) {
                              Scanner in = new Scanner(System.in);
                              System.out.println("Please enter a measurement in Meters: ");
                              double measurement = in.nextDouble();
                              double miles = measurement / 1609;
                              double feet = measurement * 3.281;
                              double inches = measurement * 39.37;
                              System.out.println("The measurement in miles is: " + miles);
                              System.out.println("The measurement in feet is: " + feet);
                              System.out.println("The measurement in inches is: "  + inches);
               }
}
