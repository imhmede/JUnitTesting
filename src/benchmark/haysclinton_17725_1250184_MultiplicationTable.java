import java.util.Scanner;
public class MultiplicationTable{

    public static void main(String[] args)
{  
    /** 
     * Scanning in number between 1 and 12 
     **/
    System.out.println("Please Enter a Number between 1 and 12: ");
        Scanner in = new Scanner(System.in);
         int incount = in.nextInt(); 
    /**
     * If statement is to evaluate the range of number entered. If outside of 1 through 12 the loop will not run. If it is in range
     * the for loop will run creating and printing the multiplication table for the value given.
     */
         
    if(incount > 0 && incount <= 12){ 
    
        for(int i = 0; i <= 12; ++i)
        {
            
            System.out.printf("%d * %d = %d \n", incount, i, incount * i);
        }

    }
    else 
    {
        
        System.out.println("Please Try Again. Enter a number between 1 and 12");

    }


       
        
   
            
}
        
    
      






 } 
