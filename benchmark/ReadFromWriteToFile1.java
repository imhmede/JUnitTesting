import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
/**
 *This is a prgoram that parses data from txt file, proceses it and writes a new file
 *@author jmancilla
 *@version 1.0 Dec 2022
 */
public class ReadFromWriteToFile {
	
	/**
	 * 
	 * @param fileName The name of file
	 * @param line Data to write to file
	 * @throws IOException if error occurs
	 */
	void WriteTo(String fileName, String line) throws IOException{
	try {
		PrintWriter out = new PrintWriter(fileName);
		out.printf("%s\n", line);
		out.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	}
	/**
	 * Read data from text file using scanner
	 * @param fileName Name of txt.file
	 * @throws IOException If file is not found
	 */
	void ReadFrom(String fileName, String keyword) throws IOException {
	try {
		Scanner in = new Scanner(new File(fileName));
		String[][] numbers = new String[4][13];
		int i =0;
		while(in.hasNextLine() && i < 4){
		String line = in.nextLine();
		
			if(line.indexOf(keyword) != -1) {
			String[] tokens = line.split(" DIV");
				int j = 0;
				int k = 4;
				while(j < 13) {
				numbers[i][j] = tokens[k];
				j ++;
				k++;
				}
			i++;
			}
		} 
			
		for( i =0; i < 4; i++) {
			for(int j = 0; j <13; j++) {
				System.out.print(numbers[i][j] + " \t");
			}
			System.out.println();
		}
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
}	
	public static void main(String[] args){
		
	try{
		ReadFromWriteToFile rwFile = new ReadFromWriteToFile();
		String fileName = "C:\\Users\\jmancilla\\Documents\\Java\\Class Project\\finalData.txt";
		String keyword = " DIV";
		rwFile.ReadFrom(fileName, keyword);
	}
	catch(IOException e)
	{e.printStackTrace();		
	}
	}
}

