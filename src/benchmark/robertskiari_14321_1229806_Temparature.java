/**
  * this program that reads a temperature and the letter C for Celsius or F for Fahrenheit.
  * The program prints whether water is liquid, solid, or gaseous at the given temprature at sea level.
  *@Kiari Roberts
  *@2023-03-16
*/


import java.util.Scanner;

public class Temparature{




public static void main(String[] args) {
try (Scanner scan = new Scanner(System.in)) {
    System.out.print("Enter a temperature:");
    String temperature= scan.next();
    getWaterState(temperature);
    System.out.print("Enter the scale of the temp:");
    scan.next();
}

}

private static void getWaterState(String temperature) {
}

int length=Temparature.length();
char tempFormat=Temparature.charAt(length-1);
int temp=Integer.parseInt(Temparature.substring(0,length-1));
 {
    if (scale.equalsIgnoreCase("C"))
if(temp>100){
System.out.println("GAS");
}
if(temp>=0 && temp<=100){
System.out.println("LIQUID");
}
else{
System.out.println("SOLID");
}

if (scale.equalsIgnoreCase("F"))

if(temp>212){
System.out.println("GAS");
}
if(temp>0 && temp<=100){
System.out.println("LIQUID");
}
else{
System.out.println("SOLID");
}

System.out.println("Invalid Temperature Entered");
}
private static String substring(int i, int j) {
    return null;
}
private static char charAt(int i) {
    return 0;
}
private static int length() {
    return 0;
}

}






