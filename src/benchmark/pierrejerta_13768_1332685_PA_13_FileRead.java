import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PA_13_FileRead {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of the file: ");
        try{
            String file_name = in.nextLine();
            // Remove leading and trailing spaces from the filename
            file_name = file_name.trim();

            BufferedReader bufferedReader = null;
            // Instantiate column values and sums
            float col1_sum=0,col2_sum=0,col1_value=0,col2_value=0;
            int line_count=0;

            String curLine;
            
            // Open a file with the provided file name
            File inputFile = new File(file_name);
            FileReader reader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(reader);
            while ((curLine = bufferedReader.readLine()) != null){
                // Split each line based on spaces or tabs
                String[] line_columns = curLine.split("\\s+");
                // Cast column values to float
                col1_value = Float.parseFloat(line_columns[0]);
                col2_value = Float.parseFloat(line_columns[1]);
                // Get tehe sum of each column
                col1_sum = col1_sum + col1_value;
                col2_sum = col2_sum + col2_value;
                //The count of lines
                line_count = line_count + 1;
                System.out.println(curLine);
            }

            if (bufferedReader != null)
                bufferedReader.close();

            // Compute the average of each column
            float col1_avg=0,col2_avg=0;
            col1_avg = col1_sum / line_count;
            col2_avg = col2_sum / line_count;
            System.out.println("Column1 Average = " + col1_avg);
            System.out.println("Column2 Average = " + col2_avg);
        }catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }  
    }
}
