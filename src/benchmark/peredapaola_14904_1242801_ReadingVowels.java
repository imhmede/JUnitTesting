/**This program uses for loop to read a word and prints the number of vowels
 * Paola Pereda
 * 2023-03-24
 * PA07
*/

import java.util.Scanner;

public class ReadingVowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = in.next().toLowerCase();
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            char n = word.charAt(i);
            if( n == 'a' ||  n == 'e'|| n == 'i' || n == 'o' || n == 'u'|| n == 'y')
            {
                count++;
            }
        }
        System.out.println("The number of vowels in " + word + " " + " is " + count);


    }

} 