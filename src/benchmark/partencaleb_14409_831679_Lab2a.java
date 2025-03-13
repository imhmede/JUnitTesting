/**
Lab2a
Author: Caleb Parten
Class: CS123
Purpose: To read string, make into integer and break into individual charectors of value "16384"
Date: 9/13/2022
*/
import java.util.Scanner;
class Lab2a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    String str;    
    System.out.print("Enter your Integer(10 digits max): ");
    num = /*16384;*/sc.nextInt();
    sc.close();
    str = Integer.toString(num);
    for(int i = 0; str.length() > i; i++){
      System.out.print("Digit "+(i+1)+" is "+str.charAt(i)+"\n");
    }
  /*           \/If not using for loop\/
    System.out.println("Digit 1 is "+str.charAt(1));
    System.out.println("Digit 2 is "+str.charAt(2));
    System.out.println("Digit 3 is "+str.charAt(3));
    System.out.println("Digit 4 is "+str.charAt(4));
    System.out.println("Digit 5 is "+str.charAt(5));
  */
  }
}
