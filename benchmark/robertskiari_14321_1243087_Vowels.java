  /**
  * this program states the number of vowels in a word. 
  *@Kiari Roberts
  *@2023-24-10
* */
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String str = in.nextLine();
//this lets the user enter in a word and the string allows the program to read the word
            System.out.print("The number of vowels " + count_Vowels(str)+"\n");
            //this prints out how many vowels t
        }
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
  