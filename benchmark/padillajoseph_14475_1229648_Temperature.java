
import java.util.Scanner;


/**
 * CS123_PA06
 * @author Joseph Padilla
 * 3/15/2023
 * The purpose of this program is to determine the state of water 
 * given a user input temperature and scale.
 */



public class Temperature {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        /**
         * The following section will be used to declare and initialize variables according to the user input.
         */
        
        System.out.println("Enter the temperature:");
        float temp = input.nextFloat(); 
       
        System.out.println("Enter the scale of the temperature:");
        String scale = input.next();
        String F = "F";
        
        /**
         * The following if statement will convert the user defined temperature to Celsius if the user defined scale was f or F indicating Fahrenheit. 
         */
        
        if (scale.equalsIgnoreCase(F))
        {
            temp =(5*(temp-32))/9;
        }
        
        /**
         * The following statements will check the user defined temperature (in Celsius) against the conditions in each statement. 
         * The user will receive an output indicating the state of water given the conditions provided. 
         */
        
        if (temp < 0){
            System.out.println("The water is solid.");
        } else if(0<=temp && temp<=100){
            System.out.println("The water is liquid.");
        } else {
            System.out.println("The water is in gaseous form.");
        }
    }
}
