import java.util.Scanner;
public class lab2_b
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String timeA, timeB;
        int hourA, hourB, minuteA, minuteB, ansHours, ansMinutes;
        
        // Get user input
        System.out.print("Please enter the first time: ");
        timeA = in.next();
        System.out.printf("%nPlease enter the second time: ");
        timeB = in.next();

        // Convert first pair of String numbers into int
        hourA = Integer.parseInt(timeA.substring(0, 2));
        minuteA = Integer.parseInt(timeA.substring(2));
        
        // Convert second pair of String numbers into int
        hourB = Integer.parseInt(timeB.substring(0, 2));
        minuteB = Integer.parseInt(timeB.substring(2));
        
        // Handle minutes to make posive subtraction (and correct hours)
        if ( minuteA > minuteB )
        {
            minuteB = minuteB + 60;
            hourB = hourB - 1;
        }
        // Handle second time being on next day
        if ( hourA > hourB )
        {
            hourB = hourB + 24;
        }

        // calculate time between
        ansHours = hourB - hourA;
        ansMinutes = minuteB - minuteA;
        System.out.printf("%n%d Hours and %d minutes", ansHours, ansMinutes);

    }
}