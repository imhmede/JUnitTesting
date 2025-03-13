import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pa13 {
    public static void main(String[] args) {
        // Prompt user to enter the file path
        System.out.print("Enter the name of the file including the path where it is located: ");
        String fileName = System.console().readLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                String[] nums = line.trim().split("\\s+");
                double column1 = Double.parseDouble(nums[0]);
                double column2 = Double.parseDouble(nums[1]);
                double average = (column1 + column2) / 2.0;
                System.out.println("line(" + lineNum + "): " + line);
                System.out.printf("Average = (%.2f + %.2f) / 2 = %.2f\n\n", column1, column2, average);
                lineNum++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

