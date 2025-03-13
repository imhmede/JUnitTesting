import java.util.Scanner;
public class vowels {
public static void main(String[] args)
{ 
/**
 * Declare and scan in variables.
 */ 
int vcount = 0;
Scanner in = new Scanner(System.in);
System.out.println("Please enter a Word: ");
String word = in.nextLine();
/**
 * use for loop to evaluate each character in word and compare against the vowels in alphabet.
 */
for(int i =0 ; i<word.length(); i++)
{
    if(word.charAt(i) =='A' || word.charAt(i) == 'a' || word.charAt(i) == 'E' || word.charAt(i) == 'e' ||
      word.charAt(i) == 'I' || word.charAt(i) == 'i' || word.charAt(i) == 'O' || word.charAt(i) == 'o' ||
      word.charAt(i) == 'U' || word.charAt(i) == 'u' || word.charAt(i) == 'Y' || word.charAt(i) == 'y')
    vcount++;
    
}
System.out.println("The number of vowels in "+ word +" is " +vcount);

}

    
}
