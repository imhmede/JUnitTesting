import java.util.Scanner;

public class main
   {
    public static void main(String[] args)
    {
   
Scanner input = new Scanner(System.in);
 double meters;
 double miles;
 double feet;
 double inches;
   System.out.print("Please enter a measurement in meters: ");
   meters = input.nextDouble();
   input.close();
   miles = meters / 1609;
   feet = meters * 3.281;
   inches = meters * 39.37;
System.out.printf("\nThe measurement in miles:%.4f\n", miles);
System.out.printf("\nThe measurement in feet:%.4f\n", feet);
System.out.printf("\nThe measurement in inches:%.4f\n", inches);
    }

   }
