/*
Name: Caleb Palmares
Date: December 4th, 2022
Assignment title: Class Project
This program does the following:
1. Receives finalLayout.txt and finalData.txt as inputs. Must be in root directory.
2. Obtains all builder information from finalLayout.txt; retreives data from finalData.txt.
	finalData.txt is essentially used as a static database.
3. Create a report (Text or Excel) which shows both the Top Five and Bottom Five AGE and 
	RACE Layout Field Categories by Geographical Identifier and Data Field categories for the Geographical category "MSA"
4. Outputs this report outputReport.txt to file location set by user or default to root directory
5. The outputReport.txt is tabdelimited and can be imported into a spreadsheet processor for additional viewing
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.*;



/**
 * This is a program that parses data from a text file, processes it, and write data to another text file.
 * @author  Edited by Caleb Palmares. Original author: Essa Imhmed
 * @version 2.0, Dec 2022
 */

public class ReadFromWriteToFile{

    /**
     * Write data to a text file.
     * @param	fileName    The name of the text file.
     * @param	line	Data to write to the text file
     * @exception   FileNotFoundException   If the text file is not existed in the current directory
     */
   static void WriteTo(String fileName, String line) throws IOException {
		try{
			PrintWriter out = new PrintWriter(new FileOutputStream(new File(fileName), true));
			out.write(line);
			out.flush();
			out.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}


	/**
	 * Handle spaces
	 * @param line The line that needs to be updated to a delimiter
	 * @exception e Prints a stack trace of error
	 */

	static String IrregularSpacesToDelimiter(String line) throws IOException {
		try {
			String regex = "\\s+";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(line);
			line = matcher.replaceAll(";");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return line;
	}


	/**
	 * Read data from a text file using BufferedReader and get info from textual "database" and store as HashMap.
	 * @param	fileName    The name of the text file.
	 * @param	keyword The category used for finding the line to process
	 * @exception   FileNotFoundException   If the text file is not existed in the current directory 
	 * @return HashMap
	*/
	HashMap<Integer, String[]> Read_From_Data(String fileName, String keyword) throws IOException {

	HashMap<Integer, String[]> toUpdate = new HashMap<Integer, String[]>();

	try{
		BufferedReader reader = new BufferedReader(
			new FileReader(fileName));
			String line;
			String[] tokens;
			Integer index = 0;
			while((line = reader.readLine()) != null){
				if(line.indexOf(keyword) != -1){
					line = line.substring(line.indexOf(keyword));
					String res = new Scanner(line).useDelimiter("\\D+").next();
					line = line.substring(line.indexOf(res));
					line = IrregularSpacesToDelimiter(line);
					tokens = line.split(";");
					toUpdate.put(index, tokens);
					index++;
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.print("Must be in root direcotry: finalLayout.txt and finalData.txt");
			return null;
		}
	
		return toUpdate;
	
	}





	/**
	 * Read data from a text file using BufferedReader and get info from textual "database" and store as HashMap.
	 * @param	fileName    The name of the text file.
	 * @param	keyword The category used for finding the line to process
	 * @param index Index of metadata to be obtained
	 * @exception   FileNotFoundException   If the text file is not existed in the current directory 
	 * @return String of location
	*/
	String GetLocationString(String fileName, String keyword, Integer index) throws IOException {

	try{
		BufferedReader reader = new BufferedReader(
			new FileReader(fileName));
			
			String line;
			Integer newCntr = 0;

			while((line = reader.readLine()) != null){
				if(line.indexOf(keyword) != -1){
					String[] result = line.split(keyword);
					line = result[0].toString().trim();

						if(newCntr >= index){
							return line;
						}
							newCntr++;
						}
			}
	}catch(FileNotFoundException e){
		e.printStackTrace();
		return null;
	}

		return null;

	}



	/**
	 * Read data from a text file using Scanner.
	 * @param	fileName    The name of the text file.
	 * @param	keyword The category used for finding the line to process
	 * @exception   FileNotFoundException   If the text file is not existed in the current directory
	 */
	HashMap<String, Integer> Read_From_Layout(String fileName, String keyword) throws IOException {
		try{
			BufferedReader reader = new BufferedReader(
				new FileReader(fileName));
				String line;

				Integer categoryIndex = 0;

				//Set line index per category
				if(keyword.contains("SUM")){
					categoryIndex =+ 0;
				}
				if(keyword.contains("AGE")){
					categoryIndex =+ 3;
				}
				if(keyword.contains("RACE")){
					categoryIndex =+ 26;
				}
	
			HashMap<String, Integer> demographicID = new HashMap<String, Integer>();

			while((line = reader.readLine()) != null){

				if(line.indexOf(keyword)!= -1){
					String[] result = line.split(keyword);	
					demographicID.put(result[0].trim(), categoryIndex);
					categoryIndex++;
				}
			}	

		return demographicID;
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
			return null;
	}




	public static void main(String[] args){
	try{
		ReadFromWriteToFile rwFile = new ReadFromWriteToFile();

		//Receive user input
		Scanner firstScan = new Scanner(System.in);
		firstScan.useDelimiter("\n");
		System.out.print("Enter keyword, e.g. AGE or RACE: ");
		String firstInput = firstScan.nextLine().trim().toUpperCase();

		String finalLayoutFile = "./finalLayout.txt";
		String finalLayoutKeyword = firstInput;

		String finalDataFile = "./finalData.txt";
		String finalDataKeyword = " MSA";  //Category

		if(finalLayoutKeyword.equals("RACE")){
			finalDataKeyword = "CMSA";
		}

		HashMap<String, Integer> layoutFile = rwFile.Read_From_Layout(finalLayoutFile, finalLayoutKeyword);
		HashMap<Integer, String[]> dataFile = rwFile.Read_From_Data(finalDataFile, finalDataKeyword);

		HashMap< String, Integer > masterArray = new HashMap<String, Integer>();


		//Loop through all keys in layout and match to dataFile key
		for (String i : layoutFile.keySet()) {
			for (Integer j : dataFile.keySet()) {
				String getData = rwFile.GetLocationString(finalDataFile, finalDataKeyword, j);
				Integer ii = layoutFile.get(i);
				try {
					masterArray.put(getData + "|" + i + "|" + finalDataKeyword + "|" + finalLayoutKeyword + "|" + Integer.parseInt(dataFile.get(j)[ii]), Integer.parseInt(dataFile.get(j)[ii]));
				} catch (Exception e) {
				}

			}

		}
		//Create HashMap and sort desc
		Map<String, Integer> sortedByValueDesc = masterArray
		.entrySet()
		.stream() 
		.sorted(Map.Entry.<String, Integer>comparingByValue()
			.reversed())
			.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		//Create HashMap and sort asc
		Map<String, Integer> sortedByValue = masterArray
			.entrySet()
			.stream()
			.sorted(Map.Entry.<String, Integer> comparingByValue())
			.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		String dataOutput = "";

		int maxCntr      = 1;
		int maxCntrBreak = 5;

		String[] newArr = new String[maxCntrBreak + 1];
		int cntr = 0;
		for (String k : sortedByValue.keySet()) {
			newArr[cntr] = k;
			if (cntr >= maxCntrBreak){
				break;
			}
			cntr++;
		}

		for (String j : sortedByValueDesc.keySet()) {
			
			String[] splitOutput = j.split("\\|");

			String aliasArr[] = newArr;
		
			if(maxCntr == 1){
				dataOutput = "CATEGORY: " + finalDataKeyword + "\n" 
					+ "TOP " + maxCntrBreak + "\t\t\t\tBOTTOM " + maxCntrBreak + "\t\t\t\n" +
					"Type\tGEOGRAPHIC IDENTIFIER\tDEMOGRAPHIC\tPOPULATION\tType\tGEOGRAPHIC IDENTIFIER\tDEMOGRAPHIC\tPOPULATION\t\n";
				dataOutput += "" + finalLayoutKeyword + "\t" + splitOutput[0] + "\t"+ splitOutput[1] + "\t"+ splitOutput[4] + "\t" + "AGE"+ "\t" + aliasArr[maxCntr - 1].replaceAll("\\|", "\t") + "\n";	
			}else{
				dataOutput += "" + finalLayoutKeyword + "\t" + splitOutput[0] + "\t" + splitOutput[1] + "\t"+ splitOutput[4] + "\t" + "AGE" + "\t" +  aliasArr[maxCntr - 1].replaceAll("\\|", "\t") + "\n";
			}
			
		if (maxCntr >= maxCntrBreak){
			break;
		}
			maxCntr++;
		}

		Scanner inScanner = new Scanner(System.in);
		inScanner.useDelimiter("\n");
		System.out.print("Enter input file path root directory to write file. \n Submit a null value to save to root directory:");
		String inFile = inScanner.next();
      
		if (inFile.isEmpty() || inFile.equals(" ")) { 
			inFile = "./";
	   }

		String filePath = inFile + "finalOutput.txt".trim();
		System.out.println("File will be saved here: " + filePath);
		inScanner.close();
		try{
			WriteTo(filePath, dataOutput);
		}catch(IOException e){
			e.printStackTrace();
	  	}

		System.out.println("Data written");
		System.out.println(dataOutput);

		}catch(IOException e){
		e.printStackTrace();
		}
	}

}
