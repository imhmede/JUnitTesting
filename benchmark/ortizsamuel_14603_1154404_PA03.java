import java.util.Scanner;
public class PA03
{
	public static void main(String[] args) {
		System.out.println("Please enter the first number");
		Scanner in = new Scanner(System.in);
		double firstnum = in.nextDouble();
		System.out.println("Please enter the second number");
		double secondnum = in.nextDouble();
		double sum = firstnum +secondnum;
		double difference = secondnum - firstnum;
		double product = firstnum * secondnum;
		double average = sum / 2;
		System.out.println("The sum of the two numbers is " + sum);
		System.out.println("The difference of the two numbers is " + difference);
		System.out.println("The product of the two numbers is " +product);
		System.out.println("The average of the two numbers is " +average);
	}
}