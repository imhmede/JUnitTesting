/**
 * This program counts the vowels of the word entered
 * Samuel Ortiz
 * 03-24-2023
 * */
 
import java.util.Scanner;
public class VowelCounter
{
    
	public static void main(String[] args)//main method 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");//prompts for input
		String word= in.next();//creating string for the input
		int VowTot = 0;// counter to count the vowels
		for (int i = 0; i < word.length(); i++)//for loop to check for vowels
		{
		    char vowel=word.charAt(i);//character to compare vowels at positions of the string
		    if (vowel=='a'|| vowel=='e'|| vowel=='i'|| vowel=='o'|| vowel=='u'|| vowel=='y')
		    VowTot++;//increase count of vowels
		}
		System.out.println("The word has "+VowTot + " vowels");//prints the result
	}
}
