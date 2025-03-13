/** This program creates a multiplication table using the number entered by the user
 * @author Rubi Madrid CS123
 * @date 03.28.2023
 * @param a series of command line arguments
 */

//imports scanner 
 import java.util.Scanner; 

public class MultiplicationTable 
{
    public static void main(String[]args)
    {
        //calls scanner for use
        Scanner in = new Scanner(System.in);

        //prompts user to enter number 
        System.out.println("Enter an number between 1 and 12:");

        //saves user input into number variable
        int number = in.nextInt();
        
        //sets up counter for table
        for (int i = 0; i <= 12; i ++)
        {   
            //prints out results on each line
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }  
}
