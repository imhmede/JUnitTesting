//CS123 Sp2023 PA02
//Mercedes Theriault
import java.util.Scanner;
public class PA02_UserInput
{
    public static void main(String[] args)
    {
        //takes a user inputed # and assigns it to a variable "meters"
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a measurement in meters: ");
        final int meters = in.nextInt();

        //takes the meters variable and does the necessary computations to convert to other units, names/assigns appropriately
        //there was an issue with rounding in the output as miles as a double, so i casted with (float) for all for consistency
        float miles = (float) (meters / 1609.00);
        float feet = (float) (meters * 3.281);
        float inches = (float) (meters * 39.37);

        //prints the numerical value of the conversions as well as strings denoting the unit type
        //repeats the original input for clarification 
        System.out.println(meters + " meters to miles: " + miles);
        System.out.println(meters + " meters to feet: " + feet);
        System.out.println(meters + " meters to inches: " + inches);
    }
}