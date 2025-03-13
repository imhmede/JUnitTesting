/**This program takes 3 numbers and compares them and tells the user if they are all the same, all different, or sorted in order
 * @author Devon Alonzo
 * @2023-04-02 17:53:01
 */
import java.util.Scanner;
public class comparingNumbers
{
    /** This method compares all three numbers and returns true if all of them are the same
     * @param   x   a double value
     * @param   y   a double value
     * @param   z   a double value
     * @return  returning the true if all the numbers are the same
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        if(x == y && x == z && y == z)
        {
            return true;
        }
        return false;
    }
     /** This method compares all three numbers and returns true if all of them are different
     * @param   x   a double value
     * @param   y   a double value
     * @param   z   a double value
     * @return  returning the true if all the numbers are different
     */
    public static boolean allDifferent(double x, double y, double z)
    {
        if(x != y && x != y && y != z)
        {
            return true;
        }
        return false;
    }
     /** This method compares all three numbers and returns true if the numbers are sorted
     * @param   x   a double value
     * @param   y   a double value
     * @param   z   a double value
     * @return  returning the true if all are sorted
     */
    public static boolean sorted(double x, double y, double z)
    {
        if(x < y && y < z || x > y && x > y)
        {
            return true;
        }
        return false;
    }
    /**This is the main method
     * @param   args    a list of command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNum = in.nextDouble();
        System.out.println("Enter the second number");
        double secondNum = in.nextDouble();
        System.out.println("Enter the third number");
        double thirdNum = in.nextDouble();
        if(sorted(firstNum, secondNum, thirdNum) == true && allDifferent(firstNum, secondNum, thirdNum))
        {
            System.out.println("All the numbers different");
            System.out.println("All the numbers are sorted");
        }
        else if(allDifferent(firstNum, secondNum, thirdNum) == true)
        {
        System.out.println("All the numbers are different");
        }
        else
        {
            System.out.println("All the numbers are the same");
        }

    }
}