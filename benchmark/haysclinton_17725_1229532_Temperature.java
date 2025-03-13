import java.util.Scanner;
public class Temperature {
    public static void main(String[] args)
    {  
       /**
         * Scanning in an Temps and Temp units
         */
        String State = "liquid";
        String units = "f";
        double Temp = 0;
        int i = 0;
        int j = 0;
        

        while(i <= 0 && j <=2)
     {
        Scanner in = new Scanner(System.in); 
        System.out.println("Please enter a Temperature: ");
        Temp = in.nextDouble();
        System.out.println("Please enter the Temperature Units used. ( F or C ): ");
        units = in.next();
        int retrys = 2 - j;
       
        /**
         * This logic first compares the unit input F or C then compares the temperature entered to a range to determine the state of the Water.
         * Solid State for F: 0- 31, Liquid State for F: 32 - 211, Gaseous State for F 212 - infinity
         * Solid State for C: -infinity to 0, Liguid State for C: 0-100, Gaseous State for C: 101 - infinity
         */
        if(units.equals( "F") || units.equals( "f") && Temp >= 32 && Temp <= 211)
        { State = "liquid"; 
          System.out.println("The Water is in a Liquid State");  
        }
        else if (units.equals( "F") || units.equals( "f") && Temp <= 31)
       {
            State = "Solid";
            System.out.println("The Water is in a Solid State");
        }
        else if (units.equals( "F") || units.equals( "f") && Temp >= 212)
        {
            State = "Gas";
            System.out.println("The Water is in a Gaseous State");
        }
        
        if(units.equals( "C") || units.equals( "c") && Temp >= 0 && Temp <= 99)
        {
            State = "liquid"; 
          System.out.println("The Water is in a Liquid State");  
        }
        else if (units.equals( "C") || units.equals( "c") && Temp <= 0)
       {
            State = "Solid";
            System.out.println("The Water is in a Solid State");
        }
        else if (units.equals( "C") || units.equals( "c") && Temp >= 100)
        {
            State = "Gas";
            System.out.println("The Water is in a Gaseous State");
            
         } 
          
        /**
         *  Error handling for unit input
         * The user has 3 trys to input the Temperature unit correctly. If this is not met the program will exit. If it is met it will execute.
         */
       if (!units.equalsIgnoreCase("F") && !units.equalsIgnoreCase("C"))
            {System.out.println("Invalid Unit input, Enter (F or C), You have "+ retrys +" tries left");
              i = 0;
              j++;  }
        else i++;}        

        
    

    }
}