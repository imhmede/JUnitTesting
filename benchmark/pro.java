import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class pro{
void WriteTo(String fileName, String line) throws IOException{
try{
   PrintWriter out = new PrintWriter(new FileOutputStream(new File(fileName), true));
   out.write(line);
   out.write("\n");
   out.flush();
   out.close();
}catch(FileNotFoundException e){
   e.printStackTrace();
}
}

void Read_From(String fileName, String keyword) throws IOException{
try{
   Scanner in = new Scanner(new File(fileName));
   int i = 0;
   String[][] nums = new String[14][1000];
   String[][] race = new String[17][1000];
   Double[] large = {0.0,0.0,0.0,0.0,0.0};
   Double[] small = {2000000000.0,2000000000.0,2000000000.0,
   2000000000.0,2000000000.0};
   String[] region= new String[1000];
   for(int a=0; a<1000; a++)
   {
   region[a]= "0";
   for(int b=0; b<14; b++)
   {
   nums[b][a] = "0";
   race[b][a]="0";
   race[b+1][a]="0";
   race[b+2][a]="0";
   race[b+3][a]="0";
   }
   }
   while(in.hasNextLine()){
   String line = in.nextLine();
   String[] temp = line.split(keyword);
   if(line.indexOf(keyword)!=-1){
      String[] result = line.split(keyword);    
      line = result[1];
      line = line.replaceAll(" ",";");
      line = line.replaceAll("  ",";");
      line = line.replaceAll("   ",";");
      line = line.replaceAll("    ",";");
      line = line.replaceAll("     ",";");
      line = line.replaceAll("      ",";");
      line = line.replaceAll("       ",";");
      line = line.replaceAll("        ",";");
      line = line.replaceAll("         ",";");
      line = line.replaceAll("          ",";");
      line = line.replaceAll("           ",";");
      line = line.replaceAll("            ",";");
      line = line.replaceAll("             ",";");
      line = line.replaceAll("              ",";");
      String[] tokens = line.split(";");
      region[i] = result[0];
      nums[1][i] = tokens[4];
      nums[2][i] = tokens[5];
      nums[3][i] = tokens[6];
      nums[4][i] = tokens[7];
      nums[5][i] = tokens[8];
      nums[6][i] = tokens[9];
      nums[7][i] = tokens[10];
      nums[8][i] = tokens[11];
      nums[9][i] = tokens[12];//29 to 45
      nums[10][i] = tokens[13];
      nums[11][i] = tokens[14];
      nums[12][i] = tokens[15];
      nums[13][i] = tokens[16];
      //race[0][i] = tokens[29];
      //race[1][i] = tokens[30];
      //race[2][i] = tokens[31];
      //race[3][i] = tokens[32];
      //race[4][i] = tokens[33];
      //race[5][i] = tokens[34];
      //race[6][i] = tokens[35];
      //race[7][i] = tokens[36];
      //race[8][i] = tokens[37];
      //race[9][i] = tokens[38];
      //race[10][i] = tokens[39];
      //race[11][i] = tokens[40];
      //race[12][i] = tokens[41];
      //race[13][i] = tokens[42];
      //race[14][i] = tokens[43];
      //race[15][i] = tokens[44];
      //race[16][i] = tokens[45];
      String[][] tem = nums.clone();
      i++;
   }
   }
   for(int a=0; a<1000; a++)
     {
   for(int b=0; b<14; b++)
       {
         if((nums[b][a].equals("")||nums[b][a].equals(" "))!=true){
         if(((Double.parseDouble(nums[b][a])<small[4])&&(nums[b][a].equals("0")!=true))){
            small[4]= Double.parseDouble(nums[b][a]);
            Arrays.sort(small);
         }
         if((Double.parseDouble(nums[b][a])>large[0])){
            large[0]=Double.parseDouble(nums[b][a]);
            Arrays.sort(large);
         }
       }
     }
}
   int o=0,p=0;
   WriteTo("./outputReport.txt",keyword+" Top 5:");
   for(int c=4;c>=0;c--){
      for(int v=0;v<14;v++){
         for(int w=0;w<1000;w++){
    if((nums[v][w].equals("")||nums[v][w].equals(" "))!=true){
    if(Double.parseDouble(nums[v][w])==large[c]){
       o=v;
       p=w;
    }
    }
    }
    }
    if(o==1){WriteTo("./outputReport.txt",region[p]+"  under5  "+nums[o][p]);}
    if(o==2){WriteTo("./outputReport.txt",region[p]+"  5to9  "+nums[o][p]);}
    if(o==3){WriteTo("./outputReport.txt",region[p]+"  10to14  "+nums[o][p]);}
    if(o==4){WriteTo("./outputReport.txt",region[p]+"  15to19  "+nums[o][p]);}
    if(o==5){WriteTo("./outputReport.txt",region[p]+"  20to24  "+nums[o][p]);}
    if(o==6){WriteTo("./outputReport.txt",region[p]+"  25to34  "+nums[o][p]);}
    if(o==7){WriteTo("./outputReport.txt",region[p]+"  35to44  "+nums[o][p]);}
    if(o==8){WriteTo("./outputReport.txt",region[p]+"  45to54  "+nums[o][p]);}
    if(o==9){WriteTo("./outputReport.txt",region[p]+"  55to59  "+nums[o][p]);}
    if(o==10){WriteTo("./outputReport.txt",region[p]+"  60to64  "+nums[o][p]);}
    if(o==11){WriteTo("./outputReport.txt",region[p]+"  65to74  "+nums[o][p]);}
    if(o==12){WriteTo("./outputReport.txt",region[p]+"  75to84  "+nums[o][p]);}
    if(o==13){WriteTo("./outputReport.txt",region[p]+"  84over  "+nums[o][p]);}
    }
    o=0;
    p=0;
    WriteTo("./outputReport.txt",keyword+" Bottom 5:");
    for(int c=0;c<5;c++){
      for(int v=0;v<14;v++){
         for(int w=0;w<1000;w++){
    if((nums[v][w].equals("")||nums[v][w].equals(" "))!=true){
    if(Double.parseDouble(nums[v][w])==small[c]){
       o=v;
       p=w;
    }
    }
    }
    }
    if(o==1){WriteTo("./outputReport.txt",region[p]+"  under5  "+nums[o][p]);}
    if(o==2){WriteTo("./outputReport.txt",region[p]+"  5to9  "+nums[o][p]);}
    if(o==3){WriteTo("./outputReport.txt",region[p]+"  10to14  "+nums[o][p]);}
    if(o==4){WriteTo("./outputReport.txt",region[p]+"  15to19  "+nums[o][p]);}
    if(o==5){WriteTo("./outputReport.txt",region[p]+"  20to24  "+nums[o][p]);}
    if(o==6){WriteTo("./outputReport.txt",region[p]+"  25to34  "+nums[o][p]);}
    if(o==7){WriteTo("./outputReport.txt",region[p]+"  35to44  "+nums[o][p]);}
    if(o==8){WriteTo("./outputReport.txt",region[p]+"  45to54  "+nums[o][p]);}
    if(o==9){WriteTo("./outputReport.txt",region[p]+"  55to59  "+nums[o][p]);}
    if(o==10){WriteTo("./outputReport.txt",region[p]+"  60to64  "+nums[o][p]);}
    if(o==11){WriteTo("./outputReport.txt",region[p]+"  65to74  "+nums[o][p]);}
    if(o==12){WriteTo("./outputReport.txt",region[p]+"  75to84  "+nums[o][p]);}
    if(o==13){WriteTo("./outputReport.txt",region[p]+"  84over  "+nums[o][p]);}
    }
    Double[] large2 = {0.0,0.0,0.0,0.0,0.0};
    Double[] small2 = {2000000000.0,2000000000.0,2000000000.0,
    2000000000.0,2000000000.0};
/*for(int a=0; a<1000; a++)
     {
   for(int b=0; b<17; b++)
       {
         if((nums[b][a].equals("")||nums[b][a].equals(" "))!=true){
         if(((Double.parseDouble(nums[b][a])<small2[4])&&(nums[b][a].equals("0")!=true))){
            small2[4]= Double.parseDouble(nums[b][a]);
            Arrays.sort(small2);
         }
         if((Double.parseDouble(nums[b][a])>large2[0])){
            large2[0]=Double.parseDouble(nums[b][a]);
            Arrays.sort(large2);
         }
       }
     }
}
   o=0;
   p=0;
   WriteTo("./outputReport.txt",keyword+" Top 5:");
   for(int c=4;c>=0;c--){
      for(int v=0;v<17;v++){
         for(int w=0;w<1000;w++){
    if((nums[v][w].equals("")||nums[v][w].equals(" "))!=true){
    if(Double.parseDouble(nums[v][w])==large2[c]){
       o=v;
       p=w;
    }
    }
    }
    }
    if(o==0){WriteTo("./outputReport.txt",region[p]+"  under5  "+nums[o][p]);}
    if(o==1){WriteTo("./outputReport.txt",region[p]+"  under5  "+nums[o][p]);}
    if(o==2){WriteTo("./outputReport.txt",region[p]+"  5to9  "+nums[o][p]);}
    if(o==3){WriteTo("./outputReport.txt",region[p]+"  10to14  "+nums[o][p]);}
    if(o==4){WriteTo("./outputReport.txt",region[p]+"  15to19  "+nums[o][p]);}
    if(o==5){WriteTo("./outputReport.txt",region[p]+"  20to24  "+nums[o][p]);}
    if(o==6){WriteTo("./outputReport.txt",region[p]+"  25to34  "+nums[o][p]);}
    if(o==7){WriteTo("./outputReport.txt",region[p]+"  35to44  "+nums[o][p]);}
    if(o==8){WriteTo("./outputReport.txt",region[p]+"  45to54  "+nums[o][p]);}
    if(o==9){WriteTo("./outputReport.txt",region[p]+"  55to59  "+nums[o][p]);}
    if(o==10){WriteTo("./outputReport.txt",region[p]+"  60to64  "+nums[o][p]);}
    if(o==11){WriteTo("./outputReport.txt",region[p]+"  65to74  "+nums[o][p]);}
    if(o==12){WriteTo("./outputReport.txt",region[p]+"  75to84  "+nums[o][p]);}
    if(o==13){WriteTo("./outputReport.txt",region[p]+"  84over  "+nums[o][p]);}
    if(o==14){WriteTo("./outputReport.txt",region[p]+"  60to64  "+nums[o][p]);}
    if(o==15){WriteTo("./outputReport.txt",region[p]+"  65to74  "+nums[o][p]);}
    if(o==16){WriteTo("./outputReport.txt",region[p]+"  75to84  "+nums[o][p]);}
    if(o==17){WriteTo("./outputReport.txt",region[p]+"  84over  "+nums[o][p]);}
    }
    o=0;
    p=0;
    WriteTo("./outputReport.txt",keyword+" Bottom 5:");
    for(int c=0;c<5;c++){
      for(int v=0;v<17;v++){
         for(int w=0;w<1000;w++){
    if((nums[v][w].equals("")||nums[v][w].equals(" "))!=true){
    if(Double.parseDouble(nums[v][w])==small2[c]){
       o=v;
       p=w;
    }
    }
    }
    }
    if(o==0){WriteTo("./outputReport.txt",region[p]+"  under5  "+nums[o][p]);}
    if(o==1){WriteTo("./outputReport.txt",region[p]+"  under5  "+nums[o][p]);}
    if(o==2){WriteTo("./outputReport.txt",region[p]+"  5to9  "+nums[o][p]);}
    if(o==3){WriteTo("./outputReport.txt",region[p]+"  10to14  "+nums[o][p]);}
    if(o==4){WriteTo("./outputReport.txt",region[p]+"  15to19  "+nums[o][p]);}
    if(o==5){WriteTo("./outputReport.txt",region[p]+"  20to24  "+nums[o][p]);}
    if(o==6){WriteTo("./outputReport.txt",region[p]+"  25to34  "+nums[o][p]);}
    if(o==7){WriteTo("./outputReport.txt",region[p]+"  35to44  "+nums[o][p]);}
    if(o==8){WriteTo("./outputReport.txt",region[p]+"  45to54  "+nums[o][p]);}
    if(o==9){WriteTo("./outputReport.txt",region[p]+"  55to59  "+nums[o][p]);}
    if(o==10){WriteTo("./outputReport.txt",region[p]+"  60to64  "+nums[o][p]);}
    if(o==11){WriteTo("./outputReport.txt",region[p]+"  65to74  "+nums[o][p]);}
    if(o==12){WriteTo("./outputReport.txt",region[p]+"  75to84  "+nums[o][p]);}
    if(o==13){WriteTo("./outputReport.txt",region[p]+"  84over  "+nums[o][p]);}
    if(o==14){WriteTo("./outputReport.txt",region[p]+"  60to64  "+nums[o][p]);}
    if(o==15){WriteTo("./outputReport.txt",region[p]+"  65to74  "+nums[o][p]);}
    if(o==16){WriteTo("./outputReport.txt",region[p]+"  75to84  "+nums[o][p]);}
    if(o==17){WriteTo("./outputReport.txt",region[p]+"  84over  "+nums[o][p]);}
}*/
}catch(FileNotFoundException e){
e.printStackTrace();
}
}

public static void main(String[]args)throws IOException{
try{
   pro rwFile = new pro();
   String fileName = "./finalData.txt";
   String keyword = "DIV";
   //rwFile.Read_From(fileName, "SUM");
   //rwFile.Read_From(fileName, "MET");
   //rwFile.Read_From(fileName, "REG");
   rwFile.Read_From(fileName, "DIV");
   //rwFile.Read_From(fileName, "MSA");
   //rwFile.Read_From(fileName, "PMSA");
   rwFile.Read_From(fileName, "RES");
   rwFile.Read_From(fileName, "JUA");
   rwFile.Read_From(fileName, "HL");
   //rwFile.Read_From(fileName, "OTSA");
   //rwFile.Read_From(fileName, "ANVSA");
   //rwFile.Read_From(fileName, "TDSA");
   //rwFile.Read_From(fileName, "SRES");
   //rwFile.Read_From(fileName, "SDAISA");
   //rwFile.Read_From(fileName, "ST");
   //rwFile.Read_From(fileName, "TER");
   //rwFile.Read_From(fileName, "DIST");
}catch(FileNotFoundException e){
e.printStackTrace();
}
}
}
