import java.io.*;
import java.util.Scanner;
public class column {

    public static void main(String[] args) throws FileNotFoundException{
        File numsFile = getFile();
        double[][] numsArray = new
        double[getNumRows(numsFile)]
        [getNumCols(numsFile)];
        fillArray(numsArray, numsFile);
        double[]averages = new 
        double[getNumCols(numsFile)];
        fillAveragesArray(numsArray, averages);
        printAverages(averages);
    }

    public static File getFile(){
        Scanner scanner = new
    Scanner(System.in);
     System.out.print("Enter the name of the file including the file extension: ");
      String filename = scanner.nextLine();
      
      File numsFile = new File(filename);
      return numsFile;
    }

    public static int getNumCols(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);

        String[] columns = scanner.nextLine().split("\\s+");

        return columns.length;
    }
     
    public static int getNumRows(File file)
    throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        int numRows = 0;
        while (scanner.hasNextLine()){
            scanner.nextLine();
            numRows++;
        }
        return numRows;
    }

    public static void fillArray(double[][] array, File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        for(int i = 0; i < array.length; i++){
            Scanner lineScanner = new
        Scanner(scanner.nextLine());
        for(int j = 0; j < array[0].length; j++){
            array[i][j] = lineScanner.nextDouble();
          }
        }
      }
      public static void fillAveragesArray(double[][] vals, double[] averages){
        for(int i = 0; i < averages.length; i++){
            double sum = 0;
        for(int j = 0; j < vals.length; j++){
            sum += vals[j][i];
        }
          averages[i] = sum / vals.length;
        }
      }

      public static void printAverages(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("\nAverage for column %d is %.2f", i + 1, array[i]);
        }
        
      }
      scanner.close();
    }

