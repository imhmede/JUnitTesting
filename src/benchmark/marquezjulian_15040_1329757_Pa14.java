import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pa14 {

    public static void main(String[] args) {
        String inputFileName, outputFileName;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        int lineNumber = 1;

        // Prompt user for input and output file names
        System.out.print("Enter input file name: ");
        inputFileName = System.console().readLine();
        System.out.print("Enter output file name: ");
        outputFileName = System.console().readLine();

        try {
            reader = new BufferedReader(new FileReader(inputFileName));
            writer = new BufferedWriter(new FileWriter(outputFileName));

            // Read each line of the input file and write to output file with line number
            String line = reader.readLine();
            while (line != null) {
                if (!line.trim().isEmpty()) {// ignore empty lines
                    writer.write("/* " + lineNumber + " */ " + line);
                    writer.newLine();
                    lineNumber++;
                }
                else {
                    writer.write(line);
                    writer.newLine();
                }
                line = reader.readLine();
            }

            System.out.println("File processed successfully.");

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }

}
