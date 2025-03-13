public class Main {
    /**
     * This program finds the sum,difference, product and average
     * @author Mwali Kuya
     * October 10th 2023
     */

import java.until.scanner

public class calculator{
    
    /** 
     * This is the main entry point of the program
     * @param args a list of possible arguements passed by the user
     * /
public static void main(string[] args) {
    Scanner in = new scanner(system.in);
    int firstNumber = 0;
    int secondNumber = 0;
    int sum = 0;
    int diff = 0;
    int pro = 0;
    int ave = 0;

    /*Recieving user input */
    System.out.println("Enter the first integer :");
    firstNumber = in.nextInt();
    System.out.println("Enter the second integer :");
    secondNumber = in.nextInt();

    /*computing the sum,difference,product and average */
    sum = firstNumber + secondNumber;
    diff = firstNumber - secondNumber;
    pro = firstNumber * secondNumber;
    ave = firstNumber + secondNumber / 2;

    //output
    system.out.println("sum: " + sum);
    system.out.println("diff: "+ diff);
    system.out.println("pro: "+ pro);
    system.out.println("ave: "+ ave);

    )

}
