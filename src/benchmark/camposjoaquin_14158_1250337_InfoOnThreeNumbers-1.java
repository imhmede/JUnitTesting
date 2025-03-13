/*
Joaquin Campos
03-28-2023
Programming Assignment 09
*/
import java.util.Scanner; // Imports Scanner from java.util
public class InfoOnThreeNumbers {
    
    static boolean allTheSame(double x, double y, double z) { // Defines function allTheSame
	        
	        if ((x == y) && (y == z)) {
	            return true; // If x = y = z, return true
	        }
	        
	        else { // Otherwise, return false
	            return false;
	        }
	}
	
	static boolean allDifferent(double x, double y, double z) { // Defines function allDifferent
	        
	        if ((x == y) || (x == z) || (y == z)) {
	            return false; // If x = y or y = z or x = z, return false
	        }
	        
	        else { // Otherwise, return true
	            return true;
	        }
	}
	
	static boolean sorted(double x, double y, double z) { // Defines function sorted
	        
	        if ((x <= y) && (y <= z)) { // If x <= y and y <= z, return true
	            return true;
	        }
	        
	        else { // Otherwise, return false
	            return false;
	        }
	}
	    
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in); // Defines Scanner in
	    
	    System.out.print("Enter the first number: ");
	    double x = in.nextDouble(); // Awaits input
	    
	    System.out.print("Enter the second number: ");
	    double y = in.nextDouble(); // Awaits input
	    
	    System.out.print("Enter the third number: ");
	    double z = in.nextDouble(); // Awaits input
	    
	    if (allTheSame(x, y, z)) { // Executes allTheSame, prints success message
	        System.out.println("All the numbers are the same.");
	    }
	    
	    if (allDifferent(x, y, z)) { // Executes allDifferent, prints success message
	        System.out.println("All the numbers are different.");
	    }
	    
	    if(sorted(x, y, z)) { // Executes sorted, prints success message
	        System.out.println("All the numbers are sorted.");
	    }
	}
	
}
