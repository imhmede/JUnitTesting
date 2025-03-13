import java.util.Scanner;
public class multiple {
public static void main(String[] args)
{
    System.out.println("Enter a number between 1 and 12: ");
    try (Scanner input = new Scanner(System.in)) {
        int n = input.nextInt();
 for(int i = 0; i <= 12; i++)
        {
          System.out.println(n + " * " + i + " = " + n * i);
        }
    } 
 }
}
