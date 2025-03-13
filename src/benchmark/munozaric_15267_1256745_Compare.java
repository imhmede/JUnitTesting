//AricJMunoz
//March30th2023
//PA09

import java.util.Scanner;

class Compare
{
public static void main(String args[])
{
// create object for scanner class
Scanner scan = new Scanner(System.in);

// ask user to enter number 1
System.out.print("Enter number1: ");

// read number 1 from user
double x = scan.nextDouble();

// ask user to enter number 2
System.out.print("Enter number2: ");

// read number 2 from user
double y = scan.nextDouble();

// ask user to enter number 3
System.out.print("Enter number3: ");

// read number 3 from user
double z = scan.nextDouble();

// call methods by passing values x, y, z and print the results
System.out.println("all The Same: "+allTheSame(x,y,z));
System.out.println("all Different: "+allDifferent(x,y,z));
System.out.println("sorted: "+sorted(x,y,z));

}

public static boolean allTheSame(double x, double y, double z)
{
// if x is equals to y and y is equals to z then, all are equal so return true
if(x == y && y == z)
return true;
else
// otherwise return false
return false;
}
public static boolean allDifferent(double x, double y, double z)
{
// if x is not equals to y and y is not equals to z and x is not equals to z, then all are different. so, return true
if(x != y && y != z && x != z)
return true;
else
// otherwise return false
return false;
}
public static boolean sorted(double x, double y, double z)
{
// if x is less than or equals to y, y is less than or equals to z then they are in increasing order. so, return tru
if(x <= y && y <= z)
return true;
else
// otherwise return false
return false;
}
}