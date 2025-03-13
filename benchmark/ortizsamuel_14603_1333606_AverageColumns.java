import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AverageColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.next();
        File file = new File(fileName);
        try {
            Scanner fileInput = new Scanner(file);
            double sum1 = 0;
            double sum2 = 0;
            int count = 0;
            while (fileInput.hasNextDouble()) {
                double num1 = fileInput.nextDouble();
                double num2 = fileInput.nextDouble();
                sum1 += num1;
                sum2 += num2;
                count++;
            }
            fileInput.close();
            double avg1 = sum1 / count;
            double avg2 = sum2 / count;
            System.out.println("Average of column 1: " + avg1);
            System.out.println("Average of column 2: " + avg2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
