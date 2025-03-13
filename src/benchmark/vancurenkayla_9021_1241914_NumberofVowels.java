import java.util.Scanner;

public class NumberofVowels
{

    public static void main(String[] args) {

        String s;
        
        System.out.println("Enter a word: ");
        Scanner in = new Scanner(System.in);
        s = in.next();
        int count = 0;
        char ch;

        for (int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y'){
                count++;
            }
        }

        System.out.println("The number of vowels in " + s + " is " + count);
	}
}