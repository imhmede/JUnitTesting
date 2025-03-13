import java.util.Scanner;
public class PA06_Temperature
{
/**This program takes a temperature and its scale and outputs whether water at that temperature is a solid, liquid, or gas at sea level
 * @author Mercedes Theriault
 * @3-14-2023
*/
    public static void main(String[] args)
    {
        //scanner definition, asking user for temperature, stored as a double to allow metric conversions
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        double originalTemp = in.nextDouble();

        //celsiusTemp will be used to determine the state of the water later
        double celsiusTemp = 0;

        //tempScale is a user generated string which determines which calculations (if any) are used to convert to celsius. Added Kelvin for bit of a personal challenge
        System.out.print("Please enter the temperature scale (Fahrenheit (F), Celsius (C), and Kelvin (K) supported): ");
        String tempScale = in.next();

        //if/else if statements to check what temperature scale is being used, converts to celsius accordingly
        //celsiusTemp is only used to determine the state of water, it is separate from originalTemp, which will be printed at the end
        //each statement updates tempScale to reflect what the user inputed for clarity in the final print statements
        if (tempScale.equalsIgnoreCase("C"))
        {

            celsiusTemp = originalTemp;
            tempScale = "degrees Celsius";
        }
        else if (tempScale.equalsIgnoreCase("F"))
        {
            celsiusTemp = (5*(originalTemp-32))/9;
            tempScale = "degrees Fahrenheit";
        }
        else if (tempScale.equalsIgnoreCase("K"))
        {
            celsiusTemp = originalTemp - 273.15;
            tempScale = "Kelvin";
        }
        //in case an unsuported metric is used, the program will end
        else 
        {
            System.out.print("Invalid temperature scale. Program will end.");
            System.exit(0);
        }

        //set of if statements to determine the state of water using celsiusTemp, prints the user generated temperature/scale and the state of the water
        if (celsiusTemp <= 0)
        {
            System.out.print("Water at " + originalTemp + " " + tempScale + " is solid.");
        }
        else if (celsiusTemp < 100)
        {
            System.out.print("Water at " + originalTemp + " " + tempScale + " is liquid.");
        }
        //since celsiusTemp has to be a double, an additional else if statement is unnecessary. if it is not less than 100, it has to be equal to or greater than 100
        else
        {
            System.out.print("Water at " + originalTemp + " " + tempScale + " is gaseous.");
        }

    }
}
