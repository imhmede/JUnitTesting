import java.util.Scanner;
 public class grade {
    public static void main(String[] args)
    {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a letter grade: ");
   String letter = scanner.nextLine();
   char ch = letter.charAt(0);
   ch = Character.toUpperCase(ch);
   scanner.close();
if (ch >= 'A' && ch <= 'F' && ch != 'E')
{
    System.out.println("The numeric value of the letter grade " + letter + " is ");
    switch(ch)
    {
        case 'A': System.out.println(4); break;
        case 'B': System.out.println(3); break;
        case 'C': System.out.println(2); break;
        case 'D': System.out.println(1); break;
        case 'F': System.out.println(0); 
    }
  }
}
 }
