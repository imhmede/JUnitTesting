import java.util.Scanner;
public class temp {
private static double F = 0;
private static double C = 0;
/**
 * @param args
 */
public static void main(String[] args)
{
 Scanner input = new Scanner (System.in);
 System.out.println("Enter the Temperature: ");
    int temp = input.nextInt();
 System.out.println("Enter the scale of the Temperature: ");
    double scale = input.nextInt();
   if(scale == F)
        C = (5*(temp-32))/9;   

    if(C <=  0)
        System.out.println("The Water is solid ");
    else if(100 <= C)
        System.out.println("The water is gaseous");
    else
        System.out.println("The water is liquid");
   input.close();
}
   
}
