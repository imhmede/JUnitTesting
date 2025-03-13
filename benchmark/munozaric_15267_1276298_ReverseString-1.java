//AricJMunoz
//PA10
//April72023

import java.util.*;

class ReverseString {
/* Function to print reverse of the passed string */
static void reverse(String str) {
if ((str == null) || (str.length() <= 1)) //if string is null or string is of single character, simply print it
System.out.println(str);
else {
System.out.print(str.charAt(str.length() - 1)); //printing last character of string
reverse(str.substring(0, str.length() - 1)); //recursive calls to same function
}
}
/* Driver program to test above function */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string");
    String str = sc.nextLine();
    System.out.println("Reverse of string is ");
    reverse(str);
    }
    }

