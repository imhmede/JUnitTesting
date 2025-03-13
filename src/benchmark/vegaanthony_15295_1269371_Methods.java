 import java.util.Scanner;
class Methods
{
   public static void main(String args[])
   {     
        try (//create for scanner
      Scanner scan = new Scanner(System.in)) {
         //ask for to enter the first number 
           System.out.print("Enter the first number: ");
           
           //read first number entered
           int x = scan.nextInt();

           System.out.println(x);

          
           //ask for to enter the secound number
           System.out.print("Enter the secound number: ");


           //read second number entered
           int y = scan.nextInt();

           System.out.println(y);



           //ask for to enter third number
           System.out.print("Enter the third number: ");

           //read third number entered
           int z = scan.nextInt();

           System.out.println(z);



           //call method by passing values x,y,z and print them
           System.out.println("All the numbers are the same =     " + allTheSame (x,z,y));

           System.out.println("All the numbers are different =   " + allDifferent (x,y,z));
          
           System.out.println("All the numbers are sorted =    " + sorted (x,y,z));
      }
   }
   public static boolean allTheSame(Integer x, Integer y, Integer z ){
    
    //ifx is eaqual to y and y is equal to z then, all are equal so return is true
    if(x == y && y == z)
      return true;
   else   

    //otherwise return false
    return false;
}
public static boolean allDifferent(Integer x, Integer y, Integer z)
{
//if x is not equal to y and y is not equals to z annd x is not equal to z then all are diffrent, return true
if (x != y && y != z && x !=z)
 return true;

else

//otherwise return false
return false;
}
public static boolean sorted(Integer x, Integer y, Integer z)
{
//if x is less than or equal to y, y is less tham or equal to z then they are in increasing order return true
if(x <= y && y <= z)
 return true;

else

//otherwise return flase
return false;
}
}


    
