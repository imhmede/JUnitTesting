
import java.util.Scanner;


/**
 * CS123
 * @author Joseph Padilla
 * Assignment Name: Grade
 * Purpose: This program will return a numeric value for a letter grade of A, B, C, D or F. 
 */
public class PA_05 {

    public static Scanner input = new Scanner(System.in);
           
    public static void main(String[] args) {
                
        System.out.println("Enter a letter grade:");
        String letter = input.nextLine();
          
        if ("A".equals(letter))
            System.out.println("The numeric value of the letter grade A is 4");
        
        else if ("B".equals(letter))
            System.out.println("The numeric value of the letter grade B is 3");
        
        else if ("C".equals(letter))
            System.out.println("The numeric value of the letter grade C is 2");
        
        else if ("D".equals(letter))
            System.out.println("The numeric value of the letter grade D is 1");
        
        else if ("F".equals(letter))
            System.out.println("The numeric value of the letter grade F is 0");
        
        else 
            System.out.println("Invalid letter grade. Acceptable entries would be a capital A, B, C, D or F. Program is terminated");
                      
    }
}
