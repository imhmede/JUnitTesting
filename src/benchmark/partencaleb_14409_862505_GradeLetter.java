/**
Author: Caleb Parten
Class: CS123
Purpose: Find the letter value of grades inputed
Date: 9/29/2022
*/
import java.util.Scanner;
class GradeLetter {
    public static void main(String[] args) {
        double grade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade value: ");
        grade = sc.nextDouble();
              if(grade>=90){
            System.out.print("Grade letter: A\n");
        }else if(grade>=80){
            System.out.print("Grade letter: B\n");
        }else if(grade>=70){
            System.out.print("Grade letter: C\n");
        }else if(grade>=60){
            System.out.print("Grade letter: D\n");
        }else{
            System.out.print("Grade letter: F\n");
        }
    }
}
