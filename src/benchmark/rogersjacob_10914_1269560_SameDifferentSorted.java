//Jacob Rogers
//CS 123P
//April 3, 2023

import java.util.Scanner;
public class SameDifferentSorted{
	
	static boolean allTheSame(double x, double y, double z){
	    if (x == y && y == z)	
	        return true;
	    else 
	        return false;
	    
	}
	
	static boolean allDifferent(double x, double y, double z){
	    if (x!=y && y!=z)	
	        return true;
        else
            return false;
	}
	
	static boolean sorted(double x, double y, double z){
	    if (x<=y && y<=z)	
	        return true;
	    else
	        return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double x = sc.nextDouble();	
		System.out.println("Enter the second number:");
		double y = sc.nextDouble();
		System.out.println("Enter the third number:");
		double z = sc.nextDouble();
		
		if(allTheSame(x,y,z))	
		    System.out.println("All the numbers are the same");
		if(allDifferent(x,y,z))	
		    System.out.println("All the numbers are different");
		if(sorted(x,y,z))	
		    System.out.println("All the numbers are sorted");
	}
}
  
