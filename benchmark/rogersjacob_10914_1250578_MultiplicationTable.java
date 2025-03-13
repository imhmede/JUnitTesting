//Jacob Rogers
//CS123P
//March 28, 2023

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 12:");
        int num = sc.nextInt();
        
        if (num >= 1 && num <= 12) {
            for (int i = 0; i <= 12; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
        } else {
            System.out.println("Invalid input. Number should be between 1 and 12.");
        }
        
        sc.close();
    }
}