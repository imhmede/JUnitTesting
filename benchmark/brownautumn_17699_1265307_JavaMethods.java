import java.util.Scanner;

public class JavaMethods
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        in.close();
        if (allTheSame(a,b,c) == true)
        {
            System.out.println("All the numbers are the same.");
        }
        if (allDifferent(a,b,c) == true)
        {
            System.out.println("All the numbers are different.");
        }
        if (Sorted(a,b,c) == true)
        {
            System.out.println("All the numbers are sorted from smallest to largest.");
        }
    }

    public static boolean allTheSame(int a, int b, int c)
    {
        return a == b && b == c;
    }
    public static boolean allDifferent(int a, int b, int c)
    {
        return a != b && b != c && c != a;
    }
    public static boolean Sorted(int a, int b, int c)
    {
        return a <= b && b <= c && c >= a;
    }
}
