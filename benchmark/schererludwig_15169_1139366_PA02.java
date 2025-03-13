import java.util.Scanner;

public class PA02 
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a measurement in meter: ");
        Scanner in = new Scanner(System.in); 
        float numberOfMeters = in.nextFloat();
        System.out.print("The measurement in miles: ");
        System.out.printf("%f%n", numberOfMeters / 1609);
        System.out.print("The measurement in feet: ");
        System.out.printf("%f%n", numberOfMeters * 3.281);
        System.out.print("The measurement in inches: ");
        System.out.printf("%f%n", numberOfMeters * 39.37);
        in.close();
    }
    
}

