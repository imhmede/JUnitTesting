import java.util.Scanner;


public class stringRev {
    /**
     * Below is the String Reverse Recurssion method. This reverse's characters then adds character 0 to the end to complete reversal.
     * @param str
     * @return
     */
    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args)
    {
      /**
       * This code scans in the word to be reversed then calls the reversal method and prints results.
       */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Word");
      String word = in.next();
    
      System.out.println(""+reverse(word));
      

    }

}
