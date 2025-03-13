//Devon Alonzno 2/12/23 PA2
import java.util.Scanner;
public class PA2
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in); //Scanner method needed for user input
        System.out.println("Enter a measurement in meters: "); 
        float meter_measure=in.nextFloat(); //declaring variable for the user input to be stored
        float miles = meter_measure/(float)1609.0; //declaring variables for math computations and casting the doubles into floats
        float feet = meter_measure*(float)3.281;
        float inches = meter_measure*(float)39.37;
        System.out.println("The measurement in miles is: " + miles); //printing the results
        System.out.println("The measurement in feet is: " + feet);
        System.out.println("The measurement in inches is: " + inches);

    }
}