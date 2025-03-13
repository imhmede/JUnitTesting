import java.util.Scanner;
public class readAwordnumber
{
public static void main(String[] args )
{
Scanner in = new Scanner(System.in); //object of Scanner class
System.out.println(" Name:");
System.out.print("Enter a word:");//prompting user for a word 
System.out.println("Count the number of vowels of the the entered word:");
String vowel = in.next();//reading a string
if(checkInput(vowel)){//calling method and checking for inter or string
//converting String to lower case
vowel=vowel.toLowerCase();
int vowels = 0;
//this variable will store number of vowels
 //using for loop
for (int i = 0; i < vowel.length(); i++)
{
    char ch = vowel.charAt(i);//reading character at index i
    //cheching character
 If (ch == 'a'|| ch == 'o'|| ch == 'e'|| ch == 'u'|| ch == 'i' || ch == 'y' );
    vowels++;//when charater is vowel then increment the variable value vowels
}
//display the number of vowels
System.out.println("The word has" +vowels+" vowels.");
}
else
{
// when input is interger
System.out.println("Error: You have entered a number.My program is expecting a string");
}
}

//This method will check for the input is number of String
public static boolean checkInput(String vw)
{
//using try catch block
try 
{
int num = Integer.parseInt( vw);
return false;
//when input is integer 
} 
catch (NumberFormatException e) 
{

}
return true;
//return true when input is String
}
}