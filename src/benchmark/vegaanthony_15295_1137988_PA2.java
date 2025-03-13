import java.util.Scanner;

public class PA2{

    public static void main(String[] args){
        final double METERS_PER_MILE= 1609;
        final double METERS_PER_FEET= 3.281;
        final double METERS_PER_INCH= 39.37;
        double meters;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a measurement in meters\n");
        meters = in.nextDouble();

        System.out.printf("Convert to Miles : %10.6f\n",meters/METERS_PER_MILE);
        System.out.printf("Convert to Feet : %10.6f\n",meters*METERS_PER_FEET);
        System.out.printf("Convert to Inches : %10.6f\n",meters*METERS_PER_INCH);

    }
}
