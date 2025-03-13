//Andrew_Boese_Oct_11_PS_03
import java.util.Scanner;  //Import the Scanner class
public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);     //Create scanner object

        System.out.println("Enter the first number:");      //Prompt the user to enter num_1
        int num_1 = n.nextInt();    //Input for num_1

        System.out.println("Enter the second number:");      //Prompt the user to enter num_2
        int num_2 = n.nextInt();    //Input for num_2

        int sum = num_1+num_2;      //Add num_1 and num_2
        System.out.println("The sum of the two numbers is " + sum);      //Shows the user the sum of num_1 and num_2

        int difference = Math.abs(num_1-num_2);     //finds the difference between num_1 and num_2
        System.out.println("The difference between the two numbers is "+ difference);      //Shows the user the difference of num_1 and num_2

        int product = num_1*num_2;      //multiplies of num_1 and num_2
        System.out.println("The product of the two numbers is " + product);      //Shows the user the product of num_1 and num_2

        float average = sum/2;      //average of num_1 and num_2
        System.out.println("The average is " + average);      //Shows the user the average of num_1 and num_2

    }
}
