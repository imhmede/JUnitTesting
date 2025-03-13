/**
This program takes a set of inputs and then determines the status of a liquid in C or F.
@author Daniel Sanchez
@version 1
Assignment: PA06 waterStatus
Date: 3/16/2023
*/

import java.util.Scanner; // import for scanner
public class waterStatus { // class
    /**
     * This method takes two input and determines a status of liquid.
     * @param args input is given twice by program user.
     * @param args string userInput1 is converted to double and stored in double temperature.
     * @param args two variables are declarared with userInput1 values respectively.
     * @param args arithmetic (+, -, *, /) is used on variable temperatureF.
     * @param args two 'if' 'else if' statments determine water status respectively and display result.
     */
    public static void main(String[] args) //main method
    {
    Scanner in = new Scanner(System.in);  //Created a Scanner object
    System.out.println("Enter the temperature: "); //Ask for input 1
    String userInput1 = in.nextLine();  //Read user input 1
    System.out.println("Enter the scale of the temperature: "); //Ask for input 2
    String userInput2 = in.nextLine();  //Read user input
    double temperatureS = Double.parseDouble(userInput1); //userInput conversion to double 
    double temperatureC = temperatureS; //Variabel for Celsius
    double temperatureF = (5*(temperatureS -32) / 9); //Variabel for Fahrenheit
    in.close();
    if(userInput2.equalsIgnoreCase("c") && temperatureC <= 0) //Boolean evaluation
        {    
            System.out.println("The water is ice"); //Display if temp = ice
        }    
        else if((userInput2.equalsIgnoreCase("c") && temperatureC < 100 )) //Boolean evaluation
        {
            System.out.println("The water is liquid"); //Display if temp = liquid
        }
        else if((userInput2.equalsIgnoreCase("c") && temperatureC >= 100)) //Boolean evaluation
        {
            System.out.println("The water is gas"); //Display if temp = gas
        }
            
    if(userInput2.equalsIgnoreCase("f") && temperatureF <= 0) //Boolean evaluation
        {
            System.out.println("The water is ice"); //Display if temp = ice
        }    
        else if((userInput2.equalsIgnoreCase("f") && temperatureF < 100 )) //Boolean evaluation
        {
            System.out.println("The water is liquid"); //Display if temp = liquid
        }
        else if (userInput2.equalsIgnoreCase("f") && temperatureF >= 100) //Boolean evaluation
        {
            System.out.println("The water is gas");  //Display if temp = gas
        }
}
}