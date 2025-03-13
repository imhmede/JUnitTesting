import java.util.Scanner;
public class CompareStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1= sc.next();
        
        System.out.println("Enter the second string: ");
        String str2= sc.next();
        
        if(str1.compareToIgnoreCase(str2) > 0) System.out.println("Neither");
        if(str1.compareToIgnoreCase(str2) < 0) System.out.println("Neither");
        if(str1.compareToIgnoreCase(str2) == 0) System.out.println("All the  Same");
    }
}
        

    
