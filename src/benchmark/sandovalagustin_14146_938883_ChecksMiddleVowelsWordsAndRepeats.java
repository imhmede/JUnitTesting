/*
Agustin Sandoval
Lab_5b
10-30-22
CS 123
Purpose: This program uses the main function to call 4 other functions. The first function (a) returns the middle character/s of a string. 
the second function (b) takes a string and an integer as an argument, it then repeats the string, according to the integer. 
The third function (c) checks how many upper or lower case vowels are in a string. the fourth function (d) checks how many words are in a string.
*/

	
public class ChecksMiddleVowelsWordsAndRepeats
{
	public static void main(String[] args)
	{

	System.out.println(middle("hello"));										// all methods are called and displayed
	System.out.println(repeat("hello",3));
	System.out.println(countVowels("hello world"));
	System.out.println(countWords("hello world"));
	}

	/**
	Takes string and returns middle or middle characters
	@param str the string that is being analyzed
	@return middleOfString  a string containing the middle character/s 
	*/
	public static String middle(String str)										// method (a)
	{
		
		
		int lengthOfString = str.length();										// gets the length of the string
		String middleOfString;													// middleOfString will store the middle characters of a string
		
		if (lengthOfString % 2 == 0)											// checks if the length of string is even 
		{																		// string will have 2 middle characters if even
			char middleChar1 = str.charAt((lengthOfString / 2));				// use the string's index to find one of the middle characters.. 
																				//... by dividing the length of the string by 2 and seting it as an index position.
			char middleChar2 = str.charAt(((lengthOfString / 2) - 1));			// get the first character in the middle, subtract index position by 1 to get...
																				//...the first character in the middle
			middleOfString = "" + middleChar2 + middleChar1;					// middle characters are stored as a string 
			
		}
		else 																	// analyzes an odd string, will have one middle character if so
		{
			char middleChar = str.charAt((int)(Math.floor(lengthOfString / 2)));//uses the string's index to find one of the middle characters...
																				//...by dividing the length of the string by 2 and setting it as an index position
																				// must be floored to have its index position considered
			middleOfString = middleChar + "";									// middle character turned in to a string								
			
		}
		
		return middleOfString;													// the middle character/s are returned
	}
	
	/**
	Takes string and repeats it n times
	@param str the string that will be repeated
	@param int the amount of times the string will be repeated
	@return repeatedString a string that has been repeated 
	*/
	public static String repeat(String str, int n)								// method (b)
																				// brings in string and int as arguements
	{
		String repeatedString = "";												// string that holds the repeated string, is declared
		for (int i = 0; i < n; i++)												// used a for-loop to repeat string n times
		{
			repeatedString = repeatedString + str;								// repeatedString is updated with each iteration 
		}
		
		
		return repeatedString;													// string with repeats is returned 
	}
	
	/**
	Takes string and checks how many vowels are in it
	@param str the string that will be checked for vowels
	@return repeatedString a string that has been repeated 
	*/
	public static int countVowels(String str)									// method (c)
	{
		int vowelCounter = 0;													// keeps track of vowel count
		int stringLength = str.length();										// gets string length
		
		for (int i = 0; i < stringLength; i++)									// sets string length as the amount of times the loop will iterate
		{
			char charOfString = str.charAt(i);									// creates a character for each character of string using each index
			
																				// each character will be checked if a lower case vowel
			if (charOfString == 'a' || charOfString == 'e' || charOfString == 'i' || charOfString == 'o' || charOfString == 'u')
			{
				vowelCounter ++;												// if so the vowel count is updated
			}
			else if (charOfString == 'A' || charOfString == 'E' || charOfString == 'I' || charOfString == 'O' || charOfString == 'U')
			{																	// else statement checks for capitalized vowels
				vowelCounter ++;
			}
		}
		return vowelCounter;													// number of vowels is returned
	}
	
	
	/**
	Takes string and checks how many words are in it
	@param str the string that will be checked for number of words
	@return wordCount an int that represents the number of words in string
	*/
	public static int countWords(String str)                       				// method (d)
																				// method uses spaces to determine the word count in string
	{
		int wordCount = 1;														// word count will store the number of spaces in string which...
																				//... in most cases goes up with each new word
		int stringLength = str.length();										// string's length is gathered
		for (int i = 0; i < stringLength; i++)									// for loop will iterate through string
		{
			char charOfString = str.charAt(i);									// each character will be checked according to its index
			if (charOfString == ' ')
			{
				wordCount ++;													// if space is found than word count is updated
			}
				
		}
		
		return wordCount;														// number of words in string is returned
	}		
}
