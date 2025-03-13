/**
 Jay Mancilla
 CS -123
This program checks if a couple different varibales are true or false
 */

 import java.util.Scanner;
 public class Lab5_1
 {
    public static void main(String[] args) 
   {
    //calls scanner into program
      Scanner in = new Scanner(System.in);
   
      //empty variables to check
    double x = 0;
    double y = 0;
    double z = 0;
   
    //this ask input for x,y,z
    System.out.print("Enter 1st number: ");
    x = in.nextDouble();
    System.out.print("Enter 2nd number: ");
    y = in.nextDouble();
    System.out.print("Enter 3rd number: ");
    z = in.nextDouble();

    // checks true or false for variables
    boolean allTheSame = allTheSame(x,y,z);
    System.out.println(allTheSame);
    
    //calculates average
    double resultAverage = inputAverage(x, y, z);
    System.out.println("Average for inputs is: " + resultAverage);
    
    //uses logic to determine smallest number
    double theSmallest = minNumber(x,y,z);
    System.out.println("Smallest number: "+ theSmallest);

    //checks true or false in numbers are sorted with smallest first
   boolean inputSorted = sorted(x,y,z);
   System.out.println(inputSorted);
   }
     
    /**
    Determines if all 3 variables are equal
    @param allTheSame test x,y,z to see if eqaul
    @returns true or false
    */
   public static boolean allTheSame( double x, double y, double z)
   {
      if (x==y && y == z)
      {
      return true;
      }
      else
      {
      return false;
      }
   }

   /**
    * Method calculates average
    * @param x
    * @param y
    * @param z
    * @return adds parameter and divides by 3
    */
   public static double inputAverage(double x,double y, double z)
   {
      double totalAverage = (x + y + z)/3.0;
      return totalAverage;
   }

   /**
    * Uses logic to deteremine smallest number
    * @param x
    * @param y
    * @param z
    * @return the smallest value based on greater or less than
    */
   public static double minNumber(double x, double y, double z)
   {
      double smallest;
      if (x <= y && x <= z)
      {
         smallest = x;
      }
      else if (x <= z && y <= x)
      {
         smallest = y;
      }
      else
      {
         smallest = z;
      }
      return smallest;
   }

   /**
    * 
    * @param x
    * @param y
    * @param z
    * @return true or false bases on logic if the values are in order
    */
   public static boolean sorted(double x, double y, double z)
    {
      if (x <= y && y <= z) 
      {
        return true;
      }
      else 
      {
        return false;
      }
    }


}