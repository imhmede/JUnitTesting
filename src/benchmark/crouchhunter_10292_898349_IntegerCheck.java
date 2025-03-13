//Hunter Crouch
//10/15/2022
//Lab4
import java.util.Scanner;
public class IntegerCheck
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      int Big=0,Small=1000000000,Even=0,Odd=0,newIN=0,total=0,oldIN=0,x=1,y=1;//Made small big
      String Total="",Adj="";                                             //to force it to become     
      System.out.println("Enter integers and enter Out to stop entering"); //the first number entered
      while(x==1)
      {
         System.out.println("Enter integer");
         String In = in.next();
         if(!In.trim().equals("Out"))//Checks to see if done entering integers
         {
            newIN = Integer.parseInt(In);//converts entered string to int olny if not Out
            if(newIN!=oldIN){y=1;}       //checks to see if the old int is diferent or not for more 
            if(newIN>Big){Big = newIN;}  //than two integers in a row
            if(newIN<Small){Small = newIN;}
            if(newIN%2==0){Even++;}
            else{Odd++;}
            total=total+newIN;
            Total = Total.concat(String.valueOf(total).concat(" "));//add new total to a string
            if(newIN==oldIN&&y==1)
            {
               y=0;
               Adj = Adj.concat(String.valueOf(newIN).concat(" "));//adds only adjacent numbers to a string
            }
         }
         else
         { 
            System.out.println("Entered Out");
            x=0;
         }
         oldIN = newIN;
      }
      System.out.println("The smallest Number: "+Small);
      System.out.println("The largest Number: "+Big);
      System.out.println("Total evens: "+Even);
      System.out.println("Total odds: "+Odd);
      System.out.println("Totals in order: "+Total);
      System.out.println("Adjacent number: "+Adj);
   }
}