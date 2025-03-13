//Hunter Crouch
//9/17/2022
//Lab2_a
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int number, Temp,counter=0,digit,countemp=0;
		System.out.println("Enter the Integer: ");
		number=in.nextInt();//Take in integer
		Temp=number;
		
		while(number>0)//Counts how many digits the integer has
		{
		    number=number/10;
		    counter++;
		}
		
		String Num=Integer.toString(Temp);//converts integer to string
		
		while(counter>countemp)//prints each integer position in string with a space between
		{
		    System.out.print(Num.charAt(countemp)+" ");
		    countemp++;
		}
		
		
	}
}
