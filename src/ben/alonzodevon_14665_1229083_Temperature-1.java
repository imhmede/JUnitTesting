/**This program tells the user if water is a solid liquid or a gas depending on the temperature the user inputs*/
import java.util.Scanner;
public class Temperature
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = in.nextInt();
        System.out.println("Enter the scale of the Temperature using 'F' or 'C': ");
        String scaleOfTemp = in.next();
        
        if (scaleOfTemp.equals("F")) //if statement to see if the user puts F to conver to celsius temperature
        {
            temp = 5*(temp - 32)/9;
        }

        if(temp >= 0 && temp <= 100) //if statements and else if statements to determine if the temperature is a solid, liquid, or gas
        {
            System.out.println("The water is a liquid");
        }
        else if(temp < 0)
        {
            System.out.println("The water is a solid");
        }
        else
        {
            System.out.println("The water is a gas");
        }
    }
}