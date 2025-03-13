/*
Author: Vince Gnodle
Class: CS123
Assignment: Final Project
Purpose: Read from and write to a seperate file
*/

import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

/*
This is a program that parses data from a text file, processes it, and write 
data to another text file.
 */
public class ReadFromWriteToFile{
    
    public static void main(String[] args) throws IOException {
        try{
            
            String dataFile = "./finalData.txt";
            String layoutFile = "./finalLayout.txt";
            String outFile = "./outputReport.txt";
            String keyword = "   MSA";
            
            Scanner layout = new Scanner(new File(layoutFile));
            String[] columnIdentifier = new String[47];
            int i = 0;
            while(layout.hasNextLine() && i < 47){
                String line = layout.nextLine();
                    
                if(line.indexOf("  NA")!= -1){
                    String[] result = line.trim().split("  NA");
                    columnIdentifier[i] = result[0];
                    i++;
                }
                    
                else if(line.indexOf(" SUM")!= -1){
                    String[] result = line.trim().split(" SUM");
                    columnIdentifier[i] = result[0];
                    i++;
                }
                    
                else if(line.indexOf(" AGE")!= -1){
                    String[] result = line.trim().split(" AGE");
                    columnIdentifier[i] = result[0];
                    i++;
                }
                    
                else if(line.indexOf(" MED")!= -1){
                    String[] result = line.trim().split(" MED");
                    columnIdentifier[i] = result[0];
                    i++;
                }
                    
                else if(line.indexOf("ASUM")!= -1){
                    String[] result = line.trim().split("ASUM");
                    columnIdentifier[i] = result[0];
                    i++;
                }
                    
                else if(line.indexOf("RSUM")!= -1){    
                    String[] result = line.trim().split("RSUM");
                    columnIdentifier[i] = result[0];
                    i++;
                }
                    
                else if(line.indexOf("RACE")!= -1){
                    String[] result = line.trim().split("RACE");
                    columnIdentifier[i] = result[0];
                    i++;
                }
            }
            
            layout.close();
            
            Scanner data = new Scanner(new File(dataFile));
            ArrayList<String> geoId = new ArrayList<String>();
            double[][] ages = new double[13][280];
            double[][] races = new double[18][280];
            int a = 0;
            while(data.hasNextLine() && a < 280){
                String line = data.nextLine();
                if(line.indexOf(keyword)!= -1){
                    String[] result = line.split("   MSA");
                    String id = result[0];
                    geoId.add(id.trim());
                    line = result[1];
                    line = line.trim();
                    line = line.replaceAll("       ", ";");
                    line = line.replaceAll("      ", ";");
                    line = line.replaceAll("     ", ";");
                    line = line.replaceAll("    ", ";");
                    line = line.replaceAll("   ", ";");
                    line = line.replaceAll("  ", ";");
                    line = line.replaceAll(" ", ";");
                    
                    String[] tokens = line.split(";");
                    
                    int j = 0;
                    int k = 4;
                    
                    while(j < 13){
                        ages[j][a] = Double.parseDouble(tokens[k]);
                        j++;
                        k++;
                    }
                    
                    int l = 0;
                    int m = 26;
                    while(l < 18){
                        races[l][a] = Double.parseDouble(tokens[m]);
                        l++;
                        m++;
                    }
                    
                    a++;
                }
                
            }
            
            for (int f = 0; f < 13; f++) {
                Arrays.sort(ages[f]);
            }
            
            for (int g = 0; g < 13; g++) {
                Arrays.sort(races[g]);
            }
            
            
            String[] ageGroups = new String[13];
            int y = 5;
            for(int z = 0; z<ageGroups.length; z++){
                ageGroups[z] = columnIdentifier[y];
                y++;
            }
            
            String[] raceGroups = new String[18];
            int x = 28;
            for(int w = 0; w<raceGroups.length; w++){
                raceGroups[w] = columnIdentifier[x];
                x++;
            }
            
            PrintWriter out = new PrintWriter(new FileOutputStream(new 
            File(outFile), true));
            for(int b = 0; b < 13; b++){
                out.print("Top 3 population for " + ageGroups[b] + "\n");
                for(int c = 279; c > 276; c--){
                    out.print(ages[b][c] + "\n");
                }
                out.println();
                out.print("Bottom 3 population for " + ageGroups[b]+"\n");
                for(int c = 0; c < 3; c++){
                    out.print(ages[b][c] + "\n");
                }
                
                out.println();
            }
            
            for(int d = 0; d < 18; d++){
                out.print("Top 3 population for " + raceGroups[d] + "\n");
                for(int e = 279; e > 276; e--){
                    out.print(races[d][e] + "\n");
                }
                out.println();
                out.print("Bottom 3 population for " + raceGroups[d] + "\n");
                for(int e = 0; e < 3; e++){
                    out.print(races[d][e] + "\n");
                }
                
                out.println();
            }
            
            data.close();
            out.close();
            
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
    