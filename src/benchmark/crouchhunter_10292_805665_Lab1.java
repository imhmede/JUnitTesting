//Name:Hunter Crouch
//Date:9/3/2022
//CS123 Lab 1

public class Main
{
	public static void main(String[] args) {
	    //Set base value for the Balance of the account
		Double Bal=1000.00;/
		//Calculate a 5 percent increase on the balance and print with two decimals for the first year
		Bal=Bal*1.05;
		System.out.printf("First year balance: %.2f$\n",Bal);
		//Calculate a 5 percent increase on the balance and print with two decimals for the second year
		Bal=Bal*1.05;
		System.out.printf("Second year balance: %.2f$\n",Bal);
		//Calculate a 5 percent increase on the balance and print with two decimals for the third year
		Bal=Bal*1.05;
		System.out.printf("Third year balance: %.2f$\n",Bal);
	}
}
