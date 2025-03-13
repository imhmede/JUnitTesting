/**
 * This program takes three numeric inputs and then classifies them based on given parameters 
 * @author Daniel Sanchez
 * @version 1
 * Assignment: PA09 methodTest
 * Date: 4/3/2023*/
import java.util.Scanner; //import Scanner
public class methodTest { // class
    /**This method checks to see if all the values are the same 
     * @param double firstNumber, secondNumber, thirdNumber are numeric; and boolean result1
     * @param return returns result1
    */
    public static boolean allTheSame(double firstNumber, double secondNumber, double thirdNumber, boolean result1) //method declared
    {
        result1 = firstNumber == secondNumber && firstNumber == thirdNumber;
        return result1; //return result1
    }
    /**This method checks to see if all the values are different
     * @param double firstNumber, secondNumber, thirdNumber are numeric; and boolean result2
     * @param return returns result2
    */
    public static boolean Alldifferent(double firstNumber, double secondNumber, double thirdNumber, boolean result2) //method declared
    {
        result2 = firstNumber != secondNumber && firstNumber != thirdNumber;
        return result2; //return if true
    }
    /**This method checks to see if all the values are sorted
     * @param double firstNumber, secondNumber, thirdNumber are numeric, and boolean result3
     * @param return returns result3
    */
    public static boolean sorted(double firstNumber, double secondNumber, double thirdNumber, boolean result3) //method declared
    {
        result3 = (firstNumber < secondNumber && secondNumber < thirdNumber) || (firstNumber == secondNumber && firstNumber == thirdNumber);
        return result3; //return if true
    }
    /**This method takes 3 input and runs them through parameters to determine a displayed output
     * @ param Input given three times by user
     * Variables firstNumber, secondNumber, thirdNumber made to contain user input three times
     * if statments run input through parameters to determine status of display
     */
    public static void main(String[] args)// this is the main method

    {
        Scanner in = new Scanner(System.in); //Created scanner object
        System.out.println("enter the first number: "); //Ask for input1
        double firstNumber = in.nextDouble(); //Read input 1
        System.out.println("enter the second number: "); //Ask for input 2
        double secondNumber = in.nextDouble(); //read input 2
        System.out.println("enter the third number: "); //Ask for input3
        double thirdNumber = in.nextDouble(); //read input 3
        if(allTheSame(firstNumber, secondNumber, thirdNumber, true)) //checks if allTheSAme is true
        System.out.println("All the numbers are the same "); // display if all same
        if(Alldifferent(firstNumber, secondNumber, thirdNumber, true)) // checks if Alldifferent is true
        System.out.println("All the numbers are different "); //display if all different
        if(sorted(firstNumber, secondNumber, thirdNumber, true)) // checks if sorted is true
        System.out.println("All the numbers are sorted "); //display if sorted
        in.close(); // closes scanner
    }
}