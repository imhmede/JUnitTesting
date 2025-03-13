/**
 * a program to read the temperature given and covert it to celsius 
 * and print whether the water is a solid liquid or gas
 * Samuel Ortiz
 * 16-03-2023
 * */
import java.util.Scanner;
public class WaterStateCalculator
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp= in.nextInt();
		System.out.println("Enter the scale of the temperature");
		String TempType=in.next();
		String F="F";
		String C="C";
		if (TempType.equalsIgnoreCase(F))
		{
		    int resultF= ((temp-32)*5)/9;
		    if(resultF<0)
		    {
		        System.out.println("The Water is a solid");
		    }
		    else if (resultF>0 && resultF<100)
		    {
		        System.out.println("The water is a liquid");
		        
		    }
		    else if(resultF>100)
		    {
		        System.out.println("The water is a gas");
		    }
		    
		}
		if (TempType.equalsIgnoreCase(C))
		{
		    if(temp<0)
		    {
		        System.out.println("The Water is a solid");
		    }
		    else if (temp>0 && temp<100)
		    {
		        System.out.println("The water is a liquid");
		        
		    }
		    else if(temp>100)
		    {
		        System.out.println("The water is a gas");
		    }
		}
		
	}
}
