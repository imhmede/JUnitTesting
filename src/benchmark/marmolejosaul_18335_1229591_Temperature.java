import java.util.*;

//Saul Marmolejo
//3-16-2023
//Programming Assignment 06

public class Temperature {
    public static void main(String[] args){
        double temperature;
        double celsius;
        String scaleType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        temperature = scanner.nextDouble();
        System.out.println("Enter the scale of the temperature ");
        scaleType = scanner.next();
        
        if (scaleType.equals("C") || scaleType.equals("c")){
            celsius = temperature;
            if (celsius < 0){
                System.out.println("The water is solid");
            } else if (celsius >= 0 && celsius <= 100){
                System.out.println("The water is liquid");
            } else {
                System.out.println("The water is gas");
            }


        } else if (scaleType.equals("F") || scaleType.equals("f")){
            celsius = (temperature-32)*5/9;
            if (celsius < 0){
                System.out.println("The water is solid");
            } else if (celsius >= 0 && celsius <= 100){
                System.out.println("The water is liquid");
            } else {
                System.out.println("The water is gas");
            }
        }
        




    }
}
