import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("All the same");
        } else {
            System.out.println("Neither");
        }

        scanner.close();
    }
}
