/** This program reads a temperature and the letter C for Celcius or F for Fahrenheit.
* @author Schiller Douyon
*/
import java.util.Scanner;
public class readTemperature
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter a temperature value in C:");
Float temperature =(float) in.nextDouble();
if(temperature<=0)
{
System.out.println("Water is solid:");
}
if (temperature>=100)
{
System.out.println("Water is gaseous:");
}
else
{
System.out.println("water is liquid:");
}
System.out.println("Enter a temperature value in F:");
if(temperature<=32)
{
System.out.println("Water is solid:");
}
if(temperature>=212)
{
System.out.println("Water is gaseous:");
}
else
{
System.out.println("Water is liquid:");
}
}
}
