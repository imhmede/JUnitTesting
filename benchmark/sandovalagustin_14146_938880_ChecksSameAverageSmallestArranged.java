/**
Agustin Sandoval
Lab_5a
10-30-22
CS 123
Purpose: This program uses the main function to call 4 other functions. the first function (a) determines if three inputs are the same
the second function (b) returns the average of three arguments. The third function (c) returns the smallest value out of three arguments.
the fourth function (d) checks if three arguments are arranged from smallest to greatest, from left to right.
*/
public class ChecksSameAverageSmallestArranged 
{
	public static void main(String[] args)
	{
		System.out.println(allTheSame(3.0, 7.0, 9.0));				// all methods are called
		System.out.println(average(3.0, 7.0, 9.0));
		System.out.println(theSmallest(3.0, 7.0, 9.0));
		System.out.println(sorted(3.0, 7.0, 9.0));
	}
	
	/**
	Takes three doubles and checks if they are the same
	@param double x a double that will be checked if the same to the other arguments
	@param double y a double that will be checked if the same to the other arguments
	@param double z a double that will be checked if the same to the other arguments
	@return same a boolean value of true or false, true being the same and false being the latter 
	*/
	public static boolean allTheSame(double x, double y, double z)			// method (a)
	{
		boolean same;														// same will be either false or true		
		if ( x == y && x == z)												// compares first double to the second and third double
		{
			same = true;													// if the condition is true the boolean value for "same" will be true
		}
		else																
		{
			same = false;													// if the else condition is met the boolean value for "same" will be false
		}
			
		return same;														// boolean value is returned representing if all values are the same
	}
	
	/**
	Takes three doubles and gets their average
	@param double x a double that will be used to get an average
	@param double y a double that will be used to get an average
	@param double z a double that will be used to get an average
	@return average a double that represents the average of of the arguments 
	*/
	public static double average(double x, double y, double z)				// method (b)
	{
		double average = (x + y + z) / 3;									// the basic math operation to compute the average is performed using all..
																			//...three arguments and stored as a double "average"
		return average;														// average is returned
	}
	
	/**
	Takes three doubles and lists the smallest value entered
	@param double x a double that will be compared to other arguments 
	@param double y a double that will be compared to other arguments
	@param double z a double that will be compared to other arguments
	@return smallest a double that represents the smallest of all three arguments 
	*/
	public static double theSmallest(double x, double y, double z)			// method (c)
	{
		double smallest;													// will hold smallest value		
		if ( x < y && x < z)												// compares the first argument to the other 2 to see if smaller
		{
			smallest = x;													// if so the value is stored in "smallest"
		}
		else if ( y < x && y < z)											// second argument is checked if smaller than first and third argument
		{
			smallest = y;													// if so than its value is stored in"smallest"
		}
		else																// same procces is preformed for las argument
		{
			smallest = z;
		}
		
		return smallest;													// smallest double is returned
	}
	
	/**
	Takes three doubles and checks if sorted from smallest to biggest from left to right
	@param double x a double that will be checked if in order
	@param double y a double that will be checked if in order
	@param double z a double that will be checked if in order
	@return sorted a boolean value that indicates true if sorted and false if not 
	*/
    public static boolean sorted(double x, double y, double z)				// method (d)
	{
		boolean sorted;														// sorted will either hold a value of false or true
		if ( x <= y && y <= z)												// arguments are in order if the first argument is smaller...
		{																	//...than the second and if second argument is smaller than the...
			sorted = true;													//...third
		}
		else
		{
			sorted = false;
		}
		
		
		return sorted;														// boolean "sorted' is returned indicating if true if sorted 
	}	
}
    