/**
 * Class (CS 123) This program tells the user if water is solid, liquid, or gas at a specific temperature (C and F)
 * @author Bonny Vigil
 * @date 2/28/2023
 */

import java.util.Scanner;

public class PA_06_StatesOfWater
{
    /**
     * Main Method 
     * @param args  user inputs a temperature and the letter for either Celcius or Fahrenheit, program outputs the state of water (solid, liquid, or gas)
     */
    public static void main(String[] args)
    {
        System.out.println("Enter the temperature: "); //Asks user to input the number that represents the temperature.

        Scanner in = new Scanner(System.in);
        double temperatureUndeclared = in.nextDouble(); //These two lines take in the double (temperature).

        System.out.println("Enter the scale of the temperature (F or C): "); //This asks the user for what scale the user iss using (C or F).

        in = new Scanner(System.in);
        String scale = in.next(); //These two lines input the scale.
       
            if (scale.equalsIgnoreCase("F")) //This if statement says that if the scale is F, a conversion to C needs to occur
            {
                double temperatureCelcius = (5*(temperatureUndeclared - 32))/9.0;  //This is the conversion mentioned above (F --> C)
               
                System.out.print("The water is "); //This outputs the phrase to begin the statement describing the water

                 if(temperatureCelcius < 0) //This is an if statement checks for solid matter
                {
                    System.out.println("solid");
                }
     
                else if(temperatureCelcius >= 0 && temperatureCelcius <=100) //This if statement checks for liquid matter
                {
                    System.out.println("liquid");
                }
                else //This is to indicate gas matter
                {
                    System.out.println("gas");
                }
            }
            else if(scale.equalsIgnoreCase("C")) //This else if statement is for a scale of C
            {
                double temperatureCelcius = temperatureUndeclared;
                
                System.out.print("The water is "); //This outputs the phrase to begin the statement describing the water

                if(temperatureCelcius < 0) //This is an if statement checks for solid matter
                {
                    System.out.println("solid"); 
                }
     
                else if(temperatureCelcius >= 0 && temperatureCelcius <=100) //This if statement checks for liquid matter
                {
                    System.out.println("liquid"); 
                }
                else  //This is to indicate gas matter
                {
                System.out.println("gas"); 
                }
            }  

    }
        
    
}
    
    
    