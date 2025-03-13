import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Program that reads in a song from a .txt file and adds a number in front of each line
 * then prints it back to another .txt file called songrepeat.txt.
 * Author: Clinton Hays
 */

public class repeatSong {
    public static void main(String[] args) throws IOException
    {
/** declares filename variable and sets filename inside. */
Scanner in = new Scanner(System.in);
System.out.println("Please Enter filename with Song lyrics:");
String fileName = in.nextLine();

    
/** Declares line and sets to null*/

String line = null;

/** This actually reads file and loads text in buffer */
FileReader fileReader = new FileReader(fileName);
BufferedReader bufferedReader = new BufferedReader(fileReader);

/** Declaring counter */
int i = 1;
/**Create txt file to repeat song into */
System.out.println("Please enter output filename,needs to be .txt file:");
String fileprnt = in.nextLine();
PrintWriter writer = new PrintWriter(fileprnt, "UTF-8");



/** while line doesn't equal null then the loop first checks to see if line has characters.
 * If so then it prints the number specified in instructions in front of the song line. 
 * If the loop detects no charaters it skips the write. This loop also writes the song
 * characters on every other line. 
 * This loop also contains test outputs to the console so I can see what will be written to file songrepeat.txt.
 */

while((line = bufferedReader.readLine()) != null) {
    if(!line.isEmpty()){
    writer.println("/* "+i+" */ "+line);
    writer.println();
    System.out.println();
    System.out.println("/* "+i+" */ "+line); 
    i++;
}   
}
/**  closes the file*/
bufferedReader.close(); 
/** closes writer */
writer.close();       
}
    
}
    

