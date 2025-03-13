import java.util.Scanner;

public class pa2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.print("Enter a measurement in meters: ");
      double meters = input.nextDouble();

      double miles = meters * 0.000621371;
      double feet = meters * 3.28084;
      double inches = meters * 39.3701;

      System.out.println("The measurement in miles: " + miles);
      System.out.println("The measurement in feet: " + feet);
      System.out.println("The measurement in inches: " + inches);
    } finally {
      input.close();
    }
  }
}
