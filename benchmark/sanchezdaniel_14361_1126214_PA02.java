//Daniel Sanchez 02/10/23 //
//CS123//
//Assignment: PA02//
import java.util.Scanner;
public class PA02 {  
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a measurement in meters:"); // Ask for input
        String userMeasure = myScan.nextLine();  // Read user input
        myScan.close();
        float number = Integer.parseInt(userMeasure);
        System.out.println("That is this many miles: " + number / 1609);  // Output user input
        System.out.println("That is this many feet: " + number * 3.281);  // Output user input
        System.out.println("That is this many inches: " + number * 39.37);  // Output user input
}
}