import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class averagenum2 {
    public static void main(String[] args) throws FileNotFoundException
    {
          /** Ask for filename */
          Scanner in = new Scanner(System.in);
          System.out.println("Enter Filename:");
            String line = in.nextLine();
        

            File inputFile = new File(line);
            Scanner in1 = new Scanner(inputFile);
    

        
            

         while (in1.hasNextLine())
        {
           
            String[] numbers = line.split ("  ");
            double num1 = Double.parseDouble(numbers[0]);
            double num2 = Double.parseDouble(numbers[2]);
            double average = (num1 + num2)/2;
            System.out.println("Average " + average);
            in.close();
        } 
    }
    
}
