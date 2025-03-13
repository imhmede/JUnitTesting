import java.util.Scanner;
public class create {
    
public static void main(String args[])
{
    Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;
    System.out.print("Enter the first number: ");
     a = scanner.nextDouble();
    System.out.print("Enter the second number: ");
     b = scanner.nextDouble();
    System.out.print("Enter the third number: ");
     c = scanner.nextDouble();
   scanner.close();
 if (a == b && a == c && b == c)
 {
   System.out.println("All the number are the same");
 }

 if (a != b && a != c && b != c)
 {
    System.out.println("All the numbers are different");
 }

  if (a <= b && b <= c )
 {
    System.out.println("All the numbers are sorted");
 }
 
  }
}
