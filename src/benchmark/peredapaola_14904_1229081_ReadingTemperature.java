/** This program reads a Temperature and converts it to either Farenheit or Celsius
 * Paola Pereda
 * @2023-03-14
 * PA06
 */
import java.util.Scanner;

public class ReadingTemperature
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int temperature = in.nextInt();
        System.out.println("Enter the scale of the temperature");
        String scale = in.next();
        int celsius = temperature;
        if(scale.equalsIgnoreCase("F"))
            {
                celsius = (5*(temperature-32))/9;
            }
        if(celsius <= 0)
        {
            System.out.println("The water is a solid.");
        }
        else if(celsius > 0 && celsius <= 100)
        {
            System.out.println("The water is liquid.");
        }
        else
        {
            System.out.println("The water is a gas.");
        }
    }
}