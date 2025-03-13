import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
* This program reads a file containing two columns of floating-point numbers.
* @ Schiller Douyon 
* 2023-05-04
*/ 

public class AverageFloatingNumber
{
public static void main(String argv[]) throws FileNotFoundException
{
String inputFile;
String outputFile;
try
{
if(argv.length<2)
{
Scanner in=new Scanner(System.in);
System.out.println("enter the name of the file including the path where it is located: ");
inputFile=in.nextLine();
System.out.println("enter input file name: ");
outputFile=in.nextLine();
}
else
{
inputFile=argv[0];
outputFile=argv[1];
}
BufferedReader br = new BufferedReader (new FileReader (inputFile));
BufferedWriter bw = new BufferedWriter (new FileWriter (outputFile));
String line;
float column1Avaerage=0;
float column2Avaerage=0;
String floatValues[];
int i=0;
while((line=br.readLine())!=null)
{
floatValues=line.split(" ");
column1Avaerage+=Float.parseFloat(floatValues[0]);
column2Avaerage+=Float.parseFloat(floatValues[1]);
i++;
bw.write(line);
bw.newLine();
}
column1Avaerage/=i;
column2Avaerage/=i;
String result="column 1 average= "+Float.toString(column1Avaerage)+"\tcolumn 2 average= "+Float.toString(column2Avaerage);
System.out.println(result);
bw.write(result);
bw.close();
br.close();
}catch(FileNotFoundException ex)
{

}
catch(IOException ex)
{

}
}
}

