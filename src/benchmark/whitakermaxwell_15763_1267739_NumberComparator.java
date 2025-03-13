/*Max Whitaker
4/3/2023
PA 09*/

import java.util.Scanner;

public class NumberComparator {
    //All the same
    public static boolean allTheSame(double x, double y, double z) {
        return x == y && y == z;
    }
    //All differnt
    public static boolean allDifferent(double x, double y, double z) {
        return x != y && y != z && x != z;
    }
    //Sorted
    public static boolean sorted(double x, double y, double z) {
        if (x <= y && y <= z) {
            return true;
        } else if (x >= y && y >= z) {
            return true;
        } else {
            return false;
        }
    }
    //Asks user for number inputs and stores them
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        //prints out same or differnt depending on input
        if (allTheSame(a, b, c)) {
            System.out.println("All the numbers are the same");
        } else if (allDifferent(a, b, c)) {
            System.out.println("All the numbers are different");
        } 
        //Prints out sorted if numbers are sorted fomr sorted 
        if (sorted(a, b, c)) {
            System.out.println("All the numbers are sorted");
        } 
      
    }
}
