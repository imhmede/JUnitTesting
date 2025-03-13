import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a program that parses data and writes to another file
 */
public class ParseFile {
	/**
	 * Read data from txt.file
	 * @param fileName name of file
	 * @param Keyword used to find category
	 * @exception FileNotFoundException if file doesnt exist
	 */
	void read(String fileName, String delimeter) throws IOException{
		try {
			Scanner in = new Scanner(new File(fileName));
			String[][] numbers = new String[4][13];
			int i = 0;
			while(in.hasNextLine() && i < 4) {
				String line = in.nextLine();
				if(line.indexOf(delimeter) != -1){
					String[] tokens = line.split(delimeter);
					int j = 0;
					int k = 4;
					while(j < 13) {
						numbers[i][j] = tokens[k];
						j ++;
						k++;
					}
					i++;
				}
				for(i = 0; i <4; i++) {
					for(int j = 0; j<13; j++) {
						System.out.print(numbers[i][j] + "\t");
					}
					System.out.println();
				}
			
		} catch(FileNotFoundException e){
				e.printStackTrace();
		}
		
	}

		
	public static void main(String[ args]) {
			try {
				String fileName = "C:\\Users\\jmancilla\\Documents\\Java\\Class Project\\finalData.txt";
				String delimter = ";";
				ParseFile parser = new ParseFile();
				
				parser.read(fileName,  delimter);
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	

	


