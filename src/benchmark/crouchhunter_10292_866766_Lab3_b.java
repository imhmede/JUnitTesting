//Hunter Crouch
//10/01/2022
//Lab3_b
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integers:");//takes in integers one at a time
		int first = in.nextInt();
	    int second = in.nextInt();
		int third = in.nextInt();
		if(second>=first)//Check if numbers increase in order
		{
		    if(third>=second)
		    {
		        System.out.println("In Order");
		        System.exit(0);
		    }
		    
		}
		
		if(second<=first)//checks if numbers decrease in order
		{
		    if(third<=second)
		    {
		        System.out.println("In Order");
		        System.exit(0);
		    }       
	    }
		   
		 System.out.println("Not in order");//prints only if not in order
		
	}
}