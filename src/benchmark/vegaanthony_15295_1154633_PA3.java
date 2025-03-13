import java.util.Scanner;
public class PA3{
   
    public static void main(String[] args)   
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int firstInt = in.nextInt();
    System.out.print("Enter the second number: ");
    int secondInt = in.nextInt();
    System.out.printf("The sum of two integers: %d%n", firstInt + secondInt);
    System.out.printf("The difference of two integers: %d%n", secondInt - firstInt);
    System.out.printf("The product of two integers: %d%n", firstInt * secondInt);
    System.out.printf("The average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
    




}}
