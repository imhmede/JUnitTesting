/*
Agustin Sandoval
Lab3_b
CS 123
10-1-22
*/

import java.util.Scanner;                   
public class DigitOrderComp{                              
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the three integers: ");            
        String rawDigitString = scanner.next();                      //recieved input as string to consider the position of each digit.     
        //String firstDigitString = rawDigitString.substring(0,1);   // initially stored substrings for each positon representing a digit
        //String secondDigitString = rawDigitString.substring(1,2);  // repeated for each digit
        //String thirdDigitString = rawDigitString.substring(2,3);
        //int firstDigitInt = Integer.parseInt(firstDigitString);    //initially stored the conversion of the substrings as int values
        //int secondDigitInt = Integer.parseInt(secondDigitString);  // substring were transformed to compare there value
        //int thirdDigitInt = Integer.parseInt(thirdDigitString);    
        
        /* if statements are used to compare the value of each digit considering there positon
           removed variables above and did the transformations/conversions int the conditions
        */
        
        if (Integer.parseInt(rawDigitString.substring(0,1)) >= Integer.parseInt(rawDigitString.substring(1,2)) && Integer.parseInt(rawDigitString.substring(1,2)) >= Integer.parseInt(rawDigitString.substring(2,3))){
            System.out.println("The digits are in order");
        }else if (Integer.parseInt(rawDigitString.substring(2,3)) >= Integer.parseInt(rawDigitString.substring(1,2)) && Integer.parseInt(rawDigitString.substring(1,2)) >= Integer.parseInt(rawDigitString.substring(0,1))){
            System.out.println("The digits are in order");
        }else{
            System.out.println("The digits are not in order");
        }
        
        
        
        
        
    
    }		
		
	
}