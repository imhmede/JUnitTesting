import java.util.Scanner;
public class Pa04{ 
    public static void main(String args[]){
        System.out.println("Enter the first string:");
        Scanner user = new Scanner(System.in);
        
        String same = user.next(); 

        System.out.println("Enter the second string:");
        
        String same2 = user.next();
        
        if(same.equals(same2))
        
            System.out.print("all the same");

        else 
            System.out.print("niether");
    

    }

}