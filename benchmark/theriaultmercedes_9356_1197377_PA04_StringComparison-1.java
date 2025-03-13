/**
 * This program takes two user generated string inputs and checks if the two are the same
 * @author Mercedes Theriault
 * 3-3-2023
 */
import java.util.Scanner;
public class PA04_StringComparison 
{
   public static void main(String[] args)
   {
    //lines 13 & 29: experimenting with try{} and finally{in.close()} to settle a resource leak error
    Scanner in = new Scanner(System.in);
    try
    {   
        //takes entire user generated line (as opposed to a single word) and stores as a varable, "word"
        System.out.println("Please enter a string: ");
        String word = in.nextLine();
        
        System.out.println("Please enter another string: ");

        //instead of using a second variable for the comparison, it is done using the direct input since the second word is not accessed again
        //using .equals() instead of == 
        if (word.equals(in.nextLine()))
        {
            System.out.println("All the same.");
        }
        else
        {
            System.out.println("Neither");
        }
    } finally{
        in.close();
    }
   }
}
