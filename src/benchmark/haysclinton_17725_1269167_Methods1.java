import java.util.Scanner;
public class Methods1{
/**
 * This method compares 3 different numbers and returns true if they are the same or false if they are not.
 * @param x
 * @param y
 * @param z
 * @return
 */
public static boolean allTheSame (double x, double y, double z) {
   if (x == y && x == z )
   {
      return true;

   }
   else
   {
      return false;
   }

}
/**
 * This method compares 3 different numbers and if they are not the same returns a true value. 
 * If they are the same it returns a false
 * @param x
 * @param y
 * @param z
 * @return
 */

public static boolean alldifferent(double x, double y, double z){
   if (x != y || x != z )
   {
      return true;
   }
   else{
      return false;
   }
}
/**
 * This Method compares 3 values and decides if the values are in ascending order or are the same.
 *  If so it returns  a true value. If not it returns false.
 * @param x
 * @param y
 * @param z
 * @return
 */
public static boolean sorted(double x, double y, double z){
   if (x < y &&  x < z && y < z || x == y && x ==z)
   {
      return true;
   }
   else{
      return false;
   }
}
public static void main(String[]args){

/**
 * Scans in the 3 numbers for the Methods to evaluate
 */
System.out.println("Please enter the 1st number:");
Scanner in = new Scanner(System.in);
double x = in.nextDouble();
System.out.println("Please enter the 2nd number:");
double y = in.nextDouble();
System.out.println("Please enter the 3rd number:");
double z = in.nextDouble();
/**
 * This logic compares the methods with true and if true prints the result. 
 * If Method sorted returns a false this prints a not sorted message.
 */
if(allTheSame(x,y,z) == true)
{
   System.out.println("All the Numbers are the Same");
}
if (alldifferent(x,y,z)== true)
{
   System.out.println("All the Numbers are different");
   
}
if (sorted(x,y,z)== true)
{
   System.out.println("All the Numbers are Sorted");
}
else{
   System.out.println("All the Numbers are Not Sorted");
}


}
}

 

 


