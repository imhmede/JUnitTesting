//Hunter Crouch
//9/17/2022
//Lab2_b
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int firtm, sectm, ostM, sndM ,diff;
	    
		System.out.println("Please enter the first time: ");//takes input for times
		firtm = in.nextInt();
		System.out.println("Please enter the second time: ");
		sectm = in.nextInt();
		
		ostM = (firtm/100)*60 + firtm%100;//convert 1st and 2nd into minutes
		sndM = (sectm/100)*60 + sectm%100;
		
		diff = (sndM+ 1440 - ostM)%1440;//adding 24 hours to the first time and taking the remainder after fixes the issue with smaller time first
		
		System.out.println(diff/60+" hours and "+diff%60+" minutes");//prints out result of the programs calculations.
	}
}
