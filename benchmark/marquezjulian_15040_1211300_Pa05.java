import java.util.Scanner;
public class Pa05{ 
    public static void main(String args[]){
        System.out.println("Enter a letter grade:");
        Scanner user = new Scanner(System.in);
        
        String same = user.next(); 

        if(same.equals("A")||same.equals("a"))
        
            System.out.print("The numeric value of the letter grade A is 4");    

        else if(same.equals("B")||same.equals("b"))
        
            System.out.print("The numeric value of the letter grade B is 3");
    
        else if(same.equals("C")||same.equals("c"))
        
            System.out.print("The numeric value of the letter grade C is 2");

        else if(same.equals("D")||same.equals("d"))
        
            System.out.print("The numeric value of the letter grade D is 1");

        else if(same.equals("F")||same.equals("f"))
        
            System.out.print("The numeric value of the letter grade F is 0");
        
        else 
            System.out.print("Invalid letter grade. Program is terminated");
    }

}