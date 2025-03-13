import java.util.*;
public class PA_02_Measurement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input from user
        System.out.println("Please enter a measurement in meters: ");
        double meters = sc.nextDouble();
        
        // Declaring variables
        double miles,feet,inches;
        
        // Convert measurements from meters
        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;
        
        // Print output
        System.out.printf("The measurement in miles: %.6f\n", miles);
        System.out.printf("The measurement in feet: %.6f\n", feet);
        System.out.printf("The measurement in inches: %.6f\n", inches);
    }
}
