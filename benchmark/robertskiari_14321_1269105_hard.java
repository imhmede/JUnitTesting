  /**
  *boolean allTheSame(double x, double y, double z), returning true if the arguments are all the same 
*boolean allDifferent(double x, double y, double z), returning true if the arguments are all different 
*boolean sorted(double x, double y, double z), returning true if the arguments are sorted, with the smallest one coming first.
  *@Kiari Roberts
  *@2023-03-04
* */

import java.util.Scanner;
    public class hard 
    {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x,y,z; //declaration of varaiable
            
            //Taking uswer inputs and assiging values to the varaiable
            System.out.print("Enter first number: ");
            x = sc.nextDouble();
            System.out.print("Enter second number: ");
            y = sc.nextDouble();
            System.out.print("Enter third number: ");
            z = sc.nextDouble();
            
            boolean out1 = allTheSame( x, y, z); 
            // allTheSame whose value is sorted in out1.
            boolean out2 = allDifferent( x, y, z); 
            // allTheSame whose value is sorted in out2.
            boolean out3 = sorted( x, y, z); 
            //  allTheSame whose value is sorted in out3.
            
            //printing the result;
            System.out.println("All the numbers are the same " + out1);
            System.out.println("The numbers are all different"+ out2);
            System.out.println("the numbers are sorted "+ out3);
        }
    }
    
    public static boolean allTheSame(double x, double y, double z){
        if(x==y && y==z && z==x){
        return true;
       
    }
        else{
            return false; //if values they are not equal return false.
        }

    }
    
public static boolean allDifferent(double x, double y, double z){
        if(x!=y && y!=z && z!=x){
            return true; //if all values are Different return true. 
        }
        else{
            return false; //if not then return false.
        }
    }
    
    public static boolean sorted(double x, double y, double z){
        if(x<y && x<z && y<z){
            return true; // if the numbers are in smallest order return true.
        }
        else{
            return false;//if not then return false
        }
    }
}
