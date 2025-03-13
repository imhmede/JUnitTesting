/**
 * a program that reads a temperature and the letter C for Celsius or F for Fahrenheit. The program prints whether water is liquid, solid, or gaseous at the given temprature at sea level
 * @author Ludwig Scherer
 * @date 03-16-2023
 */

 import java.util.Scanner;

public class TemperatureConverter
{
    /**
     * the main method
     * @param args a list of command-line arguments
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the temperature of the water");
        float temp = in.nextFloat();

        System.out.println("Please enter the unit of the temperature");
        String unit = in.next();

        if(unit.equalsIgnoreCase("f")  || unit.equalsIgnoreCase("c"))
        {
            if(unit.equalsIgnoreCase("f"))
            {
                temp = (5*(temp-32))/9;
            }
            if(temp <= 0)
            {
                System.out.println("The water is solid");
            }
            else if(temp > 0 && temp <= 100 )
            {
                System.out.println("The water is liquid");
            }
            else if(temp >= 100)
            {
                System.out.println("The water is gaseous");
            }
        }   
        else
        {
            System.out.println("Error: unknown unit. Please enter F for Fahrenheit or C for Celsius as a unit for the temperature"); 
            System.exit(0);      
        }
        in.close();
    }
}