//Autumn Brown; 02-10-23; PA 02

import java.util.Scanner;

public class PA2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters;
        double miles;
        double feet;
        double inches;

        System.out.print("Please enter your measurement in meters: \n");
        meters = in.nextDouble();
        in.close ();

        miles = meters/1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.printf("\nYour measurement in miles: %.6f \n", miles);
        System.out.printf("Your measurement in feet: %.6f \n", feet);
        System.out.printf("Your measurement in inches: %.6f \n", inches);

    }
}