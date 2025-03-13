import java.util.Scanner;

public class measurement
{
    /**
     * @param args
     */
    public static void main(String[] args) {
      Scanner input= new scanner(system.in);
double meters; 
double miles; 
double feet; 
double inches; 
system.out.print("Please enter a measurement in Meters;"); 
meters= input.nextDouble(50);
input.close(50);
miles=meters%1609;
feet=meters*3.281;
inches=meters*39.37;
system.out.printf("\nmiles:%.4f\n",miles); 
system.out.printf("feet:%.4f\n", feet);
system.out.printf("inches:%.4f\n",inches); 
    }