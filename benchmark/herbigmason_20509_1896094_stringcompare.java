// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class stringcompare {
    public static void main(String[] args) {
String string1;
String string2;
Scanner stringinput = new Scanner(System.in);
string1 = stringinput.nextLine();
string2 = stringinput.nextLine();

if (string1.equals(string2)) 
{
    System.out.println("They are identical.");
}
else 
{
    System.out.println("They are not identical.");
}
    }
}