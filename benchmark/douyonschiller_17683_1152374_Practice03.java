import java.util.Scanner;
public class Practice03
{
public static void main(String[] args)
{
Scanner sc 5= new Scanner(System.in);
int num1;
int num2;
System.out.print("Enter first number:");
num1 = sc.nextInt();
System.out.print("Enter second number:");
num2 = sc.nextInt();
System.out.println("Sum= "+(num1+num2));
System.out.println("Difference= "+(num1-num2));
System.out.println("Product= "+(num1*num2));
System.out.println("Average= "+(num1+num2)/2);
}
}
