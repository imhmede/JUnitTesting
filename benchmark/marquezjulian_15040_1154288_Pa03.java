import java.util.Scanner;
public class Pa03{ 
    public static void main(String args[]){
        System.out.println("Enter the first number:");
        Scanner user = new Scanner(System.in);
        
        int number1 = user.nextInt();

        System.out.println("Enter the second number:");

        int number2 = user.nextInt();

        int sum = number1+number2;
        int difference = number1-number2;
        int product = number1*number2;
        double average = (number1+number2)/2;

        System.out.println("The sum of the 2 numbers is "+ sum);
        System.out.println("The difference between the 2 numbers is "+ difference);
        System.out.println("The product of the 2 numbers is "+ product);
        System.out.println("The average is "+ average);


    }
}