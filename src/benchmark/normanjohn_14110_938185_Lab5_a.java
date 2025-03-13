/*
 * John Norman
 * Oct 30 2022
 * CS 123
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_a {

    public static boolean allTheSame(double x, double y, double z) {
        return (x == y && y == z);
    }

    public static double average(double x, double y, double z) {
        return ((x+y+z)/3);   
    }

    
    public static double theSmallest(double x, double y, double z) {
        double small = x;
        if (x < y && x < z) {
            small = x;
        } 
        else if (y < x && y < z) {
            small = y;
        } 
        else if (z < x && z < y){
            small = z;
        }
        return small;
    }

    public static boolean sorted(double x, double y, double z) {
        return (x < y && y < z);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        // double[] numbers = ;
        

        System.out.println("Give me 3 numbers: ");
        for (int i = 0; i < 3; i++) {
            numbers.add(input.nextDouble());
            // numbers[i] = input.nextDouble();
        }
        input.close();

        System.out.println("allTheSame: " + allTheSame( numbers.get(0), 
                                                        numbers.get(1), 
                                                        numbers.get(2)
                                                        ));

        System.out.println("average: " + average(   numbers.get(0), 
                                                    numbers.get(1), 
                                                    numbers.get(2)
                                                    ));

        System.out.println("theSmallest: " + theSmallest(   numbers.get(0), 
                                                            numbers.get(1), 
                                                            numbers.get(2)
                                                            ));

        System.out.println("sorted: " + sorted( numbers.get(0), 
                                                numbers.get(1), 
                                                numbers.get(2)
                                                ));
    }
}
