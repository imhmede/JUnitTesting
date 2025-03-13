import java.util.Scanner;

/* This program will take two numbers, compute the sum and difference, and print it out
@DallanSilver
10/9/23
*/

public class CalculatorPS3 {

// This is my code's entry point 
public static void main(String[] args) {

// entering the first number

Scanner in = new Scanner(System.in);

int FirstNumber = 0;
int SecondNumber = 0;
int Summation = 0;
int Difference = 0;
int Product = 0;
double Average = 0;

//Taking user input

System.out.println("Please enter a number: ");
FirstNumber = in.nextInt();
System.out.println("Please enter another number: ");
SecondNumber = in.nextInt();

//Performing calculations

Summation = FirstNumber + SecondNumber;
Difference = FirstNumber - SecondNumber;
Product = FirstNumber * SecondNumber;
Average = FirstNumber * SecondNumber / 2;

System.out.println("sum: " + Summation);
System.out.println("diff: " + Difference);
System.out.println("product: " + Product);
System.out.println("average: " + Average);

}

}