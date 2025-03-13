//Mason Herbig
//PS 03
//10.11.23
import java.util.Scanner;
class PS03MHERB  {
    public static void main(String[] args) {
        //variables that hold the value of the 2 numbers
        double number1;
        double number2;
        
        //prompts user to enter 2 numbers, storing those values in the number1 and number2 variables.
        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter the first number.");
            number1 = scan.nextInt();
        System.out.println ("Please enter the second number.");
            number2 = scan.nextInt();
        
        //print sum of 2 numbers
        System.out.println ("The sum of the two numbers is - " + (number1 + number2));
        
        //print difference of 2 numbers
        double largestnumber = Math.max(number1, number2);
        double smallestnumber = Math.min(number1, number2);
        System.out.println ("The difference of the two numbers is - " + (largestnumber - smallestnumber));
        
        //print product of 2 numbers
        System.out.println ("The product of the two numbers is - " + (number1 * number2));
        
        //print average of 2 numbers
        System.out.println ("The average of the two numbers is - " + ((number1 + number2) / 2));
    }
}