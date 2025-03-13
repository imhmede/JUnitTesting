//Jacob Rogers
//CS 123P
//March 11, 2023

import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter the scale of the temperature: ");
        String unit = scanner.next();
        
        
        if (unit.equalsIgnoreCase("F")) {
            temp = (5.0 / 9.0) * (temp - 32);
        }
        
        if (temp < 0) {
            System.out.println("The water is solid.");
        } else if (temp < 100) {
            System.out.println("The water is liquid.");
        } else {
            System.out.println("The water is a gas.");
        }
    }
}
