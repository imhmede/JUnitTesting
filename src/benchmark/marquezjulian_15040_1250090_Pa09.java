import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Pa09{ 
    public static boolean allTheSame(double x, double y, double z){

;       return x==y&&z==x&&z==y;
        

    }

    public static boolean allDifferent(double x, double y, double z){;

        return x==0&&y==0&&z==0;

        
    }
    public static boolean sorted(double x, double y, double z){;

        return x<=y&&y<=z&&x<=z&&y<=z;  
    }
        public static void main(String args[]){
            System.out.println("Enter the first number:");
            Scanner user = new Scanner(System.in);

            int x = user.nextInt();;

            System.out.println("Enter the second number:");

            double y = user.nextInt();    

            System.out.println("Enter the third number:");

            double z = user.nextInt();
        
            if(x==y&&x==z&&y==z)
        
            System.out.print("All the Numbers are same"); 

            else 
             System.out.print("All the Numbers are different");

            if(x<=y&&y<=z&&x<=z&&y<=z)
        
             System.out.print("\nAll the Numbers are sorted");


    }
 
        
        


                

    
    

}