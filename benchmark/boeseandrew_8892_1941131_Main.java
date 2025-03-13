/**
 PA 05
 Andrew Boese
 CS 123
 Essa Imhmed
 10/31/23
 */
import java.util.Scanner;
/**
 this code asks for a strings and then counts the vowels and give the results to the user
 */
public class Main {
    public static void main(String[] args)
    {
        int Vowels = 0;
        System.out.println("Enter a word:");
        Scanner input_1 = new Scanner(System.in);
        String word = input_1.nextLine();

        for(int N=0; N< word.length(); N++){
            if(word.charAt(N) == 'a'|| word.charAt(N) == 'e'||
                    word.charAt(N) == 'i' || word.charAt(N) == 'o' ||
                    word.charAt(N) == 'u')
                    Vowels ++;
        }

        System.out.println("The number of vowels in hello is " + Vowels);
    }
}