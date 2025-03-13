import java.util.Scanner;

public class StringComparison {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first string: ");
      String str1 = input.nextLine();

      System.out.print("Enter second string: ");
      String str2 = input.nextLine();

      if (str1.equals(str2)) {
         System.out.println("all the same");
      } else {
         System.out.println("neither");
      }
   }
}
