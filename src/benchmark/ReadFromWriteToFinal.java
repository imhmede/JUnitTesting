import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Lauren Lofton 
 * CS 123 
 * 12/04/22
 */
public class ReadFromWriteToFinal {

    void WriteTo(String fileName, String line) throws IOException {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(new File(fileName), true));
            out.write(line);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //read data from file
    void ReadFrom(String fileName, String keyword) throws IOException {

        int numOfLines = 0;
        int totalLines = 0;
        int firstLocation = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            boolean first = true;
    //put data into array list
            ArrayList<String> lines = new ArrayList<String>();

            while ((line = reader.readLine()) != null) {
                lines.add(line);
                if (line.indexOf(keyword) != -1) {
                    numOfLines++;
                    if (first) {
                        firstLocation = totalLines;
                        first = false;
                    }
                }
                totalLines++;
            }
            reader.close();

            first = true;
    //loop through file data and pull all MSA lines
            for (int i = firstLocation; i < numOfLines; i++) {
                if (first) {
                    System.out.print(line);
                }
                line = lines.get(i);
                String[] result = line.split("   MSA");
                line = result[1];
                line = line.replaceAll("     ", ";");
                line = line.replaceAll("    ", ";");
                line = line.replaceAll("   ", ";");
                line = line.replaceAll("  ", ";");
                String[] tokens = line.split(";");

                WriteTo("./outputReport.txt", result[0] + Arrays.toString(tokens));

            }
            System.out.print(line);

            System.out.print("MSA lines" + numOfLines + " " + "Total size" + totalLines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ReadFromWriteToFinal rwFile = new ReadFromWriteToFinal();
            String fileName = "./finalData.txt";
            String keyword = "   MSA";
            rwFile.ReadFrom(fileName, keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
