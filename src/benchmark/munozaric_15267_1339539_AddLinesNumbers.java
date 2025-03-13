import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddLinesNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input file name from user
        System.out.print("Enter input file name: ");
        String inputFile = scanner.nextLine();

        // Get output file name from user
        System.out.print("Enter output file name: ");
        String outputFile = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int lineNumber = 1;

            // Read each line of the input file, add line number, and write to output file
            while ((line = reader.readLine()) != null) {
                writer.write("/* " + lineNumber + " */ " + line);
                writer.newLine();
                lineNumber++;
            }

            reader.close();
            writer.close();

            System.out.println("Line numbers added to " + inputFile + " and written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}