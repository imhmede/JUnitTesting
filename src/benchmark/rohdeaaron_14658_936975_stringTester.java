/* Aaron Rohde - CS123
 * Assignment:  Lab 5b
 * Due:     10/30/2022
 */
import java.util.Scanner;

public class stringTester {
    /**
     * Prompts for what kind of string interaction you desire from 4 choices.
     * Avaiable choices are: middle characters, string repeat, counting the
     * vowels, and counting the words present.
     * @param args Support not implemented
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int whichTask;
        String userStr;
        String processedString;
        int wordRepeatCounter = 0;
        char quote = '"';
        System.out.println("Please enter the number for the string task you");
        System.out.println("want to test from the list below.");
        System.out.println("1) Find the middle character(s) of a word");
        System.out.println
           ("2) Duplicate a word or phrase as many times as requested ");
        System.out.println
           ("3) Count how many vowels are in the word or phrase provided");
        System.out.println
           ("4) Count how many words are in the phrase provided");
        System.out.printf("%nPlease enter your choice: ");
        whichTask = Integer.parseInt( in.nextLine() );

        switch ( whichTask ) {
            case 1:
             System.out.print
                ("Please enter the word to find the middle character(s) of: "); 
             break;

            case 2:
             System.out.print
                ("Please enter the word or phrase to duplicate: ");
             break;
            
            case 3:
             System.out.print
                ("Please enter the word or phrase to count vowels in: ");
             break;

            case 4:
             System.out.print
                ("Please enter the phrase to count the number of words in: ");
             break;

            default:
             System.out.print
               ("Please enter the word to find the middle characters of: ");
             break;
        }
        userStr = in.nextLine();
        if ( whichTask == 2 )
        {
            System.out.print
              ("Please enter how many times to repeat the word or phrase: ");
            wordRepeatCounter = in.nextInt();
        }
        switch ( whichTask ) {
            case 1:
             processedString = middle( userStr );
             System.out.printf
                ("The middle character(s) of %s are %c%s%c", userStr,
                 quote, processedString, quote); 
             break;

            case 2:
             processedString = repeat( userStr, wordRepeatCounter );
             System.out.printf("The repeat of %s %d times is %c%s%c", userStr,
             wordRepeatCounter, quote, processedString, quote); 
             break;
            
            case 3:
             processedString = Integer.toString( countVowels( userStr ) );
             System.out.printf("The number of vowels in %s is %s", userStr,
                processedString); 
             break;

            case 4:
             processedString = Integer.toString( countWords( userStr ) );
             System.out.printf("The number of words in %s is %s", userStr,
                processedString); 
             break;

            default:
             processedString = middle( userStr );
             System.out.printf
                ("The middle character(s) of %s are %c%s%c", userStr,
                quote, processedString, quote); 
             break;
        }
    }
    /**
     * Returns a string containing the middle character(s) in str.
     * If the length of the str is odd, or the two middle characters if the
     *  length of str is even. For example, middle("higher") returns "gh".
     * @param str
     * @return
     */
    public static String middle(String str)
    {
        int stringLength = str.length();
        int middleCharNumber = stringLength / 2;
        String middleLetters = "";
        if ( ( stringLength % 2 ) == 0)
        {
            middleLetters = 
              Character.toString(str.charAt( middleCharNumber - 1 )) 
              + str.charAt( middleCharNumber );
        } else {
            middleLetters = 
              Character.toString(str.charAt( middleCharNumber ));
        }
        return middleLetters;
    }
    /**
     * Returns the string str repeated n times.
     * Example: repeat("up", 3) returns "upupup".
     * @param str
     * @param n
     * @return
     */
    public static String repeat(String str, int n) 
    {
        // capture unplanned 0 count and allow a return of ""
        String repeatedString = "";
        for ( int i = 0; i < n; i++ ) {
            repeatedString = repeatedString + str;
        }
        return repeatedString;
    }
    /**
     * Returns a count of all vowels in the string str.
     * Vowels are the letters a, e, i, o, and u, and converted to lowercase to
     * capture the uppercase variants with simpler logic.
     * @param str
     * @return
     */
    public static int countVowels(String str)
    {
        String lowercaseStr = str.toLowerCase();
        int vowelCount = 0;
        for ( int i = 0; i < lowercaseStr.length(); i++)
        {
            switch (lowercaseStr.charAt(i)) {
                case 'a':
                 vowelCount++;
                 break;
                case 'e':
                 vowelCount++;
                 break;
                case 'i':
                 vowelCount++;
                 break;
                case 'o':
                 vowelCount++;
                 break;
                case 'u':
                 vowelCount++;
                 break;
                default:
                 break;
            }
        }
        return vowelCount;
    }
    /**
     * Returns the count of all words in str input.
     * @param str
     * @return
     */
    public static int countWords(String str)
    {
        int wordCount = 0;
        String[] strArray;
        strArray = str.split(" ");
        wordCount = strArray.length;
        return wordCount;
    }
}
