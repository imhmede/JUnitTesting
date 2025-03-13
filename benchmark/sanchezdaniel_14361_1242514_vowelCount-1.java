/**
This program takes a input and then determines how many vowels are in a string.
@author Daniel Sanchez
@version 1
Assignment: PA07 vowelCount
Date: 3/24/2023
*/
import java.util.Scanner;
public class vowelCount { //class
    /**
     * This method takes string input and determines the amount of vowels in the string.
     * @param args input is given twice by program user.
     * variable is initialized as a counter named vowelCounter.
     * two variables are declarared with userInput1 values respectively.
     * for loop goes through length of the string
     * 'if' statments determine a letter status, increment vowelCount respectively, and display result.
     */
    public static void main(String[] args) //method
    {
        Scanner in = new Scanner(System.in);  //Created a Scanner object
        System.out.println("Enter a word: "); //Ask for input 1
        String userInput1 = in.nextLine();  //Read user input 1
        int vowelCount =  0; // variable initialized to store number of vowels (outside the body of the for loop)
        for(int counter = 0; counter < userInput1.length(); counter++) // for loop goes through userInput1.length(); counter updates at each index location increment
        {  
            if(userInput1.charAt(counter) == 'a' || userInput1.charAt(counter) == 'e' || // If any userInput1 = vowels at a specific index location than + 1 vowelCount
             userInput1.charAt(counter) == 'i' || userInput1.charAt(counter) == 'o' ||  
             userInput1.charAt(counter) == 'u' || userInput1.charAt(counter) == 'y' ||
             userInput1.charAt(counter) == 'A' || userInput1.charAt(counter) == 'E' ||
             userInput1.charAt(counter) == 'I' || userInput1.charAt(counter) == 'O' ||
             userInput1.charAt(counter) == 'U' || userInput1.charAt(counter) == 'Y')
                vowelCount = vowelCount + 1; //variable sums the vowels in a string; it is stored in a variable outside the body of the for loop
        }
        System.out.println("The number of vowels in " + userInput1 + " is " + vowelCount); // Display message with original words and amount of vowels
    in.close();
    }
}