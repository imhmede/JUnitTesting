//AricJayMunoz
//PA08
//March282023
//Multiply.java starts here

import java.util.*;

public class Multiply {
// Create the method
    static void mul_tables(int n){
        // Print the multiplication table using the for loop
        System.out.println("Multiplication Table for " + n);
        for(int i=1;i<12;i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Ask the user for input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // Call the method with the given input
        mul_tables(num);
        sc.close();
    }
  }