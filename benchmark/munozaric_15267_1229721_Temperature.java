import java.util.*;
public class Temperature
{

public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.print("Enter the temperature : "); //prompt for temperature
double temp = scn.nextDouble();
System.out.print("Enter C(for Celcius) OR F(for Fahrenheit) : "); //prompt for unit
char unit = scn.next().charAt(0);

if((unit == 'C' && temp <=0) || (unit == 'F' && temp <=32)){
System.out.println("The state is Solid(ice).");
}

else if((unit == 'C' && temp >=100) || (unit == 'F' && temp >=212)){
System.out.println("The state is Gas.");
}

else{
System.out.println("The state is Liquid.");
}
}
}