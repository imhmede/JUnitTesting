
/**
 * CS123
 * @author Joseph Padilla
 * 4/3/2023
 * 
 * The purpose of this program is to test three different methods depending on input from the user. 
 * 
 */


import java.util.Scanner;

public class Methods {
    
    /**
     * 
     * The method below will evaluate the user inputs to determine if those inputs are equal to each other.
     * 
     */
    
    static void allTheSame(double x, double y, double z){  
        if ((x==y) && (x==z)){
 
            System.out.println("All the numbers are the same.");
    
        }
    }
    
    /**
     * 
     * The method below will evaluate the user inputs to determine if any of those inputs do not equal each other. 
     * 
     */
    
    static void allDifferent(double x, double y, double z){
        if ((x!=y) || (x!=z)){
        
            System.out.println("All the numbers are different.");   
        
        }
    }

    /**
     * 
     * The method below will evaluate the user inputs and determine if those input values increase from x to z or if
     * the inputs are all equal to each other. I initially wanted to write the conditions without the = sign because that would evaluate 
     * the inputs from smallest to greatest as the instructions stated but I would not get the same output as the assignment screenshot if the 
     * numbers were all the same so I included the equal sign.
     * 
     */
    
    static void sorted(double x, double y, double z){
        if ((x<=y) && (y<=z)){
            
            System.out.println("All the numbers are sorted.");
            
        }
    }
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        /**
         * 
         * The last section of the program below will prompt the user to define and initialize for three variables (x,y,z) and 
         * call the methods defined earlier in the program. The method outputs will depend on the values of x, y, and z.
         * 
         */
        
        System.out.println("Enter the first number:");
        double x = input.nextDouble();
        
        System.out.println("Enter the second number:");
        double y = input.nextDouble();
        
        System.out.println("Enter the third number:");
        double z = input.nextDouble();
        
        allTheSame(x,y,z);
        allDifferent(x,y,z);
        sorted(x,y,z);
      
    }
}