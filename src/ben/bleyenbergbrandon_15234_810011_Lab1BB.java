// Brandon Bleyenberg
// 9-5-2022
// Lab 1

//Calculating the new balance of an account with interest over a 3 year period

public class Lab1BB 
{

	public static void main(String[] args) {
	     
	    //Initialize the variables
	    double balance = 1000, interest = 5;
	    int years = 0;
	    
	    //Conditional statement
	    while(years < 3) {
	        
	        //Calculating new balance with interest
	        balance = balance * (1 + interest/100);
	        years++;
	        
	        //Print out command
	        System.out.println("Year:" + years + " Balance:$" + balance);
	    }
	}
}
