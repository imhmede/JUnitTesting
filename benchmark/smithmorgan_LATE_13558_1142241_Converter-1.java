import java.util.Scanner;

public class Converter
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter a measurement in meters"); //This prompts user input//
        Scanner in = new Scanner(System.in); //The scanner allows java to read new info put in by the user//
        double meters = in.nextDouble();
        System.out.printf("The measurement in miles is %.2f\n ", meters / 1609);
        System.out.printf("The measurement in feet is %.2f\n ", meters * 3.281);
        System.out.printf("The measurement in inches is %.2f\n ", meters * 39.37);
    }
}
