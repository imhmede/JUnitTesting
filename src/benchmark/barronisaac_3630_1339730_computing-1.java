import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class computing {
    public static void main(String[] args) throws FileNotFoundException
     {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input File Name: ");
    String iFile = scanner.next();
    System.out.print("Output File Name: ");
    String oFile  = scanner.next();

    File inputFile = new File(iFile);
    File outputFile = new File(oFile);

    Scanner fileReader = new Scanner(inputFile);
    PrintWriter writer = new PrintWriter(outputFile);
    int lineNumber = 1;

    while (fileReader.hasNextLine())
    {
        String line = fileReader.nextLine();
        writer.println("/* " + lineNumber + " */ " + line);
        lineNumber++;
    }
    scanner.close();
    fileReader.close();
    writer.close();
    }
}
        


