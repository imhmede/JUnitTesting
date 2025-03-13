import java.util.Scanner;

import javax.lang.model.element.VariableElement;

import org.w3c.dom.ranges.Range;
public class Pa06_Marquez{ 
    public static void main(String args[]){
        System.out.println("Enter the tempature:");
        Scanner user = new Scanner(System.in);
        
        int tempature = user.nextInt();
        
        System.out.println("Enter the scale of the tempature:");

        String scale = user.next();  

        if(scale.equalsIgnoreCase("F"));

            double C=(5*(tempature-32))/9;

            if((C>=0)&&scale.equalsIgnoreCase("F")&&(C<=100))

                System.out.print("The water is a Liquid"); 
            
            else if((C>100)&&scale.equalsIgnoreCase("F"))
        
                System.out.print("The water is a Gas");
    
            else if((C<0)&&scale.equalsIgnoreCase("F"))
        
                System.out.print("The water is a Solid");    
                
        else

            System.out.print(" ");

    }
}
