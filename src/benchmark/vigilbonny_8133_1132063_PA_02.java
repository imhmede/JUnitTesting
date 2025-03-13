// Bonny Vigil, 2/7/23, PA_02 //

import java.util.Scanner;

public class PA_02 {
    
    
    public static void main(String[] args)
    {
        System.out.print("Please enter a measurement in meters: ");
        Scanner in = new Scanner(System.in);
        float measurementMeters = in.nextFloat();  /** This takes in the measurement in a float.  The input can be a float or integer. */

        System.out.println(measurementMeters);
        
        double measurementMiles = (double)measurementMeters / 1609; /** Converts meters to miles. */
        System.out.println("The measurement in miles: " + measurementMiles);

        double measurementFeet = (double)measurementMeters * 3.281; /** Converts meters to feet. */
        System.out.println("The measurement in feet: " + measurementFeet);

        double measurementInches = (double)measurementMeters * 39.378; /** Converts meters to inches. */
        System.out.println("The measurement in inches: " + measurementInches);
    }
}
