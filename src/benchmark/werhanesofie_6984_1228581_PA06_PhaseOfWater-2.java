/**
 * PA06: determines the phase of matter water occupies given the temperature (at sea-level pressure) and scale of measurement (I added kelvin just for fun).
 * @author Lincoln Werhane
 * @version 1
 * @date 2023-03-1
 */

import java.util.InputMismatchException;

import java.util.Scanner;

public class PA06_PhaseOfWater
{
    /**
     * The main method.
     * @param args recieves a series of command-line arguements from the user
     */
    public static void main(String[] args)
    {
        try
        {
            //establishes a scanner, prompts the user to enter a temperature, and stores the input as a variable double temperature
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the temperature: ");
            double temperature = in.nextDouble();
            
            //prompts the user to enter a temperature scale, and stores input as a variable string temperatureScale
            System.out.print("Enter the scale of the temperature (F, C, or K): ");
            String temperatureScale = in.next();
    
            //determines the temperature scale and converts to celcius if necessary, prints an error and exits the program if the temperature scale entered is not valid
            if(temperatureScale.equalsIgnoreCase("F"))
            {
                temperature = (5*(temperature - 32))/9;
            } 
            else if(temperatureScale.equalsIgnoreCase("K"))
            {
                temperature = temperature - 273.15;
            }
            else if(temperatureScale.equalsIgnoreCase("C")){}
            else
            {
                System.out.println('"' + temperatureScale + '"' + " is not a valid temperature scale. Terminating program.");
                System.exit(0);
            }
    
            //prints the phase of water (solid if temperature < 0, liquid if temperature = 0, and gas if temperature > 100)
            if(temperature < 0)
            {
                System.out.println("Water is solid.");
            }
            else if (temperature > 100)
            {
                System.out.println("Water is gaseous.");
            }
            else
            {
                System.out.println("Water is liquid.");
            }
        }
        //catches a possible exception resulting from an unexpected temperature scale being entered
        catch(Exception e)
        {
            System.out.println("The temperature entered is not valid.");
            System.exit(0);
        }
    }
}