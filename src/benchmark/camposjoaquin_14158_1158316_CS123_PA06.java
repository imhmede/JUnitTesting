/*
Joaquin Campos
02-21-2023
Programming Assignment 04
*/
import java.util.Scanner; // Imports Scanner from java.util
public class CS123_PA06 {
public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // Sets up Scanner
        
        System.out.print("Enter the temperature: ");
        float temp = in.nextFloat(); // Temperature input
        
        System.out.print("Enter the scale of the temperature: ");
        char scale = in.next().charAt(0); // Scale input
        scale = Character.toUpperCase(scale); // Uppercase
        
        if (scale != 'C') { // Testing for not C
            
            if (scale != 'F') { // Testing for not F
                
                System.out.printf("Error: Scale '%s' not recognized. Program terminated.", scale);
                System.exit(0); // In case scale input is not C or F, sends error message and terminates code
            }
            
            temp = (5 * (temp - 32)) / 9; // Conversion from Fahrenheit to Celsius
        }
        
        if (temp < 0) { // Case where water is solid
            System.out.print("The water is solid.");
        }
        
        else if (temp > 100) { // Case where water is gaseous
            System.out.print("The water is gaseous.");
        }
        
        else { // Case where water is liquid
            System.out.print("The water is liquid.");
        }
    }
}