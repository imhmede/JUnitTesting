import java.util.*;
public class PA_09_Methods{
    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        //Variable declaration
        double num1,num2,num3;
        
        //Get uswer inputs and assign values to variables
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        num2 = sc.nextDouble();
        System.out.println("Enter the third number");
        num3 = sc.nextDouble();
        
        // Check if the input values the same
        if(allTheSame(num1, num2, num3)){
            System.out.println("All the numbers are the same");
        }
        // Check if the input values are all different
        if(allDifferent(num1, num2, num3)){
            System.out.println("All the numbers are the different");
        }
        // Check if the input values are sorted in ascending order
        if(sorted(num1, num2, num3)){
            System.out.println("All the numbers are the sorted");
        }
    }
    
    // Method to check if the arguments are all the same
    public static boolean allTheSame(double x, double y, double z){
        return x==y && y==z && z==x; // return true if all values are same.
    }
    
    // Method to check if the arguments are all the different
    public static boolean allDifferent(double x, double y, double z){
        return x!=y && y!=z && z!=x; // return true if all values are different.
    }
    
    // Method to check if the arguments are sorted
    public static boolean sorted(double x, double y, double z){
        return x<y && x<z && y<z; // return true if the numbers are sorted in ascending order .
    }
}