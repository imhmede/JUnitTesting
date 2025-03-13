import java.util.Scanner;
public class LettertoNumber
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter Grade:");
grade = in.nextLine();
Double numericValue=0;
String grade = "";
if(grade.equal("A"))
{
NumericValue=4;
}
if(grade.equal("B"))
{
NumericValue=3;
}
if(grade.equal("C"))
{
NumericValue=2;
}
if(grade.equal("D"))
{
NumericValue=1;
}
if(grade.equal("F"))
{
NumericValue=0;
}
System.out.println("Letter not in grading system");
}
return numericValue;
}
}

