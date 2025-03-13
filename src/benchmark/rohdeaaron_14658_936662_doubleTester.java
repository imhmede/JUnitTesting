/* Aaron Rohde - CS123
 * Assignment:  Lab 5a
 * Due:     10/30/2022
 */
import java.util.Scanner;
public class doubleTester {
    /**
     * Gathers user input for running tests against.
     * Checks for are all same, provides average, finds the smallest one,
     * and also if its sorted in ascending order.
     * @param args accept up to three doubles from the runline instead of prompting
     * the user for input.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean promptFirst = true;
        boolean promptSecond = true;
        boolean promptThird = true;
        double first = 0.0;
        double second = 0.0;
        double third = 0.0;
        boolean areSame;
        double overallAverage;
        double smallestOne;
        boolean areSorted;

        /**
         * test for Args and process as needed
         */
        if ( args.length != 0 ) {
            for ( int i = 0; i < args.length; i++) {
                if ( i == 0 ) {
                    first = Double.parseDouble(args[i]);
                    promptFirst = false;
                }
                if ( i == 1 ) {
                    second = Double.parseDouble(args[i]);
                    promptSecond = false;
                }
                if ( i == 2 ) {
                    third = Double.parseDouble(args[i]);
                    promptThird = false;
                }
                // ingore any excess data provided.
            }
        }
        /**
         * Prompt for any numbers not provided on the comnmand line
         */
        if ( promptFirst ) {
            System.out.print("Enter the first double to access: ");
            first = in.nextDouble();
        }
        if ( promptSecond ) {
            System.out.print("Enter the second double to access: ");
            second = in.nextDouble();
        }
        if ( promptThird ) {
            System.out.print("Enter the third double to access: ");
            third = in.nextDouble();
        }
        /**
         * Run all of the functions
         */
        areSame = allTheSame(first, second, third);
        overallAverage = average(first, second, third);
        smallestOne = theSmallest(first, second, third);
        areSorted = sorted(first, second, third);
        /**
         * Return results
         */
        System.out.printf
           ("The numbers tested to 3 decimal places are: %.3f %.3f %.3f %n",
             first, second, third);
        if (areSame) {
            System.out.println("The numbers are all the same.");
        } else {
            System.out.println("The numbers are not all the same.");
        }
        System.out.printf("The average of the numbers is: %.3f %n", 
           overallAverage);
        System.out.printf("The smallest of the numbers is: %.3f %n", 
           smallestOne);
        if (areSorted) {
            System.out.println("The numbers are in ascending order.");
        } else {
            System.out.println("The numbers are not in ascending order.");
        }
    }
    /**
     * Returns true if the arguments are the same, or false otherwise
     * @param x first double to test
     * @param y second double to test
     * @param z third double to test
     * @return
     */
    public static boolean allTheSame(double x, double y, double z) {
        boolean checkResult = false;
        boolean firstPair = false;
        boolean secondPair = false;
        if ( x == y ) {
            firstPair = true;
        }
        if ( y == z ) {
            secondPair = true;
        }
        if ( firstPair && secondPair ) {
            checkResult = true;
        }
        return checkResult;
    }
    /**
     * Returns the average of the arguments
     * @param x first double for average
     * @param y second double for average
     * @param z third double for average
     * @return returns the average of the 3 above doubles
     */
    public static double average(double x, double y, double z) {
        double averageResult;
        averageResult = ( x + y + z ) / 3.0;
        return averageResult;
    }
    /**
     * Returns the smallest of the arguments
     * @param x first double to test
     * @param y second double to test
     * @param z third double to test
     * @return returns double value the smallest input found
     */
    public static double theSmallest(double x, double y, double z) {
        // Assume that x is the smallest value by default
        double smallestResult = x;
        if ( y < smallestResult ) {
            smallestResult = y;
        }
        if ( z < smallestResult ) {
            smallestResult = z;
        }
        return smallestResult;
    }

    /**
     * Returns true if the arguments are sorted, with the smallest one first
     * @param x first double to test
     * @param y second double to test
     * @param z third double to test
     * @return true if sorted smallest to largest
     */
    public static boolean sorted(double x, double y, double z) {
        boolean sortResult = false;
        boolean testFirst = false;
        boolean testSecond = false;
        if ( x <= y && x <= z ) {
            testFirst = true;
        }
        if ( y <= z ) {
            testSecond = true;
        }
        if ( testFirst && testSecond ) {
            sortResult = true;
        }
        return sortResult;
    }
}
