import java.util.Scanner;
public class string {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String second = scanner.nextLine();
        
    if (same(first, second))
        System.out.println("All the same");
    else
        System.out.println("neither");
        scanner.close();
    }
public static boolean same (String first, String second)
{
    if (first.equals(second))
    {
        return true;
    }
    else   
    {
        return false;
    }
} 

}
