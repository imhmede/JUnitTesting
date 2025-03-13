import java.util.Scanner;
public class meter {



    public static void main(String[] args)
    {
        System.out.println ("Pleases enter a measurement in meters :");
       
        try (Scanner in = new Scanner(System.in)) {
            in.nextInt();
            
          
            
            int numberofmeters = in.nextInt();
      
      
            float themeasurementinmiles = (float) 1609 / numberofmeters;
      System.out.println ("The measurement in miles:");
      System.out.println (themeasurementinmiles);
      
      float themeasurementinfeet = (float) 3.281 * numberofmeters;
      System.out.println ("The measurement in feet:");
      System.out.println (themeasurementinfeet);
      
      float themeasurementininches = (float)39.37 * numberofmeters;
      System.out.println ("The measurement in inches:");
      System.out.println (themeasurementininches);
        }

    
    }

}

