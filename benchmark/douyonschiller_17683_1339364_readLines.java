/**
* This program reads a file containing text.
* @ Schiller Douyon 
* 2023-05-07
*/ 
import java.io.FileReader;
import java.io.File;
import java.io. FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readLines
{
public static void main(String[] args) throws FileSystemNotFoundException
{
int ln = 1;
Scanner in = new Scanner(System.in); 
// taking input from the keyboard
System.out.print("i/p File: ");
String inFile = in.next();
System.out.print("o/p File: ");
String outFile = in.next();
ArrayList <String> text = new ArrayList<>(String);
 FileReader rd = new 
 FileReader("input.txt"); 
// reading in File
Scanner in2 = new Scanner(rd);
PrintWriter outf = new 
PrintWriter("outFile.txt");
//writing output File using printWriter
while (in.hasNextLine()) 
// iterating at the end of the last line from the first line
{
String a = in.nextLine(); 
outFile.println("/* " + ln + " */ " + a);
ln++; 
//here incrementing the line number
}
outFile.close(); 
// closing the output File
                      
}
}



