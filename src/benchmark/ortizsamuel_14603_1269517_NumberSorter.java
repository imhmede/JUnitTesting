/**
 * a program to read given numbers, sort them, and print if they are the same
 * Samuel Ortiz
 * 04-03-2023
 * */
 import java.util.Scanner;
public class NumberSorter
{
    /**
     * Main Method
     * @param args command line arguments
     * */

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first value");
		double FirstNum = in.nextDouble();
		System.out.println("Enter the second value");
		double SecNum = in.nextDouble();
		System.out.println("Enter the third value");
		double ThirdNum = in.nextDouble();
	    if (AllTheSame(FirstNum, SecNum, ThirdNum))
	    {
	       System.out.println("All the Numbers are the same"); 
	    }
	    else 
	    {
        System.out.println("All The Numbers are different");
	    }
        if (sorted(FirstNum, SecNum, ThirdNum))
        {
            System.out.println("The Numbers are sorted");
            
        }
        else
        {
            System.out.println("The Numbers are not sorted");
        }
	}
	
	/**
	 * Method to check if values are the same
	 * @param FirstNum first value entered
	 * @param SecNum second value entered
	 * @param ThirdNum Third value entered
	 * */
	 public static boolean AllTheSame(double FirstNum, double SecNum, double ThirdNum)
	 {
	     return FirstNum==SecNum && SecNum==ThirdNum;
	 }
	 
    /**
	 * Method to check if values are different
	 * @param FirstNum first value entered
	 * @param SecNum second value entered
	 * @param ThirdNum Third value entered
	 * */
	 public static boolean AllDifferent (double FirstNum, double SecNum, double ThirdNum)
	 {
	     return FirstNum!=SecNum && SecNum!=ThirdNum && FirstNum!=ThirdNum;
	 }
    /**
	 * Method to check if values are 
	 * @param FirstNum first value entered
	 * @param SecNum second value entered
	 * @param ThirdNum Third value entered
	 * */
	 public static boolean sorted(double FirstNum, double SecNum, double ThirdNum)
	 {
	     return FirstNum<= SecNum && ThirdNum>=SecNum;
	 }
}
