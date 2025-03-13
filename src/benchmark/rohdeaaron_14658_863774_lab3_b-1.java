/* Aaron Rohde - CS123
 * Assignment: Lab 3_b
 * Due:     10/02/2022
 */
import java.util.Scanner;
public class lab3_b
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // int to control array size in creation, user prompt, and testing loops.
        int arraySize = 3;
        // int array to capture the numbers
        int[] numbersIn = new int[arraySize];
        // Set defaults to help logic later
        boolean loopBool = false;
        String output = "not in order";
        // Prompt for user input
        System.out.printf(
            "Please enter %d space separated numbers to evaluate order: ", arraySize);
        // Loop using arraySize as limit
        for (int i = 0; i < arraySize; i++) 
        {
            numbersIn[i] = in.nextInt();
        }
        /* Evaluate for ascending order
         * ascendingLoop: label resolves breaking subLoop instead of mainLoop
         */ 
        ascendingLoop:
        for (int mainLoop = 0; mainLoop < arraySize; mainLoop++) 
        {
            for (int subLoop = mainLoop + 1; subLoop < arraySize; subLoop++) 
            {
                if (numbersIn[mainLoop] <= numbersIn[subLoop]) 
                {
                    loopBool = true;
                } 
                else 
                {
                    loopBool = false;
                    break ascendingLoop;
                }
            }
        }
        // only test for descending if ascending failed
        if (! loopBool ) 
        {
            /* Evaluate for descending order
             * descendingLoop: label resovles breaking subLoop instead of mainLoop
             */
            descendingLoop:
            for (int mainLoop = 0; mainLoop < arraySize; mainLoop++) 
            {
                for (int subLoop = mainLoop + 1; subLoop < arraySize; subLoop++) 
                {
                    if (numbersIn[mainLoop] >= numbersIn[subLoop]) 
                    {
                        loopBool = true;
                    }
                    else
                    {
                        loopBool = false;
                        break descendingLoop;
                    }
                }
            }
        }
        if ( loopBool ) 
        {
            output = "in order";
        }
         
        // Give answer to user in provided format
        for (int i = 0; i < arraySize; i++) 
        {
            System.out.printf("%d ", numbersIn[i]);
        }
        System.out.printf("    %s%n", output);
    } 
}