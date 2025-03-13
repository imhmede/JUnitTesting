/**
 * 
 * @author jmancilla
 * @returns nothing
 * @ This program checks argument based on a inputed number
 */
import java.util.Scanner;

public class Lab09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = in.nextInt();
		
		System.out.println("Enter the second number: ");
		int y = in.nextInt();
		
		System.out.println("Enter the third number: ");
		int z = in.nextInt();
		
		 // checks true or false for variables
	    boolean allTheSame = allTheSame(x,y,z);
	    System.out.println(allTheSame);
	    
	    //checks true or false in numbers are sorted with smallest first
	   boolean inputSorted = sorted(x,y,z);
	   System.out.println(inputSorted);
		}
	
	  // Method to check if all three numbers are the same
	  public static boolean allTheSame(double x, double y, double z) {
	    return x == y && y == z;
	    
	  }
	  
	  // Method to check if all three numbers are different
	  public static boolean allDifferent(double x, double y, double z) {
	    return x != y && y != z && x != z;
	  }
	  
	  // Method to check if the three numbers are sorted in ascending order
	  public static boolean sorted(double x, double y, double z) {
	    return x < y && y < z;
	    }
}
	
	
	
	