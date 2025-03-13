public class Labone 
{

	public static void main(String[] args) 
	{
		double balance = 1000;  //stating balance
		double interest = .05;  //interest rate
		
		double interest_year_one = balance * interest; //interest on initial 1000
		
		balance += interest_year_one; //add balance plus interest
		System.out.println("Balance fore year 1 is " + balance);  //prints new total bal
		
		
		double interest_second_year = balance * interest;
		balance += interest_second_year;
		System.out.println("Balance for year 2 is " + balance); // same as above, just for second year
		
		
		double interest_third_year = balance * interest;
		balance += interest_third_year;
		System.out.println("Balance for year 3 is " + balance); // same as above, just for second year
	}
}
