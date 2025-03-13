/*
Agustin Sandoval
CS 123
Lab2_b
ID: 660227619
9-30-22
*/



import java.util.Scanner;

public class MilitaryTMConvert
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);                        // create the scanner object
	    System.out.println("Enter the first Time: ");                    //request for first time
		String inputString = scanner.next();                             // use scanner to collect input
		String subHoursString = inputString.substring(0,2);              // create substring to work with hours and mins seperatly
		String subMinsString = inputString.substring(2,4);
		
		int intHours = Integer.parseInt(subHoursString);                 // substrings are converted to integers to apply math functions and operations
		int intMins = Integer.parseInt(subMinsString);
		
		
		System.out.println("Enter the second time: ");                   // same procces with first time is also applied to second time
		String inputString2 = scanner.next();
		String subHoursString2 = inputString2.substring(0,2);
		String subMinsString2 = inputString2.substring(2,4);
		
		int intHours2 = Integer.parseInt(subHoursString2);
		int intMins2 = Integer.parseInt(subMinsString2);
		
		
		
		int hoursDifference = intHours - intHours2;                      // the difference in hours is computed
		int minsDifference = intMins - intMins2;                         // the difference in min is also computed
        System.out.printf("%d hours and %d mins",Math.abs(hoursDifference),Math.abs(minsDifference));           // the abolute value function is used to display... 
	}                                                                                                           // ...the difference in time
}