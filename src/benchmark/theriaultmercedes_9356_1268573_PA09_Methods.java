import java.util.Scanner;
/**
 * This program takes three numeric values and checks if they are different or the same then checks if they are sorted from least to greatest
 * @author Mercedes Theriault
 * @since 3-28-2023
 */
public class PA09_Methods 
{   
    /**
     * This method checks if x, y, and z are the same value
     * @param x    the first user generated double
     * @param y    the second user generated double
     * @param z    the third user generated double
     * @return     boolean value, true if x, y, and z, are the same value
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        //set to false by default
        boolean isSame = false;
        if (x==y && y==z)
        {
            isSame = true;
        }
        return isSame;
    }

    /**
     * This method checks if x, y, and z are different values
     * @param x    the first user generated double
     * @param y    the second user generated double
     * @param z    the third user generated double
     * @return     boolean value, true if x, y, and z, are not the same value
     */
    public static boolean allDifferent(double x, double y, double z)
    {
        //uses || instead of &&, only one value has to be different to return true
        boolean isDifferent = false;
        if (x!=y || y!=z)
        {
            isDifferent = true;
        }
        return isDifferent;
    }

    /**
     * This method checks if x, y, and z are sorted from least to greatest
     * @param x    the first user generated double
     * @param y    the second user generated double
     * @param z    the third user generated double
     * @return     boolean value, true if x, y, and z, are sorted
     */
    public static boolean sorted(double x, double y, double z)
    {
        boolean isSorted = false;
        if (x<=y && y<=z)
        {
            isSorted = true;
        }
        return isSorted;
    }

    /**
     * This is the main method that asks the user for the numbers and calls the methods allTheSame() allDifferent() and sorted()
     * @param args a list of command-line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double firstNum = in.nextDouble();

        System.out.print("Please enter the second number: ");
        double secondNum = in.nextDouble();

        System.out.print("Please enter the third number: ");
        double thirdNum = in.nextDouble();

        if(allTheSame(firstNum, secondNum, thirdNum) == true)
        {
            System.out.println("All the numbers are the same.");
        }

        if(allDifferent(firstNum, secondNum, thirdNum) == true)
        {
            System.out.println("All the numbers are different.");
        }

        if(sorted(firstNum, secondNum, thirdNum) == true)
        {
            System.out.println("All the numbers are sorted.");
        }
        else
        {
            System.out.println("The numbers are not sorted");
        }
    }
}
