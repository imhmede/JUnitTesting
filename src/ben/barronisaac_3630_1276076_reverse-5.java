import java.util.Scanner;
public class reverse {

/**
 * @param args
 */
 public static void main(String[] args)
{
    char ch;
    String nstr = "";
    System.out.println("Enter a word: ");
    try (Scanner sc = new Scanner(System.in)) {
        String word = sc.nextLine();

 for(int i=0 ; i<word.length() ; i++)
 {
   ch = word.charAt(i);
   nstr = ch + nstr;
 }
    }
        System.out.println(nstr);
}


}
