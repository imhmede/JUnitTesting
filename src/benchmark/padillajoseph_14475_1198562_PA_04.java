/**
 * class: CS123
 * @author: Joseph Padilla
 * date: 3/5/23
 */

import java.util.Scanner;

public class PA_04 
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("Enter the first string:");
        String var1 = input.nextLine(); //declares first string
        
        System.out.println("Enter the second string:");
        String var2 = input.nextLine(); //declares second string
       
        /*The if statement below will check if the strings are equal. 
         If they are, the output will be "all the same". 
         If they are not, the ouput will be "neither". */
        
        if (var1.equals(var2)) 
        {
            System.out.println("all the same");
        }else 
        {
          System.out.println("neither");
        }
              
    }
}
