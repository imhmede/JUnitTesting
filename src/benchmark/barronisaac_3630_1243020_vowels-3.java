import java.util.Scanner;
public class vowels {
 
public static void main(String[] args)
{
 int count = 0;
 System.out.println("Enter a word: ");
 Scanner sc = new Scanner(System.in);
 String word = sc.nextLine();
 
for (int i=0 ; i < word.length(); i++)
 {
    char ch = word.charAt(i);
    if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch =='o'|| ch == 'u'|| ch == ' ')
    {
        count++;
    }
 }
 System.out.println("The number of vowles in " + word + " is " + count);
 sc.close();
 }
}
