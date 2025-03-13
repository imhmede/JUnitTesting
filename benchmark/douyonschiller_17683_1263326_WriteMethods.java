/** Write the following methods and provide a program to test them.
* @ Schiller Douyon
* @ 2023-04-03
*/
import java.util.Scanner;
 class writeMethods
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double x,y,z; //declaration of varaiable
        
        //Taking user inputs and assiging values to the varaiable
        System.out.print("Enter value for x: ");
        x = in.nextDouble();
        System.out.print("Enter value for y: ");
        y = in.nextDouble();
        System.out.print("Enter value for z: ");
        z = in.nextDouble();
        in.close();
        boolean out1 = allTheSame( x, y, z); // calling method allTheSame whose value is sorted in out1.
        boolean out2 = allDifferent( x, y, z); // calling method allTheSame whose value is sorted in out2.
        boolean out3 = sorted( x, y, z); // calling method allTheSame whose value is sorted in out3.
        
        //printing the result;
        System.out.println("Output of allTheSame method is "+ out1);
        System.out.println("Output of allDifferent method is "+ out2);
        System.out.println("Output of sorted method is "+ out3);
    }
    
    public static boolean allTheSame(double x, double y, double z)
    {
        if(x==y && y==z && z==x){
            return true; //if all values are same then return true.
        }
        else{
            return false; //if values are not equal return false.
        }
    }
    
public static boolean allDifferent(double x, double y, double z){
        if(x!=y && y!=z && z!=x){
            return true; //if all values are Different return true. 
        }
        else{
            return false; //if not return false.
        }
    }
    
    public static boolean sorted(double x, double y, double z){
        if(x<y && x<z && y<z)
        {
            return true; // if the numbers are sorted in smallest order return true.
        }
        else
        {
            return false;
        }
       
    }
}
