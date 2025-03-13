/** Devon Alonzo
660259237
*/
import java.util.Scanner; //Importing scanner method
public class PA3
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in); //creating scanner object
        System.out.println("Please enter a number");
        int firstNum= in.nextInt();                         //storing user input values into variables
        System.out.println("Please enter a second number");
        int secondNum=in.nextInt();

        int sum = firstNum + secondNum; //doing the math calculations for sum, difference, and average
        int difference= firstNum - secondNum;
        int product= firstNum * secondNum;
        System.out.println("The sum of the two numbers is " + sum);
        System.out.println("The difference of the two numbers is " + difference);
        System.out.println("The product of the two numbers is " + product);
        System.out.println("The average of the two numbers is " + sum/2);
    }
}