//Werhane, PA02, 2023.02.09

//First we must import the scanner that we will later use to get user input.
import java.util.Scanner;

//Then we can establish the class and method.
public class PA02{
    public static void main(String[] args){
        //Next, we prompt the user for input.
        System.out.println("Please enter a measurement in meters:");

        //We can then create a scanner and assign the inputed value to a variable.
        Scanner in = new Scanner(System.in);
        double mLength = in.nextDouble(); //This variable stores the inputed value in meters.
        /*The input could easily be a non-integer, and I'm not particular worried about using up memory with this
        so using double should allow for a high degree of accuracy in the calculations*/

        //MATH TIME!!!
        double miLength = mLength/1609;
        double ftLength = mLength*3.281;
        double inLength = mLength*39.37;
        //These convert the distance in meters to miles, feet, and inches and store them as variables so they may be recalled later.

        //Printing the results.
        System.out.println("The measurement in miles: " + miLength);
        System.out.println("The measurement in feet: " + ftLength);
        System.out.println("The measurement in inches: " + inLength);
    }
} 
