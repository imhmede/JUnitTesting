
//ReverseString.java
import java.util.Scanner;

 class writeArecursive
 {
  public static String reverse(String str) {
    int len = str.length();
    String result = "";
    //for(int i = 0;i<len;i++){
    for (int i = len - 1; i >= 0; i--) {
      //result += str.substring(len - i - 1,len - i - 1+1);
      result += str.charAt(i);
    }
    return result;
  }

  public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter string: ");
    String str = in.nextLine();
    System.out.println("Reversed string: "+ reverse(str));
    in.close();
  }
}
