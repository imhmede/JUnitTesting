import java.util.Scanner;
public class range1To12
{
public static void main(String[] args)
{
Scanner in = new Scanner (System.in);
//take input from user 
System.out.println("please Enter a number ranging in 1 to 12:");
int num = in.nextInt();
//check validity of number range 1 to 12 and print error if out of range
If(num<1 || num>12);
{
System.out.println("Number is out of range 1-12");
}

//function to print table
public static void printMultiplicationTable(int Num)
{
System.out.println("Multiplication Table of "+num);
for (int i=1; i<=10; i++)
{
System.out.println(num+"X "+i+" = "+(num*i));
}
}
}
