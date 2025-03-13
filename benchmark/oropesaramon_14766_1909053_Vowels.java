/**
*This program counts the number of vowels in a string
*@author: Ramon Oropesa
*October 31, 2023
*/

import java.util.Scanner;
public class Vowels {

/**
*This methods counts vowels
*@param args a list of possible command-line arguments
*/

public static void main(String[] args) {
Scanner in = new Scanner (System.in); 

System.out.println("Enter a word or phrase: "); 
String phrase = in.nextLine(); 

int index=0;
int phraseLength = phrase.length();
int vowelCounter = 0;

for( int i = 0; i < phrase.length(); i++)
    {
      char currentLetter = phrase.charAt(i);
      if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' ||currentLetter == 'o' ||currentLetter == 'u')
        {
          vowelCounter++;
          
        }
    }
    System.out.println("The number of vowels is: " + vowelCounter); 
  } 
}