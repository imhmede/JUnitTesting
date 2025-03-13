import java.util.Scanner;

public class PA02
{
    public static void main(String[] args)
{
    System.out.println("Meters to Miles/feet/inches Calculator");
    System.out.println();
    //* Read in Length in Meters */
    
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter Length in meters below: ");
    System.out.println("");
    double meter = in.nextDouble();

    //*Declare math variables */

    final int mconstant = 1609;
    final double ftconstant = 3.281;
    final double inconstant = 39.37;
    double miles;
    double feet;
    double inches;

    //*meters to miles algorithm */
    miles = meter/mconstant;

    //*meters to feet algorithm */

    feet = meter * ftconstant;

    //*meters to inches algorithm */

    inches = meter * inconstant;

    //* Print the conversion results on screen */

    System.out.printf ("The Measurement in Miles: %.6f " ,miles);
    System.out.println();
    System.out.printf("The Measurement in Feet: %.6f", feet);
    System.out.println();
    System.out.printf("The Measurement in inches: %.6f", inches);
    System.out.println();






}
}








