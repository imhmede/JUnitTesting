import java.util.Scanner;

public class PA_08_MultiplicationTable {
    public static void main(String[] args) {
        // Variable declarations
        int num = 0;
        
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Get the user inputs
        System.out.println("Enter a number between 1 and 12:");
        num = sc.nextInt();
        
        // Declare a while-loop iterator, assign it value 0
        int i = 0;
        while(i <= 12){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
