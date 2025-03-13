/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *Class CS123
 * @author Joseph Padilla
 * 2/15/2023
 */
import java.util.Scanner;

public class Measurement {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Please enter a measurement in meters:");
        Float num;
        num = input.nextFloat();
        
        final float m2m = 1609f; //Constant to convert meters to miles
        final float m2f = 3.281f; //Constant to conver meters to feet
        final float m2i = 39.37f; // Constant to convert meters to inches
        
        float miles = num / m2m;
        float feet = num * m2f;
        float inches = num * m2i;
        
        System.out.printf("The measurement in miles: %.6f %n", miles);
        System.out.printf("The measurement in feet: %.6f %n", feet);
        System.out.printf("The measurement in inches: %.6f %n",inches);
    }
}
