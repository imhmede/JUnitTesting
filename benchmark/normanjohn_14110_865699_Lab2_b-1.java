/*
 * John Norman
 * Sept 30 2022
 * CS 123
 */

import java.util.Scanner;

public class Lab2_b {

    public static double convertmin2hr(int num) {
        
        while (num % 100 > 60) {
            num = num - 60 + 100;
        }
        double result = num /= .6;
        double minutes = (result % 100) * .6;
        result = result - (result % 100) + minutes;
        
        return result;
    }
    
    public static int converthr2min(int num) {
        int hours = num /100;
        int minutes = hours * 60;
        int total = minutes + (num % 100);

        // System.out.println("The total is: " + total);
        return total;
    }

    public static int subtract(int small, int big) {
        int difference = converthr2min(big) - converthr2min(small);
        // System.out.println("The difference is: " + difference);
        return difference;
    }
    
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        
        System.out.println("Please enter the first time: ");
        int first = time.nextInt();

        System.out.println("Please enter the second time: ");
        int second = time.nextInt();

        time.close();


        int ans = 0;
        if (first > second) {

            System.out.println("Next Day!");
            
            ans = subtract(second, first);

            ans = 1440 - ans;
        }
        else ans = subtract(first, second);

        double result = convertmin2hr(ans);

        int hours = (int)result / 100, minutes = (int)result % 100;


        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}