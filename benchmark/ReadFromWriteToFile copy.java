/*
Agustin Sandoval
project
CS 123
12-4-22
Purpose: this program reads a text file that includes the populations for age groups and races for various locations. the program 
organizes the populations by top 5 and bottom 5 for age and race groups for each city/town. the program then writes to / creates a new
text file with the new data.
*/
import java.io.File;
import java.io.FileReader;					// this import allows for text files to be read.
import java.io.PrintWriter;					// this import allows for the program to write to another text file. 
import java.io.FileOutputStream;
import java.io.FileNotFoundException;		// this import allows for the program to run when the a file has not yet been created or exists.
import java.util.Scanner;
import java.io.IOException;					// this import allows for the program to run without crashing by excluding various unintended errors 
import java.util.Arrays;
import java.util.Collections;				// this import allows for arrays to get sorted in a descending ordder.

/**
 * This is a program that parses data from a text file, processes it, and write data to another text file.
 * @author  Agustin Sandoval with help from Essa Imhmed
 * @version 1.0, Nov 2022
 */

public class ReadFromWriteToFile{

    /**
     * Write data to a text file.
     * @param	fileName    The name of the text file.
     * @param	line	Data to write to the text file
     * @exception   FileNotFoundException   If the text file is not existed in the current directory
     */

    void WriteTo(String fileName, String line) throws IOException {										// this method is used to write to a new text file
	try{																								// various unintended errors will be excluded
	    PrintWriter out = new PrintWriter(new FileOutputStream(new File(fileName), true));
	    out.write(line);
	    out.flush();
	    out.close();
	}catch(FileNotFoundException e){
	    e.printStackTrace();
	}

    }

    /**
     * Read data from a text file using Scanner.
     * @param	fileName    The name of the text file.
     * @param	keyword The category used for finding the line to process
     * @exception   FileNotFoundException   If the text file is not existed in the current directory
     */

    void Read_From(String fileName, String keyword) throws IOException {		// this method is used to read text files
	try{
	    Scanner in = new Scanner(new File(fileName));							// a scanner will be used to read a text file, after it is created into an object
	    
	    // 2d arrays are created to store the populations as elements
	    // each array will have 158 rows. arrays that hold age group populations will evaluate 12 collums.
	    // arrays that hold race groups will evaluate 18 collumns.
	    
	    Integer[][] topNumbersAge = new Integer[158][12];						
	    int[][] bottomNumbersAge = new int[158][12];
	    Double[][] topNumbersRace = new Double[158][18];
	    double[][] bottomNumbersRace = new double[158][18];
	    
	    int i = 0;					// every time a new row is read i will increase
	    
	    
	    while(in.hasNextLine() && i < 158)   // this while loop checks if the line that is being read is empty and within the range of the specified location MSA
	    {
	    	
	    	String line = in.nextLine();			// this string holds each line that is being read
	    	if(line.indexOf(keyword)!= -1)			// if a line indludes "MSA" than it is further analyzed 
	    	{
		    
	    		
	    		String [] results = line.split("MSA"); 		// the line that is being read is turned into a array with 3 elements, split at MSA
	    		line = results[2];								// element 3 holds the numeric values, and is stored in line
	    		line = line.replaceAll("      ", "     ");		// the line is striped of unwanted spaces to create an array with only numbers
	    		line = line.replaceAll("     ", "    ");		// some numbers are seperated by 6,5,4,3,2,1 spaces.
	    		line = line.replaceAll("    ", "   ");
	    		line = line.replaceAll("   ", "  ");
	    		line = line.replaceAll("  ", " ");
	    		line = line.replaceAll(" ", ";");
	    		
	    		String[] tokens = line.split(";");				// tokens holds only numeric values for each element
	    		
	    		int j = 0;										// j is used to add the 12 elements for each row
	    		int k = 4;										// k makes sure the populations related to age are considered
	    		while(j < 12)
	    		{
	    			topNumbersAge[i][j] = Integer.parseInt(tokens[k]);			// each element is turned into a integer and aded to the 2d array that will hold the top 5 populations 
	    			bottomNumbersAge[i][j] = Integer.parseInt(tokens[k]);		// action is repeated for the 2d array that holds bottom 5 populations
	    			
	    			j++;						// j is updated for each collumn
	    			k++;						// k is updated in order to evaluate a new element
		    	
	    		}
	    		j = 0;							// similar actions are repeated for the arrats that will hold the population values for race catagory
	    		k = 25;							// this array analyzes 25 collumn related to race
	    		while(j < 18)
	    		{
	    			topNumbersRace[i][j] = Double.parseDouble(tokens[k]);
	    			bottomNumbersRace[i][j] = Double.parseDouble(tokens[k]);
	    			
	    			j++;
	    			k++;
		    	
	    		}
	    		
		    i++;						// i is updated to consider a new line
		    
	    	}
	    	
	    	
	    // for loops are used to arrange the new 2d arrays with its values in ascending or descending order
	    	
	    	
	    	
	    }
	    for (int p = 0; p < topNumbersAge.length; p++) {
            Arrays.sort(topNumbersAge[p], Collections.reverseOrder());
        }
	    for (int p = 0; p < bottomNumbersAge.length; p++) {
            Arrays.sort(bottomNumbersAge[p]);
	    }
	    
	    
	    for (int p = 0; p < topNumbersRace.length; p++) {
            Arrays.sort(topNumbersRace[p], Collections.reverseOrder());
        }
	    for (int p = 0; p < bottomNumbersRace.length; p++) {
            Arrays.sort(bottomNumbersRace[p]);
	    }
	    
	    
	    WriteTo("./outputReport.txt"," Top 5 AGE populations for MSA \n\n");			// discription is wrote on new text file
		
	    for(i = 0; i < topNumbersAge.length; i++)										// for loops display the first 5 elements of each row 
	    {
            for(int j = 0; j < 5; j ++)
            {
            	WriteTo("./outputReport.txt",topNumbersAge[i][j] +  "\t");
                
                
            }
            WriteTo("./outputReport.txt", "\n");
        }
	    WriteTo("./outputReport.txt", "Bottom 5 AGE populations for MSA \n\n");
	    
	    for(i = 0; i < bottomNumbersAge.length; i++)
	    {
            for(int j = 0; j < 5; j ++)
            {
            	WriteTo("./outputReport.txt", bottomNumbersAge[i][j] + "\t");
                
                
            }
            WriteTo("./outputReport.txt", "\n");
        }
	    
	    
	    
	    WriteTo("./outputReport.txt"," Top 5 RACE populations for MSA \n\n");
	    
	    for(i = 0; i < topNumbersRace.length; i++)
	    {
            for(int j = 0; j < 5; j ++)
            {
            	WriteTo("./outputReport.txt",topNumbersRace[i][j] +  "\t");
                
                
            }
            WriteTo("./outputReport.txt", "\n");
        }
	    WriteTo("./outputReport.txt"," Bottom 5 RACE populations for MSA \n\n");
	    
	    for(i = 0; i < bottomNumbersRace.length; i++)
	    {
            for(int j = 0; j < 5; j ++)
            {
            	WriteTo("./outputReport.txt",bottomNumbersRace[i][j] + "\t");
                
                
            }
            WriteTo("./outputReport.txt", "\n");
        }
	}
	catch(FileNotFoundException e){
	    e.printStackTrace();
	}
    }
    public static void main(String[] args){
	try{
	    ReadFromWriteToFile rwFile = new ReadFromWriteToFile();
	    String fileName = "./finalData.txt";
	    String keyword = " MSA";
	    
	    rwFile.Read_From(fileName, keyword);
	}catch(IOException e){
	    e.printStackTrace();
	}
    }
}
