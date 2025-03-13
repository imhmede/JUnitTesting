import java.util.Scanner;
public class timeComparison {
	/*
	 * Author: Derek White
	 * Date: 28 September 2022
	 *
	 * Purpose: To compare two times in 24-hour format and compare the differences in hours
	 * and minutes between the two.
	 */
	public static void compute(int t1, int t2){
		int hours = 0;
		int minutes = 0;
		int time = 0;
		int time1 = t1;
		int time2 = t2;
		if(time1 < time2){
			time = time2 - time1;
		}
		/* What's happening in the below else if statement, is if time1 is larger than time2,
		 * we will need to subtract 1200 from it (because it's 12 hours), then subtract the larger
		 * time2 from time1, so it replicates crossing over the 24 hour mark, then readd the 12 to
		 * give us the literal time difference.
		 */
		else if(time1 > time2){
			time = (time2-(time1-1200))+1200;
		}
		hours = time/100;
		minutes = time%100;
		/* The purpose of the below while loop is to catch any left overs from the modulus.
		 * e.g., some calculations would leave the minutes left over as 88, this will
		 * effectively subtract 60 from that number and append one to the hour until complete.
	 	 */
		while(minutes >= 60){
			minutes-=60;
			hours++;
		}
		System.out.println("The time difference is " + hours + " hours, and " + minutes + " minutes.");
	}
	public static void main(String[] args){
		Scanner userinput = new Scanner(System.in); // Setting up user input due to goofy Java Syntax
		System.out.println("Please enter first time in 24-hour format: ");
		int time1 = userinput.nextInt(10); // Enforcing base 10, not really necessary to do this, but it's good practice
		System.out.println("Please enter second time in 24-hour format: ");
		int time2 = userinput.nextInt(10); // Enforcing base 10, not really necessary to do this, but it's good practice.
		compute(time1, time2);

	}
}
