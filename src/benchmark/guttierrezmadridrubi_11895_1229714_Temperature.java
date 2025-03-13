/* This program calculates if water is a solid, liquid, or gas depending on it's temperature in Celsius
 * If temperature is entered is in Farenheit, it will convert to Celsius and then calculate it's state
 * 
 * @author Rubi Madrid CS123
 * @date 03.16.2023
 * @param A series of if else statements
 * 
 * I have a logic error where if any letter is input besides "c" or "f" it displays an "input invalid" message but it still prints that the water is a solid. 
 * I'm not sure how to use a try catch statement with the if else statements. 
 */

import java.util.Scanner;

public class Temperature
{
    public static void main (String[]args)
    {
        //sets up user input//
        Scanner in = new Scanner (System.in);

        //prompts user to enter temperature//
        System.out.println("Please enter the temperature:");

        //stores user input as float//
        float temperature = in.nextFloat();

        //prompts user to enter the temperature scale//
        System.out.println("Please enter temperature scale:");

        //stores user input as string//
        String tempScale = in.next();

        //sets empty variable to store later conversions//
        float tempCelsius = 0;

        //if Farenheit turns into Celsius//
        if (tempScale.equalsIgnoreCase("F"))
        {
            //stores conversion as tempCelsius variable//
            tempCelsius = (5 * (temperature -32) / 9);
        }

        //if it is already in celsius//
        else if (tempScale.equalsIgnoreCase("C"))
        {
            //saves temperature as tempCelsius//
            tempCelsius = temperature;
        }

        //if another letter is entered //
        else if (!tempScale.equalsIgnoreCase("F") || !tempScale.equalsIgnoreCase("C") ) 
        {
            System.out.println("Invalid input. Please enter C for Celsius or F for Farenheit");
        }

        //if water is below 0 Celsius it will print out "water is solid"//
        if (tempCelsius <= 0)
        {
            System.out.println("The water is a solid.");
        }
        
        //if water is between 0 and 100 degrees celsius it will print out "water is a liquid"//
        else if (tempCelsius >= 0 && tempCelsius <= 100)
        {
            System.out.println("The water is a liquid");
        }

        //if water is above 100 degrees celsius it will print out "water is a gas"//
        else if (tempCelsius > 100)
        {
            System.out.print("The water is a gas");
        }
    }
}