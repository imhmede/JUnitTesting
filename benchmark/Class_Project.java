import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Class_Project 
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\jmancilla\\Documents\\Java\\Class Project\\finalData.txt");
		Scanner in = new Scanner(file);
		 
		 
		//Need while statment to check for content in file
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			if(line.indexOf(" DIV") != -1) 
			{
				String[] result = line.split(" DIV");
				line = result[1];
				System.out.println(result);
				line = line.replaceAll("  " , ";");
				line = line.replaceAll(" ", ";");
				String[] tokens = line.split(";");
				WriteTo("./outputReport.txt", result[0] + Arrays.toString(tokens));
				//WriteTo("./outputReport.txt", result[0] + Arrays.toString(tokens));
				//System.out.println(result[1]);
			}
		}
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	public static void main(String[] args) {
	try {
		ReadFromWriteToFile rwFile = new ReadFromWriteToFile();
		String fileName = "./finalData.txt";
		String keyword = " DIV";
		rwFile.Read_From(fileName, keyword);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
