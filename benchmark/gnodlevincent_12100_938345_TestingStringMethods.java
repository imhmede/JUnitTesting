/*
Author: Vince Gnodle
Class: CS123
Date: 10/30/2022
Purpose: Lab 5_b
Description: testing various methods with string type arguments
*/

import java.util.Scanner;

public class TestingStringMethods
{
    /**
    Determines the middle character(s) in a given string.
    @param str is the entered string.
    @return middle character if string length is odd, middle two characters if string length is even. 
    */ 
     public static String middle(String str){
        String middleCharacters; 
        if (str.length() % 2 == 0){
            middleCharacters = (str.charAt((str.length()/2) - 1)) + "" + (str.charAt(str.length()/2));
        }
        else{
            middleCharacters = Character.toString(str.charAt(str.length()/2));
        }
        return middleCharacters;
    }
    
    
    /**
    Prints entered string 'n' number of times.
    @param str is the entered string.
    @param n is the number of times user wants str to print.
    @return str 'n' number of times. 
    */
    public static String repeat(String str, int n){
        String repeated = "";
        for (int i = 0; i < n; i++){
            repeated += str;
        }
        return repeated;
    }
    
    
    /**
    Counts number of vowels in an entered string.
    @param str is the entered string.
    @return the total count of vowels within the entered string. 
    */
    public static int countVowels(String str){
        int vowelCount = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowelCount ++;
            }
        }
        return vowelCount;
    }
    
    
    /**
    Counts the number of words in entered string.
    @param str is the entered string.
    @return total count of words in the string. 
    */
    public static int countWords(String str){
        int wordCount = 0;
        str = str.trim();
        if (str == null || str.equals(" ")){
            return wordCount;
        }
        else{
            for (int i=0; i<str.length(); i++){
                if(str.charAt(i) == ' '){
                    wordCount ++;
                }
            }
            return wordCount + 1;
        }
    }
   
	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    
	    System.out.println("Enter in a string: ");
	    String str = in.nextLine();
	    
	    System.out.println("Enter in a number for repeat method: ");
	    int n = in.nextInt();
	    
	    //calls and prints the middle character(s) of entered string using 'middle' method
		System.out.println("The middle character(s): '" + middle(str) + "'");
		
		//calls 'repeat' method to print entered string the desired number of times
		System.out.println(repeat(str, n));
		
		//calls and prints the return value of 'countVowels' method
		System.out.println("The number of vowels in the entered string is: " + countVowels(str));
		
		//calls and prints the return value of 'countWords' method
		System.out.println("The number of words in the entered string is: " + countWords(str));
	}
}
