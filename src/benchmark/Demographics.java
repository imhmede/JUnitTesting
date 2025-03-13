package Class_Project;

import java.io.File;
import java.util.Scanner;
import java.lang.Integer;
import java.io.FileWriter;

public class Demographics {

    public static String[] storeLayout(Scanner layoutScanner) {
        String layout;
        String[] splitLayout = new String[2];
        String[] layoutList = new String[13];
        int i = 0;
        while (layoutScanner.hasNextLine()) {
            layout = layoutScanner.nextLine();
            if (layout.indexOf(" AGE") != -1) {
                splitLayout = layout.split(" AGE");
                layoutList[i] = splitLayout[0].strip();
                i++;
            }

        }
        return layoutList;
    }

    public static String[] storeLocation(Scanner dataScanner) {
        String location;
        String[] locationList = new String[280];

        int i = 0;
        while (dataScanner.hasNextLine()){
            location = dataScanner.nextLine();
            if(location.indexOf(" MSA") != -1){
                locationList[i] = location.split(" MSA")[0].strip();
                i++;
            }
        }

        return locationList;
    }

    public static int[][] storePop(Scanner dataScanner) {
        String pop;
        String[] popStrings;
        int[][] popInt = new int[298][31];
        String[] popList = new String[50];
        String[] popListClean = new String[50];
        String popRepair;
        
        int i = 0, j = 0, k = 0;
        while (dataScanner.hasNextLine()) {
            pop = dataScanner.nextLine();
            if (pop.indexOf(" MSA") != -1) {
                popStrings = pop.split(" MSA");
                popList = popStrings[popStrings.length -1].split(" ");
                for (j = 0, k = 0; j < popList.length; j++) {
                    popList[j].strip();
                    if (popList[j] != "") {
                        popListClean[k++] = popList[j];
                    }
                }
                for (j = 3, k = 0; j < 16; j++) {
                    try {
                        popInt[i][k++] = Integer.parseInt(popListClean[j]);
                    } catch (Exception e) {
                        popRepair = popListClean[j].substring(0, popListClean[j].length() - 4);
                        popInt[i][k-1] = Integer.parseInt(popRepair);
                    }
                }
                for (j = 25, k = 13; j < 43; j++) {
                    try {
                        popInt[i][k++] = Integer.parseInt(popListClean[j]);
                    } catch (Exception e) {
                        popRepair = popListClean[j].substring(0, popListClean[j].length() - 4);
                        popInt[i][k-1] = Integer.parseInt(popRepair);
                    }
                }
            }
            i++;
        }
        return popInt;
    }

    public static String[] storeRace(Scanner raceScanner) {
        String[] raceList = new String[18];
        String[] splitRace = new String[2];
        String race;
        int i = 0;
        while (raceScanner.hasNextLine()) {
            race = raceScanner.nextLine();
            if (race.indexOf("RACE") != -1) {
                splitRace = race.split("RACE");
                raceList[i] = splitRace[0].strip();
                i++;
            }

        }
        return raceList;
    }

    public static void writeToTxt(  int[][] popInt, 
                                    String[] locationList, 
                                    String[] ageList,
                                    String[] raceList,
                                    int[] coord,
                                    String type) {
        try {
            FileWriter helloWrite = new FileWriter("Class_Project/outputReport.txt", true);
            if (type.equals("AGE")) {
                helloWrite.append(type + "\t" + 
                locationList[coord[0]-18] + "\t" + 
                ageList[coord[1]] + "\t" +
                popInt[coord[0]][coord[1]] + "\n");
            }
            else if (type.equals("RACE")){
                helloWrite.append(type + "\t" + 
                locationList[coord[0]-18] + "\t" + 
                raceList[coord[1]-13] + "\t" +
                popInt[coord[0]][coord[1]] + "\n"); 
            }
            
            helloWrite.close();
        } catch (Exception e) {
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
    }

    public static int getPop(String topAge, int[][] popInt) {
        int pop = 0, xInt = 0, yInt = 0;
        String[] xy = new String[2];
        xy = topAge.split(",");
        xInt = Integer.parseInt(xy[0]);
        yInt = Integer.parseInt(xy[1]);
        pop = popInt[xInt][yInt];
        return pop;
    }

    public static String makeString(int i, int j) {
        String xy;
        xy = Integer.toString(i).concat(",".concat(Integer.toString(j)));
        return xy;
    }

    public static int[] getCoord(String xy) {
        String[] string = new String[2];
        string = xy.split(",");
        int xInt = Integer.parseInt(string[0]);
        int yInt = Integer.parseInt(string[1]);
        int[] coord = {xInt, yInt};
        return coord;
    }

    public static String[] findTopAge(int[][] popInt) {
        int[][] tempPopInt = new int[popInt.length][popInt[0].length];
        for (int i = 0; i < tempPopInt.length; i++) {
            for (int j = 0; j < tempPopInt[i].length; j++) {
                tempPopInt[i][j] = popInt[i][j];
            }
        }
        String[] coord = {"0,0","0,0","0,0","0,0","0,0"};
        for (int k = 0; k < coord.length; k++) {
            for (int i = 18; i < tempPopInt.length; i++) {
                for (int j = 0; j < 13; j++) {
                    if (tempPopInt[i][j] > getPop(coord[k], tempPopInt)) {
                        coord[k] = makeString(i, j);
                    }
                }
            }
            tempPopInt[getCoord(coord[k])[0]][getCoord(coord[k])[1]] = 0;
        }
        return coord;
    }

    public static String[] findBottomAge(int[][] popInt) {
        int[][] tempPopInt = new int[popInt.length][popInt[0].length];
        for (int i = 0; i < tempPopInt.length; i++) {
            for (int j = 0; j < tempPopInt[i].length; j++) {
                tempPopInt[i][j] = popInt[i][j];
            }
        }
        String[] coord = {"18,0","18,0","18,0","18,0","18,0"};
        for (int k = 0; k < coord.length; k++) {
            for (int i = 18; i < tempPopInt.length; i++) {
                for (int j = 0; j < 13; j++) {
                    if (tempPopInt[i][j] < getPop(coord[k], tempPopInt)) {
                        coord[k] = makeString(i, j);
                    }
                }
            }
            tempPopInt[getCoord(coord[k])[0]][getCoord(coord[k])[1]] = 3519191;
        }
        return coord;
    }

    public static String[] findTopRace(int[][] popInt) {
        int[][] tempPopInt = new int[popInt.length][popInt[0].length];
        for (int i = 0; i < tempPopInt.length; i++) {
            for (int j = 0; j < tempPopInt[i].length; j++) {
                tempPopInt[i][j] = popInt[i][j];
            }
        }
        String[] coord = {"0,0","0,0","0,0","0,0","0,0"};
        for (int k = 0; k < coord.length; k++) {
            for (int i = 18; i < tempPopInt.length; i++) {
                for (int j = 13; j < 31; j++) {
                    if (tempPopInt[i][j] > getPop(coord[k], tempPopInt)) {
                        coord[k] = makeString(i, j);
                    }
                }
            }
            tempPopInt[getCoord(coord[k])[0]][getCoord(coord[k])[1]] = 0;
        }
        return coord;
    }

    public static String[] findBottomRace(int[][] popInt) {
        int[][] tempPopInt = new int[popInt.length][popInt[0].length];
        for (int i = 0; i < tempPopInt.length; i++) {
            for (int j = 0; j < tempPopInt[i].length; j++) {
                tempPopInt[i][j] = popInt[i][j];
            }
        }
        String[] coord = {"18,0","18,0","18,0","18,0","18,0"};
        for (int k = 0; k < coord.length; k++) {
            for (int i = 18; i < tempPopInt.length; i++) {
                for (int j = 13; j < 31; j++) {
                    if (tempPopInt[i][j] < getPop(coord[k], tempPopInt)) {
                        coord[k] = makeString(i, j);
                    }
                }
            }
            tempPopInt[getCoord(coord[k])[0]][getCoord(coord[k])[1]] = 3519191;
        }
        return coord;
    }

    public static void main(String[] args) {
        // Pulling files
        File dataFile = new File("Class_Project/finalData.txt");
        File layoutFile = new File("Class_Project/finalLayout.txt");
        Scanner locationScanner = null, 
                ageScanner = null, 
                popScanner = null,
                raceScanner = null;

        // Reading files
        try {
            locationScanner = new Scanner(dataFile);
            ageScanner = new Scanner(layoutFile);
            popScanner = new Scanner(dataFile);
            raceScanner = new Scanner(layoutFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Opening output file
        try {
            FileWriter outputReport = new FileWriter("Class_Project/outputReport.txt", false);
            outputReport.close();
            

        } catch (Exception e) {
            System.out.println("An Error Occurred Opening File:");
            e.printStackTrace();
        }
        
        //Collecting data
        String[] ageList = storeLayout(ageScanner);
        String[] locationList = storeLocation(locationScanner);
        int[][] popInt = storePop(popScanner);
        String[] raceList = storeRace(raceScanner);

        //Parsing and printing data
        String[] topAge = findTopAge(popInt);
        String type = "AGE";
        for (String string : topAge) {
            int[] xy = new int[2];
            xy = getCoord(string);
            writeToTxt(popInt, locationList, ageList, raceList, xy, type);
        }
    
        String[] bottomAge = findBottomAge(popInt);
        type = "AGE";
        for (String string : bottomAge) {
            int []xy = new int[2];
            xy = getCoord(string);
            writeToTxt(popInt, locationList, ageList, raceList, xy, type);
        }

        String[] topRace = findTopRace(popInt);
        type = "RACE";
        for (String string : topRace) {
            int[] xy = new int[2];
            xy = getCoord(string);
            writeToTxt(popInt, locationList, ageList, raceList, xy, type);
        }

        String[] bottomRace = findBottomRace(popInt);
        type = "RACE";
        for (String string : bottomRace) {
            int[] xy = new int[2];
            xy = getCoord(string);
            writeToTxt(popInt, locationList, ageList, raceList, xy, type);
        }

      
   
        locationScanner.close();
        popScanner.close();
        ageScanner.close();
        
    }
}
