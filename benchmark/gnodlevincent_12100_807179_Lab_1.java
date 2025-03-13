public class Lab_1

{

     public static void main(String[] args)

     {
         double balance= 1000.00;
         double interest= .05;
         
         for (int i = 1; i < 4; i++) 
         {
             
            balance= balance * (1+interest);
            System.out.println("Balance after year " + i + " :" + balance);
            
         }

     }

}