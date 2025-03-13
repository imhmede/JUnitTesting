/*
*@author Jay Mancilla
*This program will calculate temperature and detere if water is solid, liquid or gas.
*/

import java.util.Scanner;

public class WaterTemperature {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temp = in.nextDouble();
        
        System.out.print("Enter unit (C/F): ");
        String unit = in.next();
        
        if (unit.equalsIgnoreCase("F")) {
            temp = (5.0 / 9.0) * (temp - 32);  // convert Fahrenheit to Celsius
        }
        
        if (temp < 0) {
            System.out.println("Water is solid.");
        } else if (temp >= 0 && temp <= 100) {
            System.out.println("Water is liquid.");
        } else {
            System.out.println("Water is gaseous.");
        }
    }

}

