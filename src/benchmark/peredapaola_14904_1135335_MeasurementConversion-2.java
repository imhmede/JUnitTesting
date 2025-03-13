/* Paola Pereda, February 13, 2022, PA 02 */
import java.util.Scanner;

public class MeasurementConversion
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a measurement in meters.");
    int measurement = in.nextInt();
    float miles = measurement / (float) 1609;
    double feet = measurement * 3.281;
    double inches = measurement * 39.37;
    System.out.println("In miles:");
    System.out.println(miles);
    System.out.println("In feet:");
    System.out.println(feet);
    System.out.println("In inches:");
    System.out.println(inches);
    }


    
}