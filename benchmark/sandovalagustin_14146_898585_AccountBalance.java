/*
Agustin Sandoval
Lab1
CS 123
10-1-22
Purpose : program prints the balance of an account after the first, the second, and the third year. 
The account starts with $1,000 and earns 5 percent interest per year.
*/
public class AccountBalance                              // class is initiated
{
	public static void main(String[] args) {              // main fuction is created
		                                                 
		                                                 
		 /* print statement is used to display string which states the account balance 
		 according to each year. print statement also preforms calculations of intrest
		 earned plus initial balance.
		 */
	
        System.out.println("The acount balance after 1 year is: " + (1000 * .05 + 1000));          // The account balance for the first year is displayed.
        System.out.println("The acount balance after 2 year is: " + (1050 * .05 + 1050));          // The math operations to calculate compounded intrest are also preformed in each line.  
        System.out.println("The acount balance after 3 year is: " + (1102.5 * .05 + 1102.5));
		
		
	}
}