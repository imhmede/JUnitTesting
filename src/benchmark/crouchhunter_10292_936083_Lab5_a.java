//Hunter Crouch
//10/29/2022
//Lab5_a
import java.util.Scanner;
public class Lab5_a
{
      public static void main(String[] args) 
      {
      int x,y,z;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter three integers:");
      x=in.nextInt();
      y=in.nextInt();
      z=in.nextInt();
      System.out.println("All the same int:"+allTheSame(x,y,z));
      System.out.println("Average:"+average(x,y,z));
      System.out.println("Smallest:"+theSmallest(x,y,z));
      System.out.println("Sorted smallest to biggest:"+sorted(x,y,z));	
      }
      /**@param three integers of double
      @return true if equal false otherwise
      */
      public static boolean allTheSame(double x, double y, double z)
      {
         if(x==y&x==z)    
            {return true;}
         else             
            return false; 
      }
      /**@param three integers of double
      @return average of the three integers
      */
      public static double average(double x, double y, double z)
      {
         return (x+y+z)/3;
      }
      /**@param three integers of double
      @return return the smallest integer
      */
      public static double theSmallest(double x, double y, double z)
      {
         if(x<=y&x<=z)
            {return x;}
         if(y<=x&x<=z)
            {return y;}
         return z;
      }
      /**@param three integers of double
      @return true if the integers are in order
      */
      public static boolean sorted(double x, double y, double z)
      {
         if(x<=y&y<=z)
            {return true;}
         return false;
      }
}
