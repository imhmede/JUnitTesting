/*

Class: CS123
Description: Lab3_b
Author: Vince Gnodle
Date: 10/02/2022

*/

import java.util.Scanner; //import scanner to read input

public class InOrder
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); //Declare scanner "in"
		
		//declare variables to store 3 integers and a counter
		int first = 0;
		int second = 0;
		int third = 0;
		int i;
		
		//for loop to prompt user to enter 3 separate integers
		for (i = 1 ; i <= 3 ; i++){
		    
		    System.out.print("Enter in an integer: "); //prompt user to enter Int
		    
		    //first execution of for loop stores entered integer under "first"
		    if (i == 1){
		       
	            first = in.nextInt();
	            
		    }
		    
		    //2nd execution of for loop stores entered integer under "second"
		    else if (i == 2){
		        
		        second = in.nextInt();
		       
		    }
		    
		    //3rd execution of for loop stores entered integer under "third"
		    else if (i == 3){
		        
		        third = in.nextInt();
		    }
		}
		
		/*if, else if, else statements to compare integers and determine if 
		they are in order*/
		if (first > second && second > third){
		    
		     System.out.print("In order");
		}
		
		else if (first < second && second < third){
		    
		     System.out.print("In order");
		}
		
		else {
		    
		     System.out.print("Not in order");
		}
	}
}
