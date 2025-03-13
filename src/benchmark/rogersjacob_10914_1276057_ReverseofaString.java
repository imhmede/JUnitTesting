//Jacob Rogers
//CS 123P
//April 7, 2023

import java.util.Scanner;

public class ReverseofaString {
    public static String reverse(String str) {	
        if (str.isEmpty()) {	
            return str;	
        } else {
            return reverse(str.substring(1)) + str.charAt(0);	
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    
        System.out.println("Enter a word:");	
        String input = sc.next();				
        System.out.println(reverse(input));		
    }
}