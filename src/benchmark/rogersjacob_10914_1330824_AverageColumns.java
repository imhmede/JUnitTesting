//Jacob Rogers
//CS_123P
//May 3, 2023

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AverageColumns {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the name of the file including the path where it is located: ");
        String filename = scanner.nextLine();
        
        File file = new File(filename);
         
        Scanner reader = new Scanner(file);
        
        int line_counter = 0;
        
        while(reader.hasNext()) {
             
            line_counter++;
            
           
            double num1 = reader.nextDouble();
            double num2 = reader.nextDouble();
            
           
            String line = String.format("line(%d): %.2f\t%.2f", line_counter, num1, num2);
            System.out.println(line);
            
            
            double average = (num1 + num2) / 2;
            
          
            String output = String.format("\taverage = (%.2f + %.2f)/2 = %.2f", num1, num2, average);
            System.out.println(output);
        }
	}
}