import java.util.Scanner;

public class pa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        int diff = num1 - num2;
        System.out.println("The difference is: " + diff);

        int product = num1 * num2;
        System.out.println("The product is: " + product);

        double avg = (num1 + num2) / 2.0;
        System.out.println("The average is: " + avg);
        scanner.close();
    }
}
